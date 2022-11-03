package ChapterThree;
import java.util.Scanner;

/* 3.28 (Geometry: two rectangles) Write a program that prompts the user to enter the center x-, y-coordinates, width,
 * and height of two rectangles and determines whether the second rectangle is inside the first or overlaps with the
 * first, as shown in Figure 3.9. Test your program to cover all cases.
 * Here are the sample runs:
 * Enter r1's center x-, y-coordinates, width, and height: 2.5 4 2.5 43
 * Enter r2's center x-, y-coordinates, width, and height: 1.5 5 0.5 3
 * r2 is inside r1
 * Enter r1's center x-, y-coordinates, width, and height: 1 2 3 5.5
 * Enter r2's center x-, y-coordinates, width, and height: 3 4 4.5 5
 * r2 overlaps r1
 * Enter r1's center x-, y-coordinates, width, and height: 1 2 3 3
 * Enter r2's center x-, y-coordinates, width, and height: 40 45 3 2
 * r2 does not overlap r1
 */

public class Exercise3_28 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the x coordinate of the first rectangle: ");
        double x1 = input.nextDouble();

        System.out.println("Enter the y coordinate of the first rectangle: ");
        double y1 = input.nextDouble();

        System.out.println("Enter the width of the first rectangle: ");
        double w1 = input.nextDouble();

        System.out.println("Enter the height of the first rectangle: ");
        double h1 = input.nextDouble();

        System.out.println("Enter the x coordinate of the second rectangle: ");
        double x2 = input.nextDouble();

        System.out.println("Enter the y coordinate of the second rectangle: ");
        double y2 = input.nextDouble();

        System.out.println("Enter the width of the second rectangle: ");
        double w2 = input.nextDouble();

        System.out.println("Enter the height of the second rectangle: ");
        double h2 = input.nextDouble();

        double recOneUpperX = x1 + w1 / 2;
        double recOneLowerX = x1 - w1 / 2;
        double recOneUpperY = y1 + h1 / 2;
        double recOneLowerY = y1 - h1 / 2;

        double recTwoUpperX = x2 + w2 / 2;
        double recTwoLowerX = x2 - w2 / 2;
        double recTwoUpperY = y2 + h2 / 2;
        double recTwoLowerY = y2 - h2 / 2;


        if ((recTwoUpperX <= recOneUpperX) && (recTwoLowerX >= recOneLowerX) && (recTwoUpperY <= recOneUpperY) &&
                (recTwoLowerY >= recOneLowerY)){
            System.out.println("The second triangle is inside the first triangle");
        }
        else if ((recOneUpperX > recTwoLowerX) || (recOneLowerX < recTwoUpperX) || (recTwoUpperY > recTwoLowerY) ||
                (recTwoLowerY < recOneUpperY)){
            System.out.println("The second triangle overlaps the first triangle");
        }
        else if ((recOneUpperX < recTwoLowerX) || (recOneLowerX > recTwoUpperX) || (recOneUpperY < recTwoLowerY) ||
                (recTwoLowerY > recOneUpperY)){
            System.out.println("The second triangle does not overlap the first triangle");
        }

    }
}
