package Chapter_04;
import java.util.Scanner;

/* 4.20(Process a string) Write a program that prompts the user to enter a string and displays its length and its
 * first character.
 */

public class Exercise4_20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String userInput = input.next();

        System.out.println("The string you entered is " + userInput);
        System.out.println("The string's length is :" + userInput.length());
        System.out.println("The first character in the string you entered is " + userInput.charAt(0));
    }
}
