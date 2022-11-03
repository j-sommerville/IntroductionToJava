package Chapter_05;
import java.util.Scanner;

/* 5.17(Display pyramid) Write a program that prompts the user to enter an integer from 1 to 15 and displays a pyramid,
 * as shown in the following sample run:
 * Enter the number of lines: 7
 *                                    1
 *                                 2  1  2
 *                              3  2  1  2  3
 *                           4  3  2  1  2  3  4
 *                        5  4  3  2  1  2  3  4  5
 *                     6  5  4  3  2  1  2  3  4  5  6
 *                  7  6  5  4  3  2  1  2  3  4  5  6  7
 */

public class Exercise5_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of lines as an integer (must be between 1 and 15): ");
        int lines = input.nextInt();

        for(int i = 1; i <= lines; i++){
            for(int space = 0; space < lines - i; space++){
                System.out.print("  ");
            }

            for(int leftNumbers = lines - (lines - i); leftNumbers >= 2; leftNumbers--){
                System.out.print(leftNumbers + " ");
            }

            for(int rightNumbers = 1; rightNumbers <= i; rightNumbers++){
                System.out.print(rightNumbers + " ");
            }
            System.out.println();
        }
    }
}
