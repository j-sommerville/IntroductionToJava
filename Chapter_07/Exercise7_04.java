package Chapter_07;
import java.util.Scanner;

/* 7.4 (Analyze scores) Write a program that reads an unspecified number of scores and determines how many scores are
 * above or equal to the average and how many scores are below the average. Enter a negative number to signify the end
 * of the input. Assume that the maximum number of scores is 100.
 */

public class Exercise7_04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the scores (enter a negative number to end the program): ");

        int[] scores = new int[100];
        int numbers;
        int i = 0;
        int sum = 0;

        while(true){
            numbers = input.nextInt();

            if(numbers < 0) break;
            else{
                scores[i] = numbers;
                sum += numbers;
                i++;
            }
        }

        System.out.println("Sum: " + sum);
        System.out.println("Count: " + i);
        average(scores, i, sum);

    }

    public static void average(int[] scores, int count, int sum){
        double average = (double) sum / count;

        int aboveAverage = 0;
        int equalsAverage = 0;
        int belowAverage = 0;

        for(int i = 0; i <= scores.length - 1; i++){
            if(scores[i] > average){
                aboveAverage++;
            }
            else if(scores[i] == average){
                equalsAverage++;
            }
            else if(scores[i] < average && scores[i] != 0) {
                belowAverage++;
            }
        }

        System.out.println("Average: " + average);
        System.out.println("There are " + aboveAverage + " scores above the average");
        System.out.println("There are " + belowAverage + " scores below the average");
        System.out.println("There are " + equalsAverage + " scores equal to the average");
    }
}
