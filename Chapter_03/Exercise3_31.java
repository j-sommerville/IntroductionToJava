package Chapter_03;
import java.util.Scanner;

/* 3.31 (Financials: currency exchange) Write a program that prompts the user to enter the exchange rate from currency
 * in U.S. dollars to Chinese RMB. Prompt the user to enter 0 to convert from U.S. dollars to Chinese RMB and 1 to
 * convert from Chinese RMB and U.S. dollars. Prompt the user to enter the amount in U.S. dollars or Chinese RMB to
 * convert it to Chinese RMB or U.S. dollars, respectively. Here are the sample runs:
 * Enter the exchange rate from dollars to RMB: 6.81
 * Enter 0 to convert dollars to RMB and 1 vice versa: 0
 * Enter the dollar amount: 100
 * $100.0 is 681.0 yuan
 * Enter the exchange rate from dollars to RMB: 6.81
 * Enter 0 to convert dollars to RMB and 1 vice versa: 5
 * Enter the RMB amount: 10000
 * 10000.0 yuan is $1468.43
 * Enter the exchange rate from dollars to RMB: 6.81
 * Enter 0 to convert dollars to RMB and 1 vice versa: 5
 * Incorrect input
 */

public class Exercise3_31 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the exchange rate from currency in U.S. dollars to Chinese RMB: ");
        double exchangeRate = input.nextDouble();

        System.out.println("Enter 0 to convert dollars to RMB and 1 to convert RMB to dollars: ");
        double converter = input.nextDouble();

        System.out.println("Enter the dollar amount: ");
        double amount = input.nextDouble();


        double finalamount = 0;

        if(converter == 0){
            finalamount = amount * exchangeRate;
            System.out.println("$" + amount + " is " + Math.round(finalamount * 100) / 100.0 + " yuan");
        }
        if(converter == 1){
            finalamount = amount / exchangeRate;
            System.out.println(amount + " yuan is $" + Math.round(finalamount * 100) / 100.0);
        }
        else{
            System.out.println("Incorrect input");
        }
    }
}
