package Chapter_05;

/* 5.24 (Sum a series) Write a program to sum the following series:
 * 1/3 + 3/5 + 5/7 + 7/9 + 9/11 + 11/13 + ... + 95/97 + 97/99
 */

public class Exercise5_24 {
    public static void main(String[] args) {
        double sum = 0;

        for (int numerator = 1; numerator <= 97; numerator += 2) {
            sum += numerator / (numerator + 2.0);
        }
        System.out.println(sum);
    }
}
