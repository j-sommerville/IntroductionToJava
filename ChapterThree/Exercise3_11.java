package ChapterThree;
import java.util.Scanner;

/* 3.11 (Find the number of days in a month) Write a program that prompts the user to enter the month and year and
 * displays the number of days in the month. For example, if the user entered month 2 and year 2012, the program should
 * display that February 2012 had 29 days. If the user entered month 3 and year 2015, the program should display that
 * March 2015 had 31 days.
 */

public class Exercise3_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the month as an integer (ex: January is 1 and December is 12: ");
        int month = input.nextInt();

        System.out.println("Enter the year: ");
        int year = input.nextInt();

        switch(month){
            case 1:
                System.out.print("January");
                break;
            case 2:
                System.out.print("February");
                break;
            case 3:
                System.out.print("March");
                break;
            case 4:
                System.out.print("April");
                break;
            case 5:
                System.out.print("May");
                break;
            case 6:
                System.out.print("June");
                break;
            case 7:
                System.out.print("July");
                break;
            case 8:
                System.out.print("August");
                break;
            case 9:
                System.out.print("September");
                break;
            case 10:
                System.out.print("October");
                break;
            case 11:
                System.out.print("November");
                break;
            case 12:
                System.out.print("December");
                break;
        }

        int days = 31;
        switch(month){
            case 2:
                if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)){
                    days = 29;
                    break;
                }
                days = 28;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                days = 30;
                break;
        }

        System.out.print(" " + year + " had " + days + " days.");
    }
}
