package Chapter_06;
import java.util.Scanner;

/* 6.23 (Occurrences of a specified character) Write a method that finds the number of occurrences of a specified
 * character in a string using the following header:
 * public static int count(String str, char a)
 * For example, count("Welcome", 'e') returns 2. Write a test program that prompts the user to enter a string followed
 * by a character and displays the number of occurrences of the character in the string.
 */

public class Exercise6_23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String s = input.next();

        System.out.println("Enter a character: ");
        char c = input.next().charAt(0);

        System.out.println("You entered string: \"" + s + "\" and character: \'" + c + "\'");

        System.out.println("Character: \'" + c + "\' occurs " + count(s, c) + " times in string: \"" + s + "\"");
    }

    public static int count(String str, char a){
        int count = 0;

        for(int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == a) {
                count++;
            }
        }

        return count;
    }

}
