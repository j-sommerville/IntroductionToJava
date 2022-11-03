package ChapterFive;
import java.util.Scanner;

/* 5.48 (Process string) Write a program that prompts the user to enter a string and displays the characters at odd
 * positions. Here is a sample run:
 * Enter a string: Beijing Chicago
 * BiigCiao
 */

public class Exercise5_48 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String x = input.nextLine();

        for(int i = 0; i <= x.length()-1; i += 2){
            System.out.print(x.charAt(i));
        }
    }
}
