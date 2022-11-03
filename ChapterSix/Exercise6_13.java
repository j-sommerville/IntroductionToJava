package ChapterSix;

/* 6.13 (Sum series) Write a method to compute the following series:
 * m(i) = 1/2 + 2/3 + ... + i/i+1
 * Write a test program that displays the following table:
 * i         m(i)
 * 1         0.5000
 * 2         1.1667
 * ...
 * 19        16.4023
 * 20        17.3546
 */

public class Exercise6_13 {
    public static void main(String[] args) {
        System.out.println("i          m(i)");
        System.out.println("____________________");

        for(int num = 1; num <= 20; num++){
            System.out.printf("%-2d", num);
            System.out.printf("%16.4f", sumSeries(num));
            System.out.println();
        }
    }

    public static double sumSeries(int n){
        double sum = 0;
        for(int num = 1; num <= n; num ++){
            sum += 1.0 * num / (num + 1);
        }
        return sum;
    }
}
