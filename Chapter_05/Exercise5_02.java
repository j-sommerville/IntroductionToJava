package Chapter_05;
import java.util.Scanner;

/* 5.2(Repeat additions) Listing 5.4, SubtractionQuizLoop.java, generates five random subtraction questions. Revise the
 * program to generate ten random addition questions for two integers between 1 and 15. Display the correct count and
 * test time.
 */


public class Exercise5_02 {
    public static void main(String[] args) {

        int correctAnswer = 0;
        int numCorrectAnswer = 0;
        int questions = 5;

        long startTime = System.currentTimeMillis();

        for(int i = 1; i <= questions; i++){
            int random1 = (int) (1 + Math.random() * 15);
            int random2 = (int) (1 + Math.random() * 15);

            if(random1 < random2){
                int temp = random1;
                random1 = random2;
                random2 = temp;
            }

            System.out.println("What is " + random1 + " - " + random2 + "?");
            Scanner input = new Scanner(System.in);
            int userAnswer = input.nextInt();
            correctAnswer = random1 - random2;

            if (userAnswer == correctAnswer){
                System.out.println("Correct!");
                System.out.println();
                numCorrectAnswer++;
            }

            else if (userAnswer != correctAnswer){
                System.out.println("Incorrect! " + random1 + " - " + random2 + " is " + correctAnswer);
            }
        }

        long endTime = System.currentTimeMillis();
        long totalTime = (endTime - startTime) / 1000;

        System.out.println("You got " + numCorrectAnswer + " correct answers out of " + questions + " questions!");
        System.out.println("You completed the Subtraction Quiz within " + totalTime + " seconds.");

    }
}
