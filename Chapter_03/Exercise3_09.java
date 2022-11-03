package Chapter_03;
import java.util.Scanner;

/* 3.9 (Business: check ISBN-10) An ISBN-10 (International Standard Book Number) consists of 10 digits:
 * d1d2d3d4d5d6d7d8d9d10. The last digit, d10, is a checksum, which is calculated from the other nine digits using the
 * following formula:
 * (d1 x 1 x d2 x 2 x d3 x 3 x d4 x 4 x d5 x 5 x d6 x 6 x d7 x 7 x d8 x 8 x d9 x 9) % 11
 * If the checksum is 10, the last digit is denoted as X according to the ISBN-10 convention. Write a program that
 * prompts the user to enter the first 9 digits and displays the 10-digit ISBN (including leading zeros). Your program
 * should read the input as an integer. Here are sample runs:
 * Enter the first 9 digits of an ISBN as integer: 013601267
 * The ISBN-10 number is 0136012671
 * Enter the first 9 digits of an ISBN as integer: 013031997
 * The ISBN-10 number is 013031997X
 */

public class Exercise3_09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter digit 1: ");
        int d1 = input.nextInt();

        System.out.println("Enter digit 2: ");
        int d2 = input.nextInt();

        System.out.println("Enter digit 3: ");
        int d3 = input.nextInt();

        System.out.println("Enter digit 4: ");
        int d4 = input.nextInt();

        System.out.println("Enter digit 5: ");
        int d5 = input.nextInt();

        System.out.println("Enter digit 6: ");
        int d6 = input.nextInt();

        System.out.println("Enter digit 7: ");
        int d7 = input.nextInt();

        System.out.println("Enter digit 8: ");
        int d8 = input.nextInt();

        System.out.println("Enter digit 9: ");
        int d9 = input.nextInt();

        int d10 = (d1 * 1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 + d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9) % 11;

        if(d10 == 10){
            System.out.println("The ISBN-10 number is " + d1 + d2 + d3 + d4 + d5 + d6 + d7 + d8 + d9 + "X");
        }
        else{
            System.out.println("The ISBN-10 number is " + d1 + d2 + d3 + d4 + d5 + d6 + d7 + d8 + d9 + d10);
        }
    }
}

