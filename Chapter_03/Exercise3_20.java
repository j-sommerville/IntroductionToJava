package Chapter_03;
import java.util.Scanner;

/* 3.20(Science: wind-chill temperature) Programming Exercise 2.17 gives a formula to compute the wind-chill
 * temperature. The formula is valid for temperatures in the range between −58ºF and 41ºF and wind speed greater than
 * or equal to 2. Write a program that prompts the user to enter a temperature and a wind speed. The program displays
 * the wind-chill temperature if the input is valid; otherwise, it displays a message indicating whether the
 * temperature and/or wind speed is invalid.
 */

public class Exercise3_20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the temperature in Fahrenheit between -58°F and 41°F: ");
        double temperature = input.nextDouble();

        System.out.println("Enter the wind speed greater than or equal to 2 in miles per hour:");
        double windSpeed = input.nextDouble();

        double outsideTemperature = 0.6215 * temperature;
        double speed = 35.75 * (Math.pow(windSpeed, 0.16));
        double temperatureAndSpeed = 0.4275 * temperature * (Math.pow(windSpeed, 0.16));
        double windChill = 35.74 + outsideTemperature - speed + temperatureAndSpeed;

        if (temperature > -58 && temperature < 41) {
            System.out.println("The wind chill index is " + Math.round(windChill * 100000) / 100000.0);
        }
        if (temperature < -58 || temperature > 41){
            System.out.println("The temperature input is invalid. Enter the temperature in Fahrenheit between -58°F and 41°F.");
        }
        if (windSpeed < 2){
            System.out.println("The wind speed input is invalid. Enter the wind speed greater than or equal to 2 in miles per hour.");
        }
    }
}
