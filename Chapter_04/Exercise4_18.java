package Chapter_04;
import java.util.Scanner;

/* 4.18(Student major and status) Write a program that prompts the user to enter two characters and displays the major
 * and status represented in the characters. The first character indicates the major and the second is number character
 * 1, 2, 3, 4, which indicates whether a student is a freshman, sophomore, junior, or senior. Suppose the following
 * characters are used to denote the majors:
 * M: Mathematics
 * C: Computer Science
 * I: Information Technology
 * Here is a sample run:
 * Enter two characters: M1
 * Mathematics Freshman
 * Enter two characters: C3
 * Computer Science Junior
 * Enter two characters: T3
 * Invalid input
 */

public class Exercise4_18 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("M: Mathematics");
        System.out.println("C: Computer Science");
        System.out.println("I: Information Technology");
        System.out.println("Enter the character (M, C or I) that indicates your major: ");
        String major = input.next();

        System.out.println("1: Freshman");
        System.out.println("2: Sophomore");
        System.out.println("3: Junior");
        System.out.println("4: Senior");
        System.out.println("Enter the number (1, 2, 3 or 4) that indicates your class status: ");
        int status = input.nextInt();

        if (major.equalsIgnoreCase("M")){
            System.out.print("Mathematics");
            if (status == 1){
                System.out.print(" Freshman");
            }
            else if (status == 2) {
                System.out.print(" Sophomore");
            }
            else if (status == 3) {
                System.out.print(" Junior");
            }
            else if (status == 4) {
                System.out.print(" Senior");
            }
        }
        if (major.equalsIgnoreCase("C")){
            System.out.print("Computer Science");
            if (status == 1){
                System.out.print(" Freshman");
            }
            else if (status == 2) {
                System.out.print(" Sophomore");
            }
            else if (status == 3) {
                System.out.print(" Junior");
            }
            else if (status == 4) {
                System.out.print(" Senior");
            }
        }
        if (major.equalsIgnoreCase("I")){
            System.out.print("Information Technology");
            if (status == 1){
                System.out.print(" Freshman");
            }
            else if (status == 2) {
                System.out.print(" Sophomore");
            }
            else if (status == 3) {
                System.out.print(" Junior");
            }
            else if (status == 4) {
                System.out.print(" Senior");
            }
        }
        else{
            System.out.println("Invalid input");
        }
    }
}
