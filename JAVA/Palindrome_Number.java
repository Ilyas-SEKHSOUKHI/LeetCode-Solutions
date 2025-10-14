//9.Palindrome Number
class Palindrome_Number {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        if(x==0){
            return true;
        }
        // Inverser le chiffre
        int original = x;
        int Inverser = 0;
        while (x!=0) {
            int chiffre = x%10; // Dernier chiffre
            Inverser = Inverser*10+chiffre; // Construction du nombre Inverse
            x=x/10; // Enlever le dernier chiffre
        }
        //System.out.println(Inverser);
        if(original==Inverser){
            return true;
        }else{
            return false;
        }

    }

    public void main(String[] args) {
        System.out.println(isPalindrome(121));
    }
}