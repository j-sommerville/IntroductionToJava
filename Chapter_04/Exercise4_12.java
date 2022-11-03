package Chapter_04;
import java.util.Scanner;

/* 4.12(Hex to binary) Write a program that prompts the user to enter a hex digit and displays its corresponding binary
 * number. Here is a sample run:
 * Enter a hex digit: B
 * The binary value is 1011
 * Enter a hex digit: G
 * G is an invalid input
 */

public class Exercise4_12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a hex digit: ");
        String value = input.next();

        char val = Character.toUpperCase(value.charAt(0));



        if (val >= 'A' &&  val <= 'F') {
            int binary = val - 'A' + 10;
            System.out.println("The binary value of " + value.toUpperCase() + " is " + Integer.toBinaryString(binary));
        }
        else{
            System.out.println(value.toUpperCase() + " is an invalid input");
        }

    }
}
