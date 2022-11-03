package Chapter_04;
import java.util.Scanner;

/* 4.26(Financial application: monetary units) Rewrite Listing 2.10, ComputeChange. java, to fix the possible loss of
 * accuracy when converting a float value to an int value. Read the input as a string such as "11.56". Your program
 * should extract the dollar amount before the decimal point and the cents after the decimal amount using the
 * indexOf and substring methods.
 */

public class Exercise4_26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an amount in double, for example 11.56: ");
        String amount = input.next();

        int remainingAmount = Integer.parseInt(amount.substring(amount.indexOf(".")));

        int dollars = Integer.parseInt(amount.substring(0, amount.indexOf(".")+1));
        remainingAmount %= 100;

        int quarters = remainingAmount / 25;
        remainingAmount %= 25;

        int dimes = remainingAmount / 10;
        remainingAmount %= 10;

        int nickels = remainingAmount / 5;
        remainingAmount %= 5;

        int pennies = remainingAmount;

        System.out.println("Your input of $" + amount + " consists of: ");
        System.out.println(dollars + (dollars == 1 ? " dollar" : " dollars"));
        System.out.println(quarters + (quarters == 1 ? " quarter" : " quarters"));
        System.out.println(dimes + (dimes == 1 ? " dime" : " dimes"));
        System.out.println(nickels + (nickels == 1 ? " nickel" : " nickels"));
        System.out.println(pennies + (pennies == 1 ? " penny" : " pennies"));
    }
}
