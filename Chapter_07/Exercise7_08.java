package Chapter_07;
import java.util.Scanner;

/* 7.8 (Average an array) Write two overloaded methods that return the average of an array with the following headers:
 * public static int average(int[] array)
 * public static double average(double[] array)
 * Write a test program that prompts the user to enter ten double values, invokes this method, and displays the average
 * value.
 */

public class Exercise7_08 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter 10 double values: ");
        double numbers;
        double[] nums = new double[10];

        for(int i = 0; i < nums.length; i++){
            numbers = input.nextDouble();
            nums[i] = numbers;
        }

        System.out.println("The average is " + average(nums));
    }

    public static int average(int[] array){
        int sum = 0;
        int count = 0;

        for(int i = 0; i < array.length; i++){
            sum += array[i];
            count++;
        }

        int average = sum / count;
        return average;
    }

    public static double average(double[] array){
        double sum = 0;
        double count = 0;

        for(int i = 0; i < array.length; i++){
            sum += array[i];
            count++;
        }

        double average = sum / count;
        return average;
    }
}
