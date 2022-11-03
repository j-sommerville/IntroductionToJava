package ChapterFive;

/* 5.19(Display numbers in a pyramid pattern) Write a nested for loop that prints the following output:
 *                             1
 *                         1   2   1
 *                     1   2   4   2   1
 *                 1   2   4   8   4   2   1
 *             1   2   4   8  16   8   4   2   1
 *         1   2   4   8  16  32  16   8   4   2   1
 *     1   2   4   8  16  32  64  32  16   8   4   2   1
 * 1   2   4   8  16  32  64 128  64  32  16   8   4   2   1
 */

public class Exercise5_19 {
    public static void main(String[] args) {
        for(int row = 1; row <= 8; row++){
            for(int space = 1; space <= 8 - row; space++){
                System.out.print("    ");
            }

            for(int leftNumbers = 0; leftNumbers < row; leftNumbers++){
                System.out.printf("%4d", (int) Math.pow(2, leftNumbers));
            }

            for(int rightNumbers = (row - 2); rightNumbers >= 0; rightNumbers--){
                System.out.printf("%4d", (int) Math.pow(2 , rightNumbers));
            }
            System.out.println();
        }
    }
}
