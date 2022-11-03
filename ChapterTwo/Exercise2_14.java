package ChapterTwo;
import java.util.Scanner;

/* 2.14 (Health application: computing BMI) Body Mass Index (BMI) is a measure of health on weight. It can be
 * calculated by taking your weight in kilograms and dividing by the square of your height in meters. Write a program
 * that prompts the user to enter a weight in pounds and height in inches and displays the BMI. Note that one pound is
 * 0.45359237 kilograms and one inch is 0.0254 meters. Here is a sample run:
 * Enter weight in pounds: 95.5
 * Enter height in inches: 50
 * BMI is 26.8573
 */

public class Exercise2_14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter weight in pounds: ");
        double pounds = input.nextDouble();

        System.out.println("Enter height in inches: ");
        double inches = input.nextDouble();

        double kilograms = pounds * 0.45359237;
        double height = inches * 0.0254;
        double BMI = kilograms / (height * height);

        System.out.println("Your BMI is " + Math.round(BMI * 10000) / 10000.0);
    }
}
