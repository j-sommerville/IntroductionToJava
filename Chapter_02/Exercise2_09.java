package Chapter_02;
import java.util.Scanner;

/* 2.9 (Physics: acceleration) Average acceleration is defined as the change of velocity divided by the time taken to
 * make the change, as shown in the following formula:
 * a = v1 - v0 / t
 * Write a program that prompts the user to enter the starting velocity v0 in meters/second, the ending velocity v1
 * in meters/second, and the time span t in seconds, and displays the average acceleration. Here is a sample run:
 * Enter v0, v1, and t: 5.5 50.9 4.5
 * The average acceleration is 10.0889
 */

public class Exercise2_09 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the starting velocity in meters per second: ");
        double v0 = input.nextDouble();

        System.out.println("Enter the ending velocity in meters per second: ");
        double v1 = input.nextDouble();

        System.out.println("Enter the time span in seconds: ");
        double t = input.nextDouble();

        double averageAcceleration = (v1 - v0) / t;

        System.out.println("You entered " + v0 + " for the starting velocity, " + v1 + " for the ending velocity, and "
                + t + " for the time.");
        System.out.println("The average acceleration is " + Math.round(averageAcceleration * 10000) / 10000.0);
    }
}
