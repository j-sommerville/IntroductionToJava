package Chapter_02;
import java.util.Scanner;

/* 2.20 (Financial application: calculate interest) If you know the balance and the annual percentage interest rate,
 * you can compute the interest on the next monthly payment using the following formula:
 * interest = balance * (annualInterestRate/1200)
 * Write a program that reads the balance and the annual percentage interest rate and displays the interest for the
 * next month. Here is a sample run:
 * Enter balance and interest rate (e.g., 3 for 3%): 1000 3.5
 * The interest is 2.91667
 */

public class Exercise2_20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the account balance: ");
        double balance = input.nextDouble();

        System.out.println("Enter the interest rate: ");
        double annualInterestRate = input.nextDouble();

        double interest = balance * (annualInterestRate/1200);

        System.out.println("The interest is " + Math.round(interest * 100000) / 100000.0);
    }
}
