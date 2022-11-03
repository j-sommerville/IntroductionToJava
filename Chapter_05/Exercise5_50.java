package Chapter_05;
import java.util.Scanner;

/* 5.50 (Count uppercase letters) Write a program that prompts the user to enter a string and displays the number of
 * the uppercase letters in the string.
 * Enter a string: Welcome to Java
 * The number of uppercase letters is 2
 */

public class Exercise5_50 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String x = input.nextLine();

        int count = 0;

        for(int i = 0; i <= x.length() - 1; i++){
            char c = x.charAt(i);
            if((int) c >= 65 && c <= 90){
                count++;
            }
        }
        System.out.println("The number of Uppercase letters is " + count);
    }
}
