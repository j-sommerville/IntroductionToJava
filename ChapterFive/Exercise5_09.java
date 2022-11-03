package ChapterFive;
import java.util.Scanner;

/* 5.9(Find the two highest scores) Write a program that prompts the user to enter the number of students and each
 * student’s name and score, and finally displays the student with the highest score and the student with the
 * second-highest score.
 */

public class Exercise5_09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of students: ");
        int number = input.nextInt();

        String name = null;
        double score = 0;

        String highestScorer = null;
        double highestScore = 0;

        String secondHighestScorer = null;
        double secondHighestScore = 0;

        for( int i = 1; i <= number; i++){
            System.out.println("Enter student " + i + "'s name: ");
            name = input.next();

            System.out.println("Enter student " + i + "'s score: ");
            score = input.nextDouble();

            System.out.println();

            if(score > highestScore){
                secondHighestScore = highestScore;
                secondHighestScorer = highestScorer;
                highestScore = score;
                highestScorer = name;
            }

            else if(score > secondHighestScore){
                secondHighestScore = score;
                secondHighestScorer = name;
            }
        }
        System.out.println("The student with the highest score is " + highestScorer);
        System.out.println("The student with the second highest score is " + secondHighestScorer);
    }
}
