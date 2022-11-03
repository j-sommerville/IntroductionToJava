package Chapter_03;
import java.util.Scanner;

/* 3.14 (Game: heads or tails) Write a program that lets the user guess whether the flip of a coin results in heads or
 * tails. The program randomly generates an integer 0 or 1, which represents head or tail. The program prompts the user
 * to enter a guess and reports whether the guess is correct or incorrect.
 */

public class Exercise3_14 {
    public static void main(String[] args) {
        int random = (int) (0 + (Math.random() * (1 - 0 + 1)));

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a guess for heads or tails. Enter 0 for heads and 1 for tails: ");
        int guess = input.nextInt();

        if(random == guess){
            System.out.println("Your guess is correct!");
        }
        if(guess > 1){
            System.out.println("Enter 0 for heads and 1 for tails: ");
        }
        else{
            System.out.println("Your guess is incorrect.");
        }

    }
}
