package ClassProblem;

public class PrintFactorial {

    int printFactorial(int num){               //5
        int fact=1;
        for(int i =1; i<=num; i++){   //1     2     3     4        5
            fact = fact * i;          // 1   1*2    2*3    6*4     24*5
        }
        return fact;
    }

    public static void main(String[] args) {
        PrintFactorial printFactorialObj = new PrintFactorial();
        System.out.println(printFactorialObj.printFactorial(5));
    }

}
