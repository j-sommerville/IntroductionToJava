package Chapter_04;
import java.util.Scanner;

/* 4.15 (Phone key pads) The international standard letter/number mapping found on the telephone is shown below:
 * Write a program that prompts the user to enter a letter and displays its corresponding number.
 * Enter a letter: A
 * The corresponding number is 2
 * Enter a letter: a
 * The corresponding number is 2
 * Enter a letter: +
 * + is an invalid input
 */

public class Exercise4_15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a letter: ");
        String userInput = input.next().toUpperCase();

        char letter = userInput.charAt(0);

        if (userInput.length() > 1) {
            System.out.println("Enter only one letter");
        }

        if (letter == 'A' || letter == 'B' || letter == 'C') {
            System.out.println("The corresponding number is 2");
        } else if (letter == 'D' || letter == 'E' || letter == 'F') {
            System.out.println("The corresponding number is 3");
        } else if (letter == 'G' || letter == 'H' || letter == 'I') {
            System.out.println("The corresponding number is 4");
        } else if (letter == 'J' || letter == 'K' || letter == 'L') {
            System.out.println("The corresponding number is 5");
        } else if (letter == 'M' || letter == 'N' || letter == 'O') {
            System.out.println("The corresponding number is 6");
        } else if (letter == 'P' || letter == 'Q' || letter == 'R' || letter == 'S') {
            System.out.println("The corresponding number is 7");
        } else if (letter == 'T' || letter == 'U' || letter == 'V') {
            System.out.println("The corresponding number is 8");
        } else if (letter == 'W' || letter == 'X' || letter == 'Y' || letter == 'Z') {
            System.out.println("The corresponding number is 9");
        } else {
            System.out.println(letter + " is an invalid input");
        }
    }
}
