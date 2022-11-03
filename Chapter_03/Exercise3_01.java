package Chapter_03;
import java.util.Scanner;

/* 3.1 (Algebra: solve quadratic equations) The two roots of a quadratic equation ax2 + bx + c = 0 can be obtained
 * using the following formula:
 *
 * b2 - 4ac is called the discriminant of the quadratic equation. If it is positive, the equation has two real roots.
 * If it is zero, the equation has one root. If it is negative, the equation has no real roots.
 * Write a program that prompts the user to enter values for a, b, and c and displays the result based on the
 * discriminant. If the discriminant is positive, display two roots. If the discriminant is 0, display one root.
 * Otherwise, display “The equation has no real roots”.
 * Note that you can use Math.pow(x, 0.5) to compute 2x. Here are some sample runs.
 * Enter a, b, c: 1.0 3 1
 * The equation has two roots -0.381966 and -2.61803
 * Enter a, b, c: 1 2.0 1
 * The equation has one root -1
 * Enter a, b, c: 1 2 3
 * The equation has no real roots
 */

public class Exercise3_01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a value for a: ");
        double a = input.nextDouble();

        System.out.println("Enter a value for b: ");
        double b = input.nextDouble();

        System.out.println("Enter a value for c: ");
        double c = input.nextDouble();

        double root1 = (-b + (Math.sqrt((Math.pow(b, 2)) - 4 * a * c))) / 2 * a;
        double root2 = (-b - (Math.sqrt((Math.pow(b, 2)) - 4 * a * c))) / 2 * a;

        double discriminant = (Math.pow(b, 2)) - (4 * a * c);

        if (discriminant > 0){
            System.out.println("The equation has two real roots: " + Math.round(root1 * 1000000) / 1000000.0 + " and " +
                    Math.round(root2 * 100000) / 100000.0);
        }
        else if(discriminant == 0) {
            System.out.println("The equation has one real root: " + Math.round(root1 * 1000000) / 1000000.0);
        }
        else{
            System.out.println("The equation has no real roots");
        }
    }
}
