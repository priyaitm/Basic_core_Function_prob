package ClassProblem;

public class ReverseNum {
   void    reverseNum(int num) {
       int o_num =num;
       int last_digit;
       int rev = 0;

       while (num != 0) {                 // 121
           last_digit = num % 10;          // find last digit
           rev = 10 * rev + last_digit;
           num = num / 10;
       }
       if(o_num == rev){
           System.out.println(" is Palindrome");
       }else {System.out.println("is not Palindrome");}

       //return rev;
   }

    public static void main(String[] args) {
        ReverseNum reverseNumObj = new ReverseNum();
        reverseNumObj.reverseNum(121);

    }


}
