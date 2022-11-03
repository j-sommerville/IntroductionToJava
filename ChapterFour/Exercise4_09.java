package ChapterFour;
import java.util.Scanner;

/* 4.9(Find the Unicode of a character) Write a program that receives a character and displays its Unicode. Here is a
 * sample run:
 * Enter a character: E
 * The Unicode for the character E is 69
 */

public class Exercise4_09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a character: ");
        String character = input.next();

        int code = character.charAt(0);

        System.out.println("The Unicode for the character " + character + " is " + code);
    }
}
