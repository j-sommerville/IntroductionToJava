package ChapterOne;

/* 1.10 (Average speed in miles) Assume a runner runs 14 kilometers in 45 minutes and 30 seconds. Write a program that
 * displays the average speed in miles per hour. (Note that 1 mile is 1.6 kilometers.)
 */

public class Exercise1_10 {
    public static void main(String[] args) {
        double miles;
        double kilometers;
        double mph = 45.5 / 60;
        double averageSpeed = (14 / 1.6) / mph;
        System.out.println(averageSpeed);
    }
}
