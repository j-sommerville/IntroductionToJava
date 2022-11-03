package ChapterTwo;
import java.util.Scanner;

/* 2.3 (Convert feet into meters) Write a program that reads a number in feet, converts it to meters, and displays the
 * result. One foot is 0.305 meter. Here is a sample run:
 * Enter a value for feet: 16.5
 * 16.5 feet is 5.0325 meters
 */

public class Exercise2_03 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a value for feet: ");
        double feet = input.nextDouble();
        System.out.println("You entered " + feet);
        double meters = feet * 0.305;
        System.out.println(feet + " feet is " + meters + " meters.");
    }
}
