package Chapter_02;
import java.util.Scanner;

/* 2.23 (Cost of driving) Write a program that prompts the user to enter the distance to drive, the fuel efficiency of
 * the car in miles per gallon, and the price per gallon, and displays the cost of the trip. Here is a sample run:
 * Enter the driving distance: 900.5
 * Enter miles per gallon: 25.5
 * Enter price per gallon: 3.55
 * The cost of driving is $125.36
 */

public class Exercise2_23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the driving distance: ");
        double distance = input.nextDouble();

        System.out.println("Enter the miles per gallon: ");
        double miles = input.nextDouble();

        System.out.println("Enter the price per gallon: ");
        double price = input.nextDouble();

        double cost = (distance / miles) * price;
        System.out.println("The cost of driving is $" + Math.round(cost * 100) / 100.0);
    }
}
