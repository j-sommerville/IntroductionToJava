package ChapterThree;
import java.util.Scanner;

/* 3.12 (Palindrome number) Write a program that prompts the user to enter a three-digit integer and determines
 * whether it is a palindrome number. A number is palindrome if it reads the same from right to left and from left to
 * right. Here is a sample run of this program:
 * Enter a three-digit integer: 121
 * 121 is a palindrome
 * Enter a three-digit integer: 123
 * 123 is not a palindrome
 */

public class Exercise3_12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a 3 digit integer: ");
        int num = input.nextInt();

        int num1 = num / 100;
        int num3 = num % 10;

        if(num3 == num1){
            System.out.println(num + " is a palindrome");
        }
        else{
            System.out.println(num + " is not a palindrome");
        }


    }
}
