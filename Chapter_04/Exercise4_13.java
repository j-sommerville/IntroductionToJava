package Chapter_04;
import java.util.Scanner;

/* 4.13(Vowel or consonant?) Write a program that prompts the user to enter a letter and check whether the letter is a
 * vowel or consonant. Here is a sample run:
 * Enter a letter: B
 * B is a consonant
 * Enter a letter grade: a
 * a is a vowel
 * Enter a letter grade: #
 * # is an invalid input
 */

public class Exercise4_13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a letter: ");
        String value = input.next();

        char vowels = Character.toUpperCase(value.charAt(0));
        char consonants = Character.toUpperCase(value.charAt(0));

        if(vowels == 'A' || vowels == 'E' || vowels == 'I' || vowels == 'O' || vowels == 'U' ){
            System.out.println(value + " is a vowel!");
        }

        if (Character.isLetter(consonants)){
            System.out.println(value + " is a consonant!");
        }

        if(vowels > 'Z' || vowels < 'A'){
            System.out.println("Invalid input");
        }
    }
}
