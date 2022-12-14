package Chapter_03;
import java.util.Scanner;

/* 3.3 (Algebra: solve 2 * 2 linear equations) A linear equation can be solved using Cramer’s rule given in Programming
 * Exercise 1.13. Write a program that prompts the user to enter a, b, c, d, e, and f and displays the result. If
 * ad - bc is 0, report that “The equation has no solution.”
 * Enter a, b, c, d, e, f: 9.0 4.0 3.0 -5.0 -6.0 -21.0
 * x is -2.0 and y is 3.0
 * Enter a, b, c, d, e, f: 1.0 2.0 2.0 4.0 4.0 5.0
 * The equation has no solution
 */

public class Exercise3_03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a value for a: ");
        double a = input.nextDouble();

        System.out.println("Enter a value for b: ");
        double b = input.nextDouble();

        System.out.println("Enter a value for c: ");
        double c = input.nextDouble();

        System.out.println("Enter a value for d: ");
        double d = input.nextDouble();

        System.out.println("Enter a value for e: ");
        double e = input.nextDouble();

        System.out.println("Enter a value for f: ");
        double f = input.nextDouble();

        double x = ((e * d) - (b * f)) / ((a * d) - (b * c));
        double y = ((a * f) - (e * c)) / ((a * d) - (b * c));

        if(((a * d) - (b*c)) == 0){
            System.out.println("The equation has no solution.");
        }
        else{
            System.out.println("x is " + x + " and y is " + y);
        }

    }
}
