package ChapterTwo;
import java.util.Scanner;

/* 2.12 (Physics: finding runway length) Given an airplane’s acceleration a and take-off speed v, you can compute the
 * minimum runway length needed for an airplane to take off using the following formula:
 * length = v^2 / 2a
 * Write a program that prompts the user to enter v in meters/second (m/s) and the acceleration a in meters/second
 * squared (m/s ^ 2), and displays the minimum runway length. Here is a sample run:
 * Enter speed and acceleration: 60 3.5
 * The minimum runway length for this airplane is 514.286
 */

public class Exercise2_12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the speed: ");
        double speed = input.nextDouble();

        System.out.println("Enter the acceleration: ");
        double acceleration = input.nextDouble();

        double length = (Math.pow(speed, 2)) / (2 * acceleration);

        System.out.println("The minimum runway length for this airplane is " + Math.round(length * 1000)/ 1000.0);
    }
}
