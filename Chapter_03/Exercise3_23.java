package Chapter_03;
import java.util.Scanner;

/* 3.23 (Geometry: point in a rectangle?) Write a program that prompts the user to enter a point (x, y) and checks
 * whether the point is within the rectangle centered at (0, 0) with width 10 and height 5. For example, (2, 2) is
 * inside the rectangle and (6, 4) is outside the rectangle, as shown in Figure 3.7b. (Hint: A point is in the
 * rectangle if its horizontal distance to (0, 0) is less than or equal to 10 / 2 and its vertical distance to (0, 0)
 * is less than or equal to 5.0 / 2. Test your program to cover all cases.) Here are two sample runs.
 * Enter a point with two coordinates: 2 2
 * Point (2.0, 2.0) is in the rectangle
 * Enter a point with two coordinates: 2 2
 * Point (2.0, 2.0) is in the rectangle
 */

public class Exercise3_23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the x coordinate of a rectangle: ");
        double x = input.nextDouble();

        System.out.println("Enter the y coordinate of a rectangle: ");
        double y = input.nextDouble();

        double horizontalDistance = Math.sqrt(Math.pow((x - 0), 2) + Math.pow((y - 0), 2));
        double verticalDistance = Math.sqrt(Math.pow((x - 0), 2) + Math.pow((y - 0), 2));

        if ((horizontalDistance <= (10 / 2)) || (verticalDistance <= (5.0 / 2) )){
            System.out.println("Point (" + x + "," + y + ") is in the rectangle");
        }
        else {
            System.out.println("Point (" + x + "," + y + ") is not in the rectangle");
        }
    }
}
