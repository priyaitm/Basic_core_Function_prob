package ClassProblem;

public class FibonacciSeries {

    static void printFib(int num){
         int n1=0;
         int n2=1;
         int fib=0;

        System.out.print(+n1+" " +n2);

        for(int i = 1; i< num ; i++) {

            fib = n1 + n2;
            n1 = n2;
            n2 = fib;

            System.out.print(" " +fib);
        }
    }

    public static void main(String[] args) {
        printFib(7);
    }


}
