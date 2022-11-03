package ChapterFive;
import java.util.Scanner;

/* 5.21(Financial application: compare loans with various interest rates) Write a program that lets the user enter
 * the loan amount and loan period in number of years and displays the monthly and total payments for each interest
 * rate starting from 5% to 8%, with an increment of 1/8. Here is a sample run:
 * Loan Amount: 10000
 * Number of Years: 5
 * Interest Rate    Monthly Payment    Total Payment
 * 5.000%           188.71             11322.74
 * 5.125%           189.29             11357.13
 * 5.250%           189.86             11391.59
 * ...
 * 7.875%           202.17             12129.97
 * 8.000%           202.76             12165.84
 */

public class Exercise5_21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the loan amount: ");
        double loan = input.nextDouble();

        System.out.println("Enter the loan period in number of years: ");
        int years = input.nextInt();

        System.out.println("Loan Amount: " + Math.round(loan));
        System.out.println("Number of years: " + years);

        System.out.println("Interest Rate   Monthly Payment   TotalPayment");

        for(double interest = 5.0; interest <= 8.0; interest += 0.125){
            System.out.printf("%.3f", interest);
            System.out.print("%          ");

            double monthlyInterest = interest / 1200;

            double monthlyPayment = loan * monthlyInterest / (1-1 / Math.pow(1 + monthlyInterest, years * 12));
            System.out.printf("%-18.2f", monthlyPayment);

            double totalPayment = monthlyPayment * years * 12;
            System.out.printf("%.2f", totalPayment);

            System.out.println();
        }
    }
}
