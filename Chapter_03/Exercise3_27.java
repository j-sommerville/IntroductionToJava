package Chapter_03;
import java.util.Scanner;

/* 3.27 (Geometry: points in triangle?) Suppose a right triangle is placed in a plane as shown below. The right-angle
 * point is placed at (0, 0), and the other two points are placed at (200, 0), and (0, 100). Write a program that
 * prompts the user to enter a point with x- and y-coordinates and determines whether the point is inside the triangle.
 * Here are the sample runs:
 * Enter a point's x- and y-coordinates: 100.5 25.5
 * The point is in the triangle
 * Enter a point's x- and y-coordinates: 100.5 50.5
 * The point is not in the triangle
 */

public class Exercise3_27 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the x coordinate of the triangle: ");
        double x = input.nextDouble();

        System.out.println("Enter the y coordinate of the triangle: ");
        double y = input.nextDouble();

        if((y > 0) && (x > 0) && (x + 2*y < 200)){
            System.out.println("The point is in the triangle.");
        }
        else{
            System.out.println("The point is not in the triangle.");
        }
    }
}
