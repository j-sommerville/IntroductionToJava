package Chapter_07;
import java.util.Scanner;

/* 7.1 (Assign grades) Write a program that reads student scores, gets the best score, and then assigns grades based on
 * the following scheme:
 * Grade is A if score is Ú best - 10
 * Grade is B if score is Ú best - 20;
 * Grade is C if score is Ú best - 30;
 * Grade is D if score is Ú best - 40;
 * Grade is F otherwise.
 * The program prompts the user to enter the total number of students, then prompts the user to enter all of the scores,
 * and concludes by displaying the grades. Here is a sample run:
 */

public class Exercise7_01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the total number of students: ");
        int students = input.nextInt();


        int[] scores = new int[students];

        for(int i = 0; i < scores.length; i++){
            System.out.println("Enter student " + (i + 1) + "'s score: ");
            scores[i] = input.nextInt();
        }

        System.out.print("The scores you entered are: ");
        for(int i = 0; i < scores.length; i++){
            System.out.print(scores[i] + " ");
        }
        System.out.println();

        int best = scores[0];
        for(int i = 1; i < scores.length; i++){
            if(scores[i] > best){
                best = scores[i];
            }
        }

        for(int i = 0; i < scores.length; i++) {
            System.out.println("Student " + i + "'s score is " + scores[i] + " and the grade is " + grade(scores[i], best));
        }
    }

    public static char grade(int scores, int best){
        char grade = ' ';

        if(scores >= (best - 10)){
            grade = 'A';
        }
        else if(scores >= (best - 20)){
            grade = 'B';
        }
        else if(scores >= (best - 30)){
            grade = 'C';
        }
        else if(scores >= (best - 40)){
            grade = 'D';
        }
        else{
            grade = 'F';
        }
        return grade;
    }
}
