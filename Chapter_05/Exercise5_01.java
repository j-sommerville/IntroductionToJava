package Chapter_05;
import java.util.Scanner;

/* 5.1(Count positive and negative numbers and compute the average of numbers) Write a program that reads an
 * unspecified number of integers, determines how many positive and negative values have been read, and computes the
 * total and average of the input values (not counting zeros). Your program ends with the input 0. Display the average
 * as a floating-point number. Here is a sample run:
 * Enter an integer, the input ends if it is 0: 1 2 -1 3 0
 * The number of positives is 3
 * The number of negatives is 1
 * The total is 5.0
 * The average is 1.25
 * Enter an integer, the input ends if it is 0: 0
 * No numbers are entered except 0
 */

public class Exercise5_01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter an integer (the input ends if it is 0): ");
        int number = input.nextInt();

        int posCount = 0;
        int negCount = 0;
        double total = 0;
        //int average = total / (posCount + negCount);

        if (number == 0 && total == 0){
            System.out.println("No numbers are entered except 0");
        }

        while (number != 0) {
            if (number > 0) {
                posCount++;
            } else if (number < 0) {
                negCount++;
            }
            else if (number == 0) {
                break;
            }
            total += number;
            number = input.nextInt();
        }
        double average = total / (posCount + negCount);

        if(number != 0){
            System.out.println("The number of positive integers is " + posCount);
            System.out.println("The number of negative integers is " + negCount);
            System.out.println("The total is " + total);
            System.out.println("The average is " + average);
        }
    }

}
