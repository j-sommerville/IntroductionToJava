package Chapter_06;
import java.util.Scanner;

/* 6.5 (Sort three numbers) Write a method with the following header to display three numbers in increasing order:
 * public static void displaySortedNumbers( double num1, double num2, double num3)
 * Write a test program that prompts the user to enter three numbers and invokes the method to display them in
 * increasing order.
 */

public class Exercise6_05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter number 1: ");
        double number1 = input.nextDouble();

        System.out.println("Enter number 2: ");
        double number2 = input.nextDouble();

        System.out.println("Enter number 3: ");
        double number3 = input.nextDouble();

        displaySortedNumbers(number1, number2, number3);
    }

    public static void displaySortedNumbers(double num1, double num2, double num3){
        double temp;

        if(num3 > num2){
            temp = num2;
            num2 = num3;
            num3 = temp;
        }

        if(num2 > num1){
            temp = num1;
            num1 = num2;
            num2 = temp;
        }

        if(num3 > num2){
            temp = num2;
            num2 = num3;
            num3 = temp;
        }


        System.out.println("The numbers in increasing order are: " + num3 + " " +  num2 + " " + num1);
    }
}
