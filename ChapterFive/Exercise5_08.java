package ChapterFive;
import java.util.Scanner;

/* 5.8(Find the highest score) Write a program that prompts the user to enter the number of students and each student’s
 * name and score, and finally displays the name of the student with the highest score.
 */

public class Exercise5_08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of students: ");
        int students = input.nextInt();

        System.out.println();

        String name = null;
        double score = 0;
        double highestScore = 0;
        String highestScorer = null;

        for(int i = 1; i <= students; i++){
            System.out.println("Enter student " + i + "'s name: ");
            name = input.next();

            System.out.println("Enter student " + i + "'s score: ");
            score = input.nextDouble();

            if(score > highestScore){
                highestScore = score;
                highestScorer = name;
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("The name of the student with the highest score is: " + highestScorer);


    }
}
