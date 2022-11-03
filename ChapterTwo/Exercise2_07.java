package ChapterTwo;
import java.util.Scanner;

/* 2.7 (Find the number of years) Write a program that prompts the user to enter the minutes (e.g., 1 billion), and
 * displays the number of years and days for the minutes. For simplicity, assume a year has 365 days. Here is a sample
 * run:
 * Enter the number of minutes: 1000000000
 * 1000000000 minutes is approximately 1902 years and 214 days
 */

public class Exercise2_07 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of minutes: ");
        int minutes = input.nextInt();
        int minutesInYear = 525600;
        int minutesInDay = 1440;
        int years = minutes / minutesInYear;
        int days = (minutes % minutesInYear) / minutesInDay;
        System.out.println(minutes + " is approximately " + years + " years and " + days + " days.");
    }
}
