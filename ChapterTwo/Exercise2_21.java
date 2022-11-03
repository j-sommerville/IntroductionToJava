package ChapterTwo;
import java.util.Scanner;

/* 2.21 (Financial application: calculate future investment value) Write a program that reads in investment amount,
 * annual interest rate, and number of years, and displays the future investment value using the following formula:
 * futureInvestmentValue = investmentAmount * (1 + monthlyInterestRate)^numberOfYears*12
 * For example, if you enter amount 1000, annual interest rate 3.25%, and number of years 1, the future investment
 * value is 1032.98. Here is a sample run:
 * Enter investment amount: 1000.56
 * Enter annual interest rate in percentage: 4.25
 * Enter number of years: 1
 * Accumulated value is $1043.92
 */

public class Exercise2_21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the investment amount: ");
        double investment = input.nextDouble();

        System.out.println("Enter the annual interest rate as a percentage: ");
        double interest = input.nextDouble();

        System.out.println("Enter the number of years: ");
        double years = input.nextDouble();

        double monthlyInterest = interest / 1200;

        double futureInvestmentValue = investment * (Math.pow((1 + monthlyInterest), (years * 12)));

        System.out.println("The future investment value is " + Math.round(futureInvestmentValue * 100) / 100.0);
    }
}
