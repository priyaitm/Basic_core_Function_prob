package ClassProblem;
public class CheckPrime {
    public static void main(String[] args) {

        CheckPrime checkprime = new CheckPrime();
        checkprime.checkPrime(13);
    }

    void checkPrime(int Num) {
        int count = 0;
        for (int i = 2; i < Math.sqrt(Num) + 1; i++) {
            if (Num % i == 0) {
                count++;
                break;
            }
        }
        if (count == 0) {
            System.out.println("is Prime");
        } else {
            System.out.println("is not Prime");
        }
    }
}