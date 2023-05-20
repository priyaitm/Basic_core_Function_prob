package ClassProblem;

public class CheckArmstrong {
    String checkArmstrong(int num) {
        int O_num = num;
        int I_num =num;
        int digit_len = 0;
        int sum = 0;

        while (num != 0) {      // find length
            num = num / 10;
            digit_len++;
        }


        while (I_num != 0) {
            int digit = 1;
            int last_d = I_num % 10;          // find last digit
            for (int i = 1; i <= digit_len; i++) {

                digit = digit * last_d;
            }
            sum = sum + digit;
            I_num = I_num / 10;
        }
       // System.out.println(sum);
        if(O_num == sum){
            return "Armstrong";
        }else return "is not Armstrong";
    }

    public static void main(String[] args) {
        CheckArmstrong checkArmstrongObj = new CheckArmstrong();
        System.out.println(checkArmstrongObj.checkArmstrong(153));

    }
}
