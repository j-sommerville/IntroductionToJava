package ChapterThree;
import java.util.Scanner;

/* 3.5 (Find future dates) Write a program that prompts the user to enter an integer for today’s day of the week
 * (Sunday is 0, Monday is 1, …, and Saturday is 6). Also prompt the user to enter the number of days after today for a
 * future day and display the future day of the week. Here is a sample run:
 * Enter today's day: 1
 * Enter the number of days elapsed since today: 3
 * Today is Monday and the future day is Thursday
 * Enter today's day: 0
 * Enter the number of days elapsed since today: 31
 * Today is Sunday and the future day is Wednesday
 */

public class Exercise3_05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter an integer between 0 and 6 for each day of the week (ex: Sunday is 0 and Saturday is 6):");
        int day = input.nextInt();

        System.out.println("Enter the number of days after today for a future date: ");
        int nextDate = input.nextInt();

        int futureDay = (day + nextDate) % 7;


        switch(day) {
        case 0:
        System.out.print("Today is Sunday and the future day is ");
        break;
        case 1:
        System.out.print("Today is Monday and the future day is ");
        break;
        case 2:
        System.out.print("Today is Tuesday and the future day is ");
        break;
        case 3:
        System.out.print("Today is Wednesday and the future day is ");
        break;
        case 4:
        System.out.print("Today is Thursday and the future day is ");
        break;
        case 5:
        System.out.print("Today is Friday and the future day is ");
        break;
        case 6:
        System.out.print("Today is Saturday and the future day is ");
        break;
        }

        switch(futureDay) {
        case 0:
            System.out.print("Sunday");
            break;
        case 1:
            System.out.print("Monday");
            break;
        case 2:
            System.out.print("Tuesday");
            break;
        case 3:
            System.out.print("Wednesday");
            break;
        case 4:
            System.out.print("Thursday");
            break;
        case 5:
            System.out.print("Friday");
            break;
        case 6:
            System.out.print("Saturday");
            break;
        }
    }
}
