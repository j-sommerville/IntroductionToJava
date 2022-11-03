package ChapterSix;
import java.util.Scanner;

/* 6.7 (Financial application: compute the future investment value) Write a method that computes future investment
 * value at a given interest rate for a specified number of years. The future investment is determined using the formula
 * in Programming Exercise 2.21.
 * Use the following method header:
 * public static double futureInvestmentValue(double investmentAmount, double monthlyInterestRate, int years)
 * For example, futureInvestmentValue(10000, 0.05/12, 5) returns 12833.59.
 * Write a test program that prompts the user to enter the investment amount (e.g.,1000) and the interest rate
 * (e.g., 9%) and prints a table that displays future value for the years from 1 to 30, as shown below:
 */

public class Exercise6_07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the investment amount: ");
        double investment = input.nextDouble();

        System.out.println("Enter the annual interest rate (ex: 9 for 9%): ");
        double annualInterest = input.nextDouble();

        int years = 30;

        double monthlyInterest = annualInterest / 1200;


        System.out.println("The amount invested is: " + (int) investment);
        System.out.println("The annual interest rate is: " + (int) annualInterest);
        System.out.println("Years      Future Value");

        for (years = 1; years <= 30; years++) {
            System.out.printf("%-11d", years);
            System.out.printf("%-12.2f", Math.round(futureInvestmentValue(investment, monthlyInterest, years) * 100) / 100.0);
            System.out.println();
        }
    }

    public static double futureInvestmentValue(double investmentAmount, double monthlyInterestRate, int years){
        return investmentAmount * Math.pow(1 + monthlyInterestRate, years * 12);
    }
}
