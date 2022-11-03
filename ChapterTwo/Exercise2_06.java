package ChapterTwo;
import java.util.Scanner;

/* 2.6 (Sum the digits in an integer) Write a program that reads an integer between 0 and 1000 and adds all the digits
 * in the integer. For example, if an integer is 932, the sum of all its digits is 14.
 * Hint: Use the % operator to extract digits, and use the / operator to remove the extracted digit. For instance,
 * 932 % 10 = 2 and 932 / 10 = 93.
 * Here is a sample run:
 * Enter a number between 0 and 1000: 999
 * The sum of the digits is 27
 */

public class Exercise2_06 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number between 0 and 1000: ");
        double number = input.nextDouble();

        int number1 = (int) number % 10;
        int number2 = (int) (number % 100) / 10;
        int number3 = (int) ((number / 10) / 10);

        int sum = number1 + number2 + number3;

        System.out.println("The sum of the digits is " + sum);

        //Alternative Method

        int numSum = 0;
        while (number > 0){
            numSum += number % 10;
            number /= 10;
        }
        System.out.println("The sum of the digits is " + numSum);
    }
}
