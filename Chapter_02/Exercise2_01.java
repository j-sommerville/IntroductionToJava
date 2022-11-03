package Chapter_02;
import java.util.Scanner;

/* 2.1 (Convert Celsius to Fahrenheit) Write a program that reads a Celsius degree in a double value from the console,
 * then converts it to Fahrenheit and displays the result. The formula for the conversion is as follows:
 * fahrenheit = (9 / 5) * celsius + 32
 * Hint: In Java, 9 / 5 is 1, but 9.0 / 5 is 1.8.
 * Here is a sample run:
 * Enter a degree in Celsius: 43 43
 * Celsius is 109.4 Fahrenheit
 */

public class Exercise2_01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a degree in Celsius: ");
        double celsius = input.nextDouble();
        double fahrenheit = (9.0 / 5) * celsius + 32;
        System.out.println(Math.round(celsius) + " celsius is " + fahrenheit + " fahrenheit.");
    }
}
