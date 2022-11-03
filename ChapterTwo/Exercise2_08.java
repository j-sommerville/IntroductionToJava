package ChapterTwo;
import java.util.Scanner;

/* 2.8 (Current time) Listing 2.7, ShowCurrentTime.java, gives a program that displays the current time in GMT. Revise
 * the program so that it prompts the user to enter the time zone offset to GMT and displays the time in the specified
 * time zone. Here is a sample run:
 * Enter the time zone offset to GMT: −5
 * The current time is 4:50:34
 */

public class Exercise2_08 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the time zone offset to GMT: ");
        int gmtTime = input.nextInt();

        long milliSeconds = System.currentTimeMillis();

        long seconds = milliSeconds / 1000;
        long currentSeconds = seconds % 60;

        long minutes = seconds / 60;
        long currentMinute = minutes % 60;

        long hours = minutes / 60;
        long currentHour = hours % 24;

        currentHour += gmtTime;

        System.out.println("The current time is: " + currentHour + ":" + currentMinute + ":" + currentSeconds);

    }
}
