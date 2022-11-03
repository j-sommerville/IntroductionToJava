package Chapter_03;
import java.util.Scanner;

/* 3.26 (Use the &&, || and ^ operators) Write a program that prompts the user to enter an integer and determines
 * whether it is divisible by 5 and 6, whether it is divisible by 5 or 6, and whether it is divisible by 5 or 6, but
 * not both. Here is a sample run of this program:
 * Enter an integer: 10
 * Is 10 divisible by 5 and 6? false
 * Is 10 divisible by 5 or 6? true
 * Is 10 divisible by 5 or 6, but not both? true
 */

public class Exercise3_26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter an integer: ");
        int num = input.nextInt();

        boolean bothNumbers = ((num % 5 == 0) && (num % 6 == 0));
        System.out.print("Is " + num + " divisible by 5 and 6? ");
        System.out.println(bothNumbers);

        boolean eitherNumbers = ((num % 5 == 0) || (num % 6 == 0));
            System.out.print("Is " + num + " divisible by 5 or 6? ");
            System.out.println(eitherNumbers);

        boolean notBothNumbers = ((num % 5 == 0) || (num % 6 == 0) ^ ((num % 5 == 0) && (num % 6 == 0)));
            System.out.print("Is " + num + " divisible by 5 or 6, but not both? ");
            System.out.println(notBothNumbers);
    }
}
