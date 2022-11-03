package ChapterThree;
import java.util.Scanner;

/* 3.2 (Game: add three numbers) The program in Listing 3.1, AdditionQuiz.java, generates two integers and prompts the
 * user to enter the sum of these two integers. Revise the program to generate three single-digit integers and prompt the
 * user to enter the sum of these three integers.
 */

public class Exercise3_02 {
    public static void main(String[] args) {
        int digit1 = (int) (Math.random() * 10);
        int digit2 = (int) (Math.random() * 10);
        int digit3 = (int) (Math.random() * 10);

        double correctAnswer = digit1 + digit2 + digit3;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the sum of " + digit1 + ", " + digit2 + " and " + digit3 + ":");
        double userInput = input.nextDouble();

        if(userInput == correctAnswer){
            System.out.println("You are correct!");
        }
        else{
            System.out.println("You are incorrect.");
        }
    }
}
