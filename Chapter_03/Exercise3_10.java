package Chapter_03;
import java.util.Scanner;

/* 3.10 (Game: addition quiz) Listing 3.3, SubtractionQuiz.java, randomly generates a subtraction question. Revise the
 * program to randomly generate an addition question with two integers less than 100.
 */

public class Exercise3_10 {
    public static void main(String[] args) {
        int number1 = (int) (Math.random() * 100);
        int number2 = (int) (Math.random() * 100);
        //System.out.println(number1);
        //System.out.println(number2);
        if (number1 < number2){
            int temp = number1;
            number1 = number2;
            number2 = temp;
        }
        int correctAnswer = number1 - number2;

        Scanner input = new Scanner(System.in);
        System.out.println("What is " + number1 + " - " + number2 + "?");
        int answer = input.nextInt();

        if (answer == correctAnswer){
            System.out.println("You are correct! " + number1 + " - " + number2 + " is " + correctAnswer);
        }
        else{
            System.out.println("You are incorrect! " + number1 + " - " + number2 + " is not " + answer);
        }
    }
}
