package ChapterTwo;
import java.util.Scanner;

/* 2.2 (Compute the volume of a cylinder) Write a program that reads in the radius and length of a cylinder and
 * computes the area and volume using the following formulas:
 * area = radius * radius * p
 * volume = area * length
 * Here is a sample run:
 * Enter the radius and length of a cylinder: 5.5 12
 * The area is 95.0331 The volume is 1140.4
 */

public class Exercise2_02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the radius of a cylinder: ");
        double radius = input.nextDouble();
        System.out.println("Enter the length of a cylinder: ");
        double length = input.nextDouble();

        double area = radius * radius * Math.PI;
        double volume = area * length;

        System.out.println("The area of the cylinder is " + Math.round(area * 10000) / 10000.0);
        System.out.println("The volume of the cylinder is " + Math.round(volume * 10) / 10.0);
    }
}
