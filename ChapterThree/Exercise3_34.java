package ChapterThree;
import java.util.Scanner;

/* 3.34 (Geometry: point on line segment) Programming Exercise 3.32 shows how to test whether a point is on an
 * unbounded line. Revise Programming Exercise 3.32 to test whether a point is on a line segment. Write a program that
 * prompts the user to enter the three points for p0, p1, and p2 and displays whether p2 is on the line segment from
 * p0 to p1. Here are some sample runs:
 * Enter three points for p0, p1, and p2: 1 1 2.5 2.5 1.5 1.5
 * (1.5, 1.5) is on the line segment from (1.0, 1.0) to (2.5, 2.5)
 * Enter three points for p0, p1, and p2: 1 1 2 2 3.5 3.5
 * (3.5, 3.5) is not on the line segment from (1.0, 1.0) to (2.0, 2.0)
 */

public class Exercise3_34 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the x-coordinate for p0: ");
        double x0 = input.nextDouble();

        System.out.println("Enter the y-coordinate for p0: ");
        double y0 = input.nextDouble();

        System.out.println("Enter the x-coordinate for p1: ");
        double x1 = input.nextDouble();

        System.out.println("Enter the y-coordinate for p1: ");
        double y1 = input.nextDouble();

        System.out.println("Enter the x-coordinate for p2: ");
        double x2 = input.nextDouble();

        System.out.println("Enter the y-coordinate for p2: ");
        double y2 = input.nextDouble();

        double decider = (x1- x0)*(y2- y0)- (x2- x0)*(y1- y0);


        if ((x2 > x1) || (y2 > y1) || (x2 < x0) || (y2 < y0) || decider > 0 || decider < 0){
            System.out.println("(" + x2 + " , " + y2 + ") is not on the line segment from ("
                    + x0 + " , " + y0 + ") to (" + x1 + " , " + y1 + ")");
        }
        else if (decider == 0){
            System.out.println("(" + x2 + " , " + y2 + ") is on the line segment from ("
                    + x0 + " , " + y0 + ") and (" + x1 + " , " + y1 + ")");
        }
    }
}
