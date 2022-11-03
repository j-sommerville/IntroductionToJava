package Chapter_03;
import java.util.Scanner;

/* 3.25 (Geometry: intersecting point) Two points on line 1 are given as (x1, y1) and (x2, y2) and on line 2 as
 * (x3, y3) and (x4, y4), as shown in Figure 3.8a–b. The intersecting point of the two lines can be found by solving
 * the following linear equation:
 * (y1- y2)x- (x1- x2)y = (y1- y2)x1- (x1- x2)y1
 * (y3- y4)x- (x3- x4)y = (y3- y4)x3- (x3- x4)y3
 * This linear equation can be solved using Cramer’s rule (see Programming Exercise 3.3). If the equation has no
 * solutions, the two lines are parallel (Figure 3.8c).
 * Write a program that prompts the user to enter four points and displays the intersecting point. Here are sample runs:
 * Enter x1, y1, x2, y2, x3, y3, x4, y4: 2 2 5 -1.0 4.0 2.0 -1.0 -2.0
 * The intersecting point is at (2.88889, 1.1111)
 * Enter x1, y1, x2, y2, x3, y3, x4, y4: 2 2 7 6.0 4.0 2.0 -1.0 -2.0
 * The two lines are parallel
 */

public class Exercise3_25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter x1: ");
        double x1 = input.nextDouble();

        System.out.println("Enter x1: ");
        double y1 = input.nextDouble();

        System.out.println("Enter x1: ");
        double x2 = input.nextDouble();

        System.out.println("Enter x1: ");
        double y2 = input.nextDouble();

        System.out.println("Enter x1: ");
        double x3 = input.nextDouble();

        System.out.println("Enter x1: ");
        double y3 = input.nextDouble();

        System.out.println("Enter x1: ");
        double x4 = input.nextDouble();

        System.out.println("Enter x1: ");
        double y4 = input.nextDouble();

        double a = y1 - y2;
        double b = -(x1 - x2);
        double c = y3 - y4;
        double d = -(x3 - x4);
        double e = ((y1 - y2) * x1) - ((x1 - x2) * y1);
        double f = ((y3-y4) * x3) - ((x3-x4) * y3);


        double xIntersect = ((e * d) - (b * f)) / ((a * d) - (b * c));
        double yIntersect = ((a * f) - (e * c)) / ((a * d) - (b * c));

        if(((a * d) - (b * c)) == 0){
            System.out.println("The two lines are parallel");
        }
        else{
            System.out.println("The intersecting point is at (" + Math.round(xIntersect * 100000) / 100000.0 + "," + Math.round(yIntersect * 100000) / 100000.0 + ")");
        }
    }

}
