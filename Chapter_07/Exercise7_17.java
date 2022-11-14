package Chapter_07;
import java.util.Scanner;

/* **7.17 (Sort students) Write a program that prompts the user to enter the number of students, the students’ names,
 * and their scores, and prints student names in decreasing order of their scores.
 */

public class Exercise7_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of students: ");
        int students = input.nextInt();

        String[] names = new String[students];
        double[] scores = new double[students];

        for (int i = 0; i < students; i++){
            System.out.println("Enter student's " + (i + 1) + " name: ");
            String studentName = input.next();
            names[i] = studentName;

            System.out.println("Enter student's " + (i + 1) + " score: ");
            double studentScore = input.nextDouble();
            scores[i] = studentScore;
        }

        sortScores(scores, names);
        System.out.println("Students' names in decreasing order of their scores: ");
        for (int i = 0; i < scores.length; i++){
            System.out.println(names[i] + ": " + scores[i]);
        }
    }

    public static void sortScores(double[] scores, String[] name) {

        for (int i = 0; i < scores.length; i++){
            double max = scores[i];
            int maxIndex = i;

            for(int j = i + 1; j < scores.length; j++){
                if (max < scores[j]) {
                    max = scores[j];
                    maxIndex = j;
                }
            }

            if(maxIndex != i){
                scores[maxIndex] = scores[i];
                scores[i] = maxIndex;

                String temp = name[maxIndex];
                name[maxIndex] = name[i];
                name[i] = temp;
            }
        }
    }
}
