package Chapter_04;
import java.util.Scanner;

/* 4.17 (Days of a month) Write a program that prompts the user to enter a year and the first three letters of a month
 * name (with the first letter in uppercase) and displays the number of days in the month. Here is a sample run:
 * Enter a year: 2001
 * Enter a month: Jan
 * Jan 2001 has 31 days
 * Enter a year: 2016
 * Enter a month: Feb
 * Jan 2016 has 29 days
 */

public class Exercise4_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a year: ");
        int year = input.nextInt();

        System.out.println("Enter the first three letters of a month name (with the first letter in uppercase): ");
        String month = input.next();

        if(month.length() > 3){
            System.out.println("Only enter the first three letters of the month name (with the first letter in uppercase): ");
        }

        int days = 0;

        if (month.equals("Jan") || month.equals("Mar") || month.equals("May") || month.equals("Jul")
                || month.equals("Aug") || month.equals("Oct") || month.equals("Dec")){
            days = 31;
        }
        else if(month.equals("Feb")){
            if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)){
                days = 29;
            }
            else{
                days = 28;
            }
        }
        else if(month.equals("Apr") || month.equals("Jun") || month.equals("Sep") || month.equals("Nov")){
            days = 30;
        }

        System.out.print(month + " " + year + " has " + days + " days.");

    }
}
