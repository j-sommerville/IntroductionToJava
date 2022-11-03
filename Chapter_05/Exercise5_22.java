package Chapter_05;
import java.util.Scanner;

/* 5.22(Financial application: loan amortization schedule) The monthly payment for a given loan pays the principal and
 * the interest. The monthly interest is computed by multiplying the monthly interest rate and the balance (the
 * remaining principal). The principal paid for the month is therefore the monthly payment minus the monthly interest.
 * Write a program that lets the user enter the loan amount, number of years, and interest rate and displays the
 * amortization schedule for the loan. Here is a sample run:
 * Loan Amount: 10000
 * Number of Years: 1
 * Annual Interest Rate: 7
 *
 * Monthly Payment: 865.26
 * Total Payment: 10383.21
 *
 * Payment#     Interest     Principal      Balance
 * 1            58.33        806.93         9193.07
 * 2            53.62        811.64         8381.43
 * ...
 * 11           10.0         855.26          860.27
 * 12            5.01        860.25            0.01
 */

public class Exercise5_22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the loan amount: ");
        double loan = input.nextDouble();

        System.out.println("Enter the loan period in number of years: ");
        int years = input.nextInt();

        System.out.println("Enter the annual interest rate: ");
        double interestRate = input.nextDouble();

        double monthlyInterest = interestRate / 1200;

        double monthlyPayment = loan * monthlyInterest / (1-1 / Math.pow(1 + monthlyInterest, years * 12));
        System.out.println("Monthly Payment: " + Math.round(monthlyPayment * 100) / 100.0);

        double totalPayment = monthlyPayment * 12 * years;
        System.out.println("Total Payment: " + Math.round(totalPayment * 100) / 100.0);

        double balance = loan;

        double principal;

        System.out.println();

        System.out.println("Payment #      Interest       Principal      Balance");

        for (int payment = 1; payment <= years * 12; payment++){
            System.out.print(payment + "\t");

            double interest = monthlyInterest * balance;
            //System.out.print(Math.round(interest * 100) / 100.0);
            System.out.printf("%16.2f", interest);

            principal = monthlyPayment - interest;
            System.out.printf("%16.2f", principal);

            balance = balance - principal;
            System.out.printf("%16.2f", balance);

            System.out.println();
        }
    }
}
