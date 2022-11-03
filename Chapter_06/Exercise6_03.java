package Chapter_06;
import java.util.Scanner;

/* 6.3 (Palindrome integer) Write the methods with the following headers
 * // Return the reversal of an integer, i.e., reverse(456) returns 654
 * public static int reverse(int number)
 * // Return true if number is a palindrome
 * public static boolean isPalindrome(int number)
 * Use the reverse method to implement isPalindrome. A number is a palindrome if its reversal is the same as itself.
 * Write a test program that prompts the user to enter an integer and reports whether the integer is a palindrome.
 */

public class Exercise6_03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter an integer: ");
        int num = input.nextInt();

        if (isPalindrome(num)){
            System.out.print(num + " is a palindrome");
        }
        else {
            System.out.print(num + " is not a palindrome");
        }
    }

    public static int reverse(int num){
        int reverse = 0;
        int remainder;

        while(num != 0){
            remainder = num % 10;
            reverse = reverse * 10 + remainder;
            num /= 10;
        }
        return reverse;
    }

    public static boolean isPalindrome(int num){
        return (num == reverse(num));
    }
}
