package ChapterThree;
import java.util.Scanner;

/* 3.19(Compute the perimeter of a triangle) Write a program that reads three edges for a triangle and computes the
 * perimeter if the input is valid. Otherwise, display that the input is invalid. The input is valid if the sum of
 * every pair of two edges is greater than the remaining edge.
 */

public class Exercise3_19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the size of the triangle's first edge: ");
        int firstEdge = input.nextInt();

        System.out.println("Enter the size of the triangle's second edge: ");
        int secondEdge = input.nextInt();

        System.out.println("Enter the size of the triangle's third edge: ");
        int thirdEdge = input.nextInt();

        int perimeter = 0;

        if((firstEdge + secondEdge) > thirdEdge){
            perimeter = firstEdge + secondEdge + thirdEdge;
            System.out.println("The perimeter of the triangle is " + perimeter);
        }
        else if((firstEdge + thirdEdge) > secondEdge) {
            perimeter = firstEdge + secondEdge + thirdEdge;
            System.out.println("The perimeter of the triangle is " + perimeter);
        }
        else if((secondEdge + thirdEdge) > firstEdge) {
            perimeter = firstEdge + secondEdge + thirdEdge;
            System.out.println("The perimeter of the triangle is " + perimeter);
        }
        else {
            System.out.println("The input is invalid.");
        }
    }
}
