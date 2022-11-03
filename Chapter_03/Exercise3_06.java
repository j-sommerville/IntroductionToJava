package Chapter_03;
import java.util.Scanner;

/* 3.6 (Health application: BMI) Revise Listing 3.4, ComputeAndInterpretBMI.java, to let the user enter weight, feet,
 * and inches. For example, if a person is 5 feet and 10 inches, you will enter 5 for feet and 10 for inches. Here is
 * a sample run:
 * Enter weight in pounds: 140
 * Enter feet: 5
 * Enter inches: 10
 * BMI is 20.087702275404553
 * Normal
 */

public class Exercise3_06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter weight in pounds: ");
        double pounds = input.nextDouble();

        System.out.println("Enter feet: ");
        double feet = input.nextDouble();

        System.out.println("Enter inches: ");
        double inches = input.nextDouble();

        double kilograms = pounds * 0.45359237;
        double meters = ((feet * 12) * 0.0254) + (inches * 0.0254);
        double BMI = kilograms / (meters * meters);

        System.out.println("Your BMI is " + BMI);

        if(BMI < 18.5){
            System.out.println("Underweight");}
        else if (BMI >= 18.5 && BMI < 25){
            System.out.println("Normal");}
        else if (BMI >= 25 && BMI < 30){
            System.out.println("Overweight");}
        else if (BMI >= 30){
            System.out.println("Obese");}
    }
}
