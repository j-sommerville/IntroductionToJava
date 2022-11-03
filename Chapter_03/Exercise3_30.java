package Chapter_03;
import java.util.Scanner;

/* 3.30 (Current time) Revise Programming Exercise 2.8 to display the hour using a 12-hour clock. Here is a sample run:
 * Enter the time zone offset to GMT: -5
 * The current time is 4:50:34 AM
 */

public class Exercise3_30 {
    public static void main(String[] args) {
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
        
        String time = null;

        if(currentHour < 12 ){
            time = "AM";
        }
        if(currentHour >= 12){
            time = "PM";
            currentHour -= 12;
        }

        System.out.println("The current time is: " + currentHour + ":" + currentMinute + ":" + currentSeconds + " " + time);

    }
}
