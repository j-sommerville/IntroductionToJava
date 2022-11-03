package ChapterFour;
import java.util.Scanner;

/* 4.23(Financial application: payroll) Write a program that reads the following information and prints a payroll
 * statement:
 *  Employee’s name (e.g., Smith)
 *  Number of hours worked in a week (e.g., 10)
 *  Hourly pay rate (e.g., 9.75)
 *  Federal tax withholding rate (e.g., 20%)
 *  State tax withholding rate (e.g., 9%)
 * A sample run is shown below:
 * Enter employee's name: Smith
 * Enter number of hours worked in a week: 10
 * Enter hourly pay rate: 9.75
 * Enter federal tax withholding rate: 0.20
 * Enter state tax withholding rate: 0.09
 * Employee Name: Smith
 * Hours Worked: 10.0
 * Pay Rate: $9.75
 * Gross Pay: $97.5
 * Deductions:
 *  Federal Withholding (20.0%): $19.5
 *  State Withholding (9.0%): $8.77
 *  Total Deduction: $28.27
 * Net Pay: $69.22
 */

public class Exercise4_23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter employee's name: ");
        String name = input.next();

        System.out.println("Enter number of hours worked in a week: ");
        double hours = input.nextDouble();

        System.out.println("Enter hourly pay rate: ");
        double rate = input.nextDouble();

        System.out.println("Enter federal tax withholding rate as a decimal (ex: 0.20): ");
        double federalTax = input.nextDouble();

        System.out.println("Enter state tax withholding rate: ");
        double stateTax = input.nextDouble();

        double grossPay = hours * rate;
        double federalWithholding = grossPay * federalTax;
        double stateWithholding = grossPay * stateTax;
        double totalDeduction = federalWithholding + stateWithholding;
        double netPay = grossPay - totalDeduction;

        System.out.println("Employee name: " + name);
        System.out.println("Hours worked: " + hours);
        System.out.println("Pay Rate: $" + rate);
        System.out.println("Gross Pay: $" + grossPay);
        System.out.println("Deductions:");
        System.out.println("\t Federal Withholding (" + (federalTax * 100) + "%): $" + federalWithholding);
        System.out.println("\t State Withholding (" + (stateTax * 100) + "%): $" + Math.round(stateWithholding * 100) / 100.0);
        System.out.println("\t Total Deduction: $" + Math.round(totalDeduction * 100) / 100.0);
        System.out.println("Net Pay: $" + Math.round(netPay * 100) / 100.0);
    }
}
