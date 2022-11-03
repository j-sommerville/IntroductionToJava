package Chapter_04;
import java.util.Scanner;

/* 4.21(Check SSN) Write a program that prompts the user to enter a Social Security number in the format DDD-DD-DDDD,
 * where D is a digit. Your program should check whether the input is valid. Here are sample runs:
 * Enter a SSN: 232-23-5435
 * 232-23-5435 is a valid social security number
 * Enter a SSN: 23-23-5435
 * 23-23-5435 is an invalid social security number
 */

public class Exercise4_21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a Social Security number in the format DDD-DD-DDDD, where D is a digit: ");
        String ssn = input.next();

        if ((ssn.length() < 11) || (ssn.length() > 11) || ssn.matches(".*[^a-z].*")){
            System.out.println(ssn + " is an invalid social security number");
       }
        else if(ssn.length() == 11 && ssn.charAt(3) == '-' && ssn.charAt(6) == '-'){
            System.out.println(ssn + " is a valid social security number");
        }
    }
}