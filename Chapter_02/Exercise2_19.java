package Chapter_02;
import java.util.Scanner;

/* 2.19 (Geometry: area of a triangle) Write a program that prompts the user to enter three points (x1, y1),
 * (x2, y2), (x3, y3) of a triangle and displays its area. The formula for computing the area of a triangle is
 * s = (side1 + side2 + side3)/2;
 * area = sqrt(s(s- side1)(s- side2)(s- side3))
 * Here is a sample run:
 * Enter three points for a triangle: 1.5 -3.4 4.6 5 9.5 -3.4
 * The area of the triangle is 33.6
 */

public class Exercise2_19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter x1: ");
        double sideX1 = input.nextDouble();

        System.out.println("Enter y1: ");
        double sideY1 = input.nextDouble();

        System.out.println("Enter x2: ");
        double sideX2 = input.nextDouble();

        System.out.println("Enter y2: ");
        double sideY2 = input.nextDouble();

        System.out.println("Enter x3: ");
        double sideX3 = input.nextDouble();

        System.out.println("Enter y3: ");
        double sideY3 = input.nextDouble();

        double side1 = Math.pow(Math.pow(sideX2 - sideX1, 2) + Math.pow(sideY2 - sideY1, 2), 0.5);
        double side2 = Math.pow(Math.pow(sideX3 - sideX2, 2) + Math.pow(sideY3 - sideY2, 2), 0.5);
        double side3 = Math.pow(Math.pow(sideX1 - sideX3, 2) + Math.pow(sideY1 - sideY3, 2), 0.5);

        double sides = (side1 + side2 + side3) / 2;
        double area = Math.sqrt((sides * (sides - side1) * (sides - side2) * (sides - side3)));

        System.out.println("The area of the triangle is " + Math.round(area * 10) / 10.0);
    }
}
