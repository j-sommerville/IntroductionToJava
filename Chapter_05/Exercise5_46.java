package Chapter_05;
import java.util.Scanner;

/* 5.46 (Reverse a string) Write a program that prompts the user to enter a string and displays the string in reverse
 * order.
 * Enter a string: ABCD
 * The reversed string is DCBA
 */

public class Exercise5_46 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter an string: ");
        String x = input.next();

        String j = "";

        for (int k = x.length() - 1; k >= 0; k--){
            j += x.charAt(k);
        }
        System.out.println("The reverse string of " + x + " is " + j + " ");
    }
}
