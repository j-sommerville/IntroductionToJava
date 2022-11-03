package ChapterFive;

/* 5.25(Compute PI) You can approximate PI by using the following series:
 * PI = 4 ( 1 - 1/3 + 1/5 - 1/7 + 1/9 - 1/11 + ... + (-1) ^ i + 1 /  2i - 1)
 * Write a program that displays the PI value for i = 10000, 20000, ... , and 100000.
 */

public class Exercise5_25 {
    public static void main(String[] args) {
        double pi = 0;


        for (int i = 1; i <= 100000; i++) {
            pi += Math.pow(-1 , i + 1) / (2 * i - 1);

            if (i == 10000){
                System.out.print("PI at 10,000 is ");
                System.out.println(pi * 4);
            }

            if (i == 20000){
                System.out.print("PI at 20,000 is ");
                System.out.println(pi * 4);
            }

            if (i == 100000){
                System.out.print("PI at 100,000 is ");
                System.out.println(pi * 4);
            }
        }
    }
}
