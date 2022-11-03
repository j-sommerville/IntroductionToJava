package Chapter_05;
import java.util.Scanner;

/* 5.49 (Count vowels and consonants) Assume letters A, E, I, O, and U as the vowels. Write a program that prompts the
 * user to enter a string and displays the number of vowels and consonants in the string.
 * Enter a string: Programming is fun
 * The number of vowels is 5
 * The number of consonants is 11
 */

public class Exercise5_49 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String x = input.nextLine();

        x = x.toUpperCase();

        int vowels = 0;
        int consonants = 0;

        for(int i = 0; i <= x.length() - 1; i++){
            if(x.charAt(i) == ' '){
                continue;
            }
            else if(x.charAt(i) == ('A') || x.charAt(i) == ('E') || x.charAt(i) == ('I') || x.charAt(i) == ('O')
                    || x.charAt(i) == ('U')){
                vowels++;
            }
            else {
                consonants++;
            }
        }

        System.out.println("The number of vowels is " + vowels);
        System.out.println("The number of consonants is " + consonants);
    }

}
