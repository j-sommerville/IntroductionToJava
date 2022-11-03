package ChapterFour;
import java.util.Scanner;

/* 4.24(Order three cities) Write a program that prompts the user to enter three cities and displays them in ascending
 * order. Here is a sample run:
 * Enter the first city: Chicago
 * Enter the second city: Los Angeles
 * Enter the third city: Atlanta
 * The three cities in alphabetical order are Atlanta Chicago Los Angeles
 */

public class Exercise4_24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first city: ");
        String city1 = input.nextLine();

        System.out.println("Enter the second city: ");
        String city2 = input.nextLine();

        System.out.println("Enter the third city: ");
        String city3 = input.nextLine();


        String tempCity = null;

        if (city1.charAt(0) > city2.charAt(0)) {
            tempCity = city2;
            city2 = city1;
            city1 = tempCity;
        }

        if (city1.charAt(0) > city3.charAt(0)) {
            tempCity = city3;
            city3 = city1;
            city1 = tempCity;
        }

        if (city2.charAt(0) > city3.charAt(0)) {
            tempCity = city3;
            city3 = city2;
            city2 = tempCity;
        }



        System.out.println("The three cities in alphabetical order are " + city1 + " " + city2 + " " + city3);

    }
}
