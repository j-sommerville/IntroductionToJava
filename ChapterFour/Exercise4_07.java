package ChapterFour;
import java.util.Scanner;

/* 4.7 (Corner point coordinates) Suppose a pentagon is centered at (0, 0) with one point at the 0 o’clock position,
 * as shown in Figure 4.7c. Write a program that prompts the user to enter the radius of the bounding circle of a
 * pentagon and displays the coordinates of the five corner points on the pentagon. Here is a sample run:
 * Enter the radius of the bounding circle: 100
 * The coordinates of five points on the pentagon are
 * (95.1057, 30.9017)
 * (0.000132679, 100)
 * (-95.1056, 30.9019)
 * (-58.7788, -80.9015)
 * (58.7782, -80.902)
 */

public class Exercise4_07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the radius of the bounding circle of a pentagon:");
        double radius = input.nextDouble();

        double angle = (Math.PI / 2);

        //Corner one
        double angle1 = angle - (2 * (Math.PI / 5));
        double x1 = radius * Math.cos(angle1);
        double y1 = radius * Math.sin(angle1);
        System.out.printf("(%.4f, %.4f)\n", x1, y1);

        //Corner two
        double angle2 = angle;
        double x2 = radius * Math.cos(angle2);
        double y2 = radius * Math.sin(angle2);
        System.out.printf("(%.4f, %.4f)\n", x2, y2);

        //Corner three
        double angle3 = angle + (2 * (Math.PI / 5));
        double x3 = radius * Math.cos(angle3);
        double y3 = radius * Math.sin(angle3);
        System.out.printf("(%.4f, %.4f)\n", x3, y3);

        //Corner four
        double angle4 = angle + (4 * (Math.PI / 5));
        double x4 = radius * Math.cos(angle4);
        double y4 = radius * Math.sin(angle4);
        System.out.printf("(%.4f, %.4f)\n", x4, y4);

        //Corner five
        double angle5 = angle + (6 * (Math.PI / 5));
        double x5 = radius * Math.cos(angle5);
        double y5 = radius * Math.sin(angle5);
        System.out.printf("(%.4f, %.4f)\n", x5, y5);

    }
}
