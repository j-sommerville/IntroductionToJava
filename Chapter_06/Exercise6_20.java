package Chapter_06;
import java.util.Scanner;

/* 6.20 (Count the letters in a string) Write a method that counts the number of letters in a string using the
 * following header:
 * public static int countLetters(String s)
 * Write a test program that prompts the user to enter a string and displays the number of letters in the string.
 */

public class Exercise6_20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a String: ");
        String value = input.next();

        System.out.println("The number of letters in string \"" + value + "\" is " + countLetters(value));
    }

    public static int countLetters(String s){
        int sum = 0;
        for(int i = 0; i <= s.length() - 1; i++){
            char x = s.charAt(i);
            if (Character.isLetter(x)){
                sum++;
            }
        }
        return sum;
    }
}
