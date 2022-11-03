package Chapter_05;
import java.util.Scanner;

/* 5.28(Display the first days of each month) Write a program that prompts the user to enter the year and first day
 * of the year, and displays the first day of each month in the year. For example, if the user entered the year 2013,
 * and 2 for Tuesday, January 1, 2013, your program should display the following output:
 * January 1, 2013 is Tuesday
 * ...
 * December 1, 2013 is Sunday
 */

public class Exercise5_28 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the year: ");
        int year = input.nextInt();

        System.out.println("Enter the first day of the year as a number (ex: 1 for Monday and 7 for Sunday: ");
        int num = input.nextInt();

        String months = null;
        String day = null;

        for (int month = 1; month <= 12; month++) {

            int totalDays = 30 + ((month + (int) (month / 8.0)) % 2);

            if (month == 2) {
                if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                    totalDays = 29;
                } else {
                    totalDays = 28;
                }
            }

            num = num % 7;

            switch(num){
                case 1:
                    day = "Monday";
                    break;
                case 2:
                    day = "Tuesday";
                    break;
                case 3:
                    day = "Wednesday";
                    break;
                case 4:
                    day = "Thursday";
                    break;
                case 5:
                    day = "Friday";
                    break;
                case 6:
                    day = "Saturday";
                    break;
                case 0:
                    day = "Sunday";
                    break;
            }


            switch (month) {
                case 1:
                    months = "January";
                    break;
                case 2:
                    months = "February";
                    break;
                case 3:
                    months = "March";
                    break;
                case 4:
                    months = "April";
                    break;
                case 5:
                    months = "May";
                    break;
                case 6:
                    months = "June";
                    break;
                case 7:
                    months = "July";
                    break;
                case 8:
                    months = "August";
                    break;
                case 9:
                    months = "September";
                    break;
                case 10:
                    months = "October";
                    break;
                case 11:
                    months = "November";
                    break;
                case 12:
                    months = "December";
                    break;
            }
            System.out.println(months + " 1, " + year + " is " + day);
            num += totalDays;
        }
    }
}
