package Chapter_05;

/* 5.20(Display prime numbers between 2 and 1,000) Modify Listing 5.15 to display all the prime numbers between 2 and
 * 1,000, inclusive. Display eight prime numbers per line. Numbers are separated by exactly one space.
 */

public class Exercise5_20 {
    public static boolean isPrime(int n) {
        boolean isPrime = true;

        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }

    public static void main(String[] args) {
        int num = 2;
        int count = 0;
        int number = 2;

        for (int i = 2; i <= 1000; i++) {
            if (isPrime(i)) {
                count++;
                System.out.print(i + " ");
                if(count == 8){
                    count = 0;
                    System.out.println();
                }
            }
        }
    }
}