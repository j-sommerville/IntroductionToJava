package Chapter_04;
import java.util.Scanner;

/* 4.14 (Convert letter grade to number) Write a program that prompts the user to enter a letter grade A, B, C, D, or F
 * and displays its corresponding numeric value 4, 3, 2, 1, or 0. Here is a sample run:
 * Enter a letter grade: B
 * The numeric value for grade B is 3
 * Enter a letter grade: T
 * T is an invalid grade
 */

public class Exercise4_14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a letter grade (A, B, C, D, or F): ");
        String grade = input.nextLine();

        char grades = Character.toUpperCase(grade.charAt(0));
        char number = 0;


        if (grades == 'A'){
            System.out.println("The numeric value for grade " + grades + " is 4");
        }

        else if (grades == 'B'){
            System.out.println("The numeric value for grade " + grades + " is 3");
        }

        else if (grades == 'C'){
            System.out.println("The numeric value for grade " + grades + " is 2");
        }

        else if (grades == 'D'){
            System.out.println("The numeric value for grade " + grades + " is 1");
        }

        else if (grades == 'F'){
            System.out.println("The numeric value for grade " + grades + " is 0");
        }

        else {//(grades != 'A' || grades != 'B' || grades != 'C' || grades != 'D' || grades != 'F')
            System.out.println("Invalid input");
        }
    }
}
