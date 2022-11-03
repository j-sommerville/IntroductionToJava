package Chapter_05;

/* 5.23 (Demonstrate cancellation errors) A cancellation error occurs when you are manipulating a very large number
 * with a very small number. The large number may cancel out the smaller number. For example, the result of
 * 100000000.0 + 0.000000001 is equal to 100000000.0. To avoid cancellation errors and obtain more accurate results,
 * carefully select the order of computation. For example, in computing the following series, you will obtain more
 * accurate results by computing from right to left rather than from left to right:
 *                                        1 + 1/2 + 1/3 + ... + 1/n
 * Write a program that compares the results of the summation of the preceding series, computing from left to right
 * and from right to left with n = 50000.
 */

public class Exercise5_23 {
    public static void main(String[] args) {

        double leftToRight = 0;
        for(int n = 1; n <= 50000; n++){
            leftToRight += 1.0 / n;
        }

        double rightToLeft = 0;
        for(int n = 50000; n >= 1; n--){
            rightToLeft += 1.0 / n;
        }

        System.out.println("Left to right: " + leftToRight);
        System.out.println("Right to left: " + rightToLeft);
    }
}
