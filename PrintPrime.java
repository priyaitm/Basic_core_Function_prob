package ClassProblem;

public class PrintPrime {
    public static void main(String[] args) {
        PrintPrime printPrimeObj = new PrintPrime();
        printPrimeObj.printPrime(2,5);
    }

    void printPrime(int num, int count){     // 2 to 5

        while(count>=0){           //5   4

            int flag =0;   //3
            for(int i =2; i<num; i++)
            if(num % i == 0 ){ //   2%2 == 0 2%3=!0
               flag++;          //  1
               break;
            }
            if(flag == 0){
                System.out.println(num);
            }
            num++;
            count--;
        }

        // System.out.println("Number of iteration : +number");
    }

    }


