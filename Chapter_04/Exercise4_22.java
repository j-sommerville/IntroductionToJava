package Chapter_04;
import java.util.Scanner;

/* 4.22(Check substring) Write a program that prompts the user to enter two strings and reports whether the second
 * string is a substring of the first string.
 * Enter string s1: ABCD
 * Enter string s2: BC
 * BC is a substring of ABCD
 * Enter string s1: ABCD
 * Enter string s2: BDC
 * BDC is not a substring of ABCD
 */

public class Exercise4_22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter string one: ");
        String one = input.next();

        System.out.println("Enter string one: ");
        String two = input.next();

        if (one.contains(two)){
            System.out.println(two + " is a substring of " + one);
        }
        else {
            System.out.println(two + " is not a substring of " + one);
        }
    }
}
