package ClassProblem;

import java.util.Scanner;

public class CheckPerfectNum {
    public static void main(String[] args) {

        CheckPerfectNum obj = new CheckPerfectNum();
         obj.checkPerfectNum(6);

    }
        void checkPerfectNum(int Num){
            int sum =0;
            for(int i = 1; i< Num; i++){
                if(Num%i==0){
                    sum=sum+i;
                }
            }
            if(sum == Num){
                System.out.println("is Perfect");
            }else {
                System.out.println("is not Perfect");
            }
        }
}
