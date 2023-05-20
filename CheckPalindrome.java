package ClassProblem;

public class CheckPalindrome {

    public static void main(String[] args) {
        CheckPalindrome obj = new CheckPalindrome();
        obj.checkPalindrome("mam");
    }

    void checkPalindrome(String name){
        String rev = "";
        for(int i = 0; i <name.length(); i++){


            char ch = name.charAt(i);
            rev = ch + rev;
        }
        if(name.equalsIgnoreCase(rev)){
            System.out.println("is palindrome");
        }
        else {
            System.out.println("is not palindrome");
        }

    }

}
