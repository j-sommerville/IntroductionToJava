package Chapter_01;

/* 1.12 (Average speed in kilometers) Assume a runner runs 24 miles in 1 hour, 40 minutes, and 35 seconds. Write a
 * program that displays the average speed in kilometers per hour. (Note that 1 mile is 1.6 kilometers.)
 */

public class Exercise1_12 {
    public static void main(String[] args) {
        double totalSeconds = 6035;
        double totalMiles = 24;
        double totalHours = (totalSeconds / 60) / 60;
        double totalKilometers = totalMiles * 1.6;
        double kph = totalKilometers / totalHours;
        System.out.println(kph);
    }
}
