package ChapterTwo;
import java.util.Scanner;

/* 2.16 (Geometry: area of a hexagon) Write a program that prompts the user to enter the side of a hexagon and displays
 * its area. The formula for computing the area of a hexagon is:
 * Area = 3sqrt(3) / 2 * s^2,
 * where s is the length of a side. Here is a sample run:
 * Enter the side: 5.5
 * The area of the hexagon is 78.5895
 */

public class Exercise2_16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of one side of the hexagon: ");
        double side = input.nextDouble();

        double numerator = 3 * Math.sqrt(3);
        double denominator = 2;
        double area = (numerator / denominator) * Math.pow(side, 2);

        System.out.println("The area of the hexagon with a side length of " + side + " is " +
                Math.round(area * 10000) / 10000.0);
    }
}
