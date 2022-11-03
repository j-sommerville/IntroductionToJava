package Chapter_04;
import java.util.Scanner;

/* 4.11(Decimal to hex) Write a program that prompts the user to enter an integer between 0 and 15 and displays its
 * corresponding hex number. Here are some sample runs:
 * Enter a decimal value (0 to 15): 11
 * The hex value is B
 * Enter a decimal value (0 to 15): 5
 * The hex value is 5
 * Enter a decimal value (0 to 15): 31
 * 31 is an invalid input
 */

public class Exercise4_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a decimal value between 0 to 15: ");
        int value = input.nextInt();

        String decimal = Integer.toHexString(value);

        if (value >= 0 && value <= 15){
            System.out.println("The hex value of " + value + " is " + decimal.toUpperCase());
        }
        else{
            System.out.println(value + " is an invalid input");
        }

    }
}
