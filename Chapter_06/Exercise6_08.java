package Chapter_06;

/* 6.8 (Conversions between Celsius and Fahrenheit) Write a class that contains the following two methods:
 * // Convert from Celsius to Fahrenheit
 * public static double celsiusToFahrenheit(double celsius)
 * // Convert from Fahrenheit to Celsius
 * public static double fahrenheitToCelsius(double fahrenheit)
 * The formula for the conversion is:
 * fahrenheit = (9.0 / 5) * celsius + 32
 * celsius = (5.0 / 9) * (fahrenheit – 32)
 * Write a test program that invokes these methods to display the following tables:
 * Celsius Fahrenheit | Fahrenheit Celsius
 * 40.0    104.0      | 120.0      48.89
 * 39.0    102.2      | 110.0      43.33
 * ...
 * 32.0    89.6       | 40.0       4.44
 * 31.0    87.8       | 30.0       -1.11

 */

public class Exercise6_08 {
    public static void main(String[] args) {
        System.out.println("Celsius    Fahrenheit    |    Fahrenheit    Celsius");
        System.out.println("_____________________________________________________");

        double celsius = 40;
        double fahrenheit = 120;

        while(celsius >= 31 && fahrenheit >= 30){
            System.out.printf("%-11.1f", celsius);
            System.out.printf("%-12.1f", celsiusToFahrenheit(celsius));
            System.out.printf("%3c    ", '|');
            celsius--;

            System.out.printf("%-14.1f", fahrenheit);
            System.out.printf("%-6.2f", fahrenheitToCelsius(fahrenheit));
            fahrenheit -= 10;
            System.out.println();

        }
    }

    // Convert from Celsius to Fahrenheit
    public static double celsiusToFahrenheit(double celsius){
        double fahrenheit = (9.0 / 5) * celsius + 32;
        return fahrenheit;
    }

   //Convert from Fahrenheit to Celsius
   public static double fahrenheitToCelsius(double fahrenheit){
       double celsius = (5.0 / 9) * (fahrenheit - 32);
       return celsius;
    }
}
