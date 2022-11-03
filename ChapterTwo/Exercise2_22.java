package ChapterTwo;
import java.util.Scanner;

/* 2.22 (Financial application: monetary units) Rewrite Listing 2.10, ComputeChange.java, to fix the possible loss of
 * accuracy when converting a double value to an int value. Enter the input as an integer whose last two digits
 * represent the cents. For example, the input 1156 represents 11 dollars and 56 cents.
 */

public class Exercise2_22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an amount in double, for example 11.56: ");
        double amount = input.nextDouble();


        int remainingCents = (int)(amount * 100);
        int dollars = remainingCents / 100;
        int cents = remainingCents %= 100;

        System.out.println("Your input " + amount + " represents " + dollars + " dollars and " + cents + " cents.");
    }
}

