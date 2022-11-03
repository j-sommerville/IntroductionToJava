package ChapterThree;
import java.util.Scanner;

/* 3.15(Game: lottery) Revise Listing 3.8, Lottery.java, to generate a lottery of a three-digit number. The program
 * prompts the user to enter a three-digit number and determines whether the user wins according to the following
 * rules:
 * 1. If the user input matches the lottery number in the exact order, the award is $10,000.
 * 2. If all digits in the user input match all digits in the lottery number, the award is $3,000.
 * 3. If one digit in the user input matches a digit in the lottery number, the award is $1,000.
 */

public class Exercise3_15 {
    public static void main(String[] args) {
        int randomGenerator = (int) (100 + (Math.random() * (1000 - 1 + 1)));

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a three-digit number: ");
        int guess = input.nextInt();

        int generatorDigit1 = randomGenerator / 100;
        int generatorDigit2 = (randomGenerator % 100) / 10;
        int generatorDigit3 = randomGenerator % 10;
        int guessDigit1 = guess / 100;
        int guessDigit2 = (guess % 100) / 10;
        int guessDigit3 = guess % 10;

        System.out.println("The lottery number is " + randomGenerator);

        if(guess == randomGenerator){
            System.out.println("You've won $10,000!");
        }
        else if((guessDigit1 == generatorDigit1 || guessDigit1 == generatorDigit2 || guessDigit1 == generatorDigit3) &&
                (guessDigit2 == generatorDigit1 || guessDigit2 == generatorDigit2 || guessDigit2 == generatorDigit3) &&
                (guessDigit3 == generatorDigit1 || guessDigit3 == generatorDigit2 || guessDigit3 == generatorDigit3)){
            System.out.println("You've won $3,000");
        }
        else if(guessDigit1 == generatorDigit1 || guessDigit1 == generatorDigit2 || guessDigit1 == generatorDigit3 ||
                guessDigit2 == generatorDigit1 || guessDigit2 == generatorDigit2 || guessDigit2 == generatorDigit3 ||
                guessDigit3 == generatorDigit1 || guessDigit3 == generatorDigit2 || guessDigit3 == generatorDigit3) {
            System.out.println("You've won $1,000");
        }
        else{
            System.out.println("You lost the lottery");
        }
    }
}
