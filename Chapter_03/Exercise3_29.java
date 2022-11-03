package Chapter_03;
import java.util.Scanner;

/* 3.29 (Geometry: two circles) Write a program that prompts the user to enter the center coordinates and radii of two
 * circles and determines whether the second circle is inside the first or overlaps with the first, as shown in
 * Figure 3.10. (Hint: circle2 is inside circle1 if the distance between the two centers 6= |r1 - r2| and circle2
 * overlaps circle1 if the distance between the two centers <= r1 + r2. Test your program to cover all cases.)
 * Here are the sample runs:
 * Enter circle1's center x-, y-coordinates, and radius: 0.5 5.1 13
 * Enter circle2's center x-, y-coordinates, and radius: 1 1.7 4.5
 * circle2 is inside circle1
 * Enter circle1's center x-, y-coordinates, and radius: 3.4 5.7 5.5
 * Enter circle2's center x-, y-coordinates, and radius: 6.7 3.5 3
 * circle2 overlaps circle1
 * Enter circle1's center x-, y-coordinates, and radius: 3.4 5.5 1
 * Enter circle2's center x-, y-coordinates, and radius: 5.5 7.2 1
 * circle2 does not overlap circle1
 */

public class Exercise3_29 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the x coordinate of the center of the first circle: ");
        double x1 = input.nextDouble();

        System.out.println("Enter the y coordinate of the center of the first circle: ");
        double y1 = input.nextDouble();

        System.out.println("Enter the radius of the first circle: ");
        double r1 = input.nextDouble();

        System.out.println("Enter the x coordinate of the center of the second circle: ");
        double x2 = input.nextDouble();

        System.out.println("Enter the y coordinate of the center of the second circle: ");
        double y2 = input.nextDouble();

        System.out.println("Enter the radius of the second circle: ");
        double r2 = input.nextDouble();

        double x = Math.pow((x2 - x1), 2);
        double y = Math.pow((y2 - y1), 2);
        double distance = Math.sqrt((x + y));

        if (distance <= r1 - r2){
            System.out.println("The second circle is inside the first circle.");
        }
        else if (distance <= r1 + r2){
            System.out.println("The second circle overlaps the first circle.");
        }
        else{
            System.out.println("The second circle does not overlap the first circle.");
        }
    }
}
