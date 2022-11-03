package Chapter_05;
import java.util.Scanner;

/* 5.30(Financial application: compound value) Suppose you save $100 each month into a savings account with the annual
 * interest rate 5%. So, the monthly interest rate is 0.05 / 12 = 0.00417. After the first month, the value in the
 * account becomes
 * 100 * (1 + 0.00417) = 100.417
 * After the second month, the value in the account becomes
 * (100 + 100.417) * (1 + 0.00417) = 201.252
 * After the third month, the value in the account becomes
 * (100 + 201.252) * (1 + 0.00417) = 302.507
 * and so on.
 * Write a program that prompts the user to enter an amount (e.g., 100), the annual interest rate (e.g., 5), and the
 * number of months (e.g., 6) and displays the amount in the savings account after the given month.
 */

public class Exercise5_30 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter an amount: ");
        double amount = input.nextDouble();

        System.out.println("Enter the annual interest rate: ");
        double annualRate = input.nextDouble();

        System.out.println("Enter the number of months: ");
        double months = input.nextDouble();

        double monthlyInterest = (annualRate / 100) / 12;
        double value = 0;

        for(int month = 1; month <= months; month++){
            //value = amount * (1 + monthlyInterest);
            value = (amount + value) * (1 + monthlyInterest);

            System.out.printf("%.3f\n", value);
        }
    }
}
