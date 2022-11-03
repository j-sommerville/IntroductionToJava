package ChapterThree;
import java.util.Scanner;

/* 3.7 (Financial application: monetary units) Modify Listing 2.10, ComputeChange .java, to display the nonzero
 * denominations only, using singular words for single units such as 1 dollar and 1 penny, and plural words for more than
 * one unit such as 2 dollars and 3 pennies.
 */

public class Exercise3_07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an amount in double format, for example 11.56: ");
        double amount = input.nextDouble();

        int remainingAmount = (int)(amount * 100);

        int dollars = remainingAmount / 100;
        remainingAmount %= 100;

        int quarters = remainingAmount / 25;
        remainingAmount %= 25;

        int dimes = remainingAmount / 10;
        remainingAmount %= 10;

        int nickels = remainingAmount / 5;
        remainingAmount %= 5;

        int pennies = remainingAmount;

        System.out.println("Your input of $" + amount + " consists of: ");
        System.out.println("  " + dollars + " dollars");
        System.out.println("  " + quarters + " quarters");
        System.out.println("  " + dimes + " dimes");
        System.out.println("  " + nickels + " nickels");
        System.out.println("  " + pennies + " pennies");

    }
}
