package Chapter_07;
import java.util.Scanner;

/* 7.2 (Reverse the numbers entered) Write a program that reads ten integers and displays them in the reverse of the
 * order in which they were read.
 */

public class Exercise7_02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter 10 integers: ");
        int[] numbers = new int[10];

        for(int i = 0; i < numbers.length; i++){
            numbers[i] = input.nextInt();
        }

        System.out.print("The integers you entered are: ");
        for(int i = 0; i < numbers.length; i++){
            System.out.print(numbers[i] + " ");
        }

        System.out.println();
        System.out.print("The integers in reverse order are: ");
        reverse(numbers);
    }

    public static void reverse(int[] numbers){
        for(int i = numbers.length - 1; i >= 0; i--){
            System.out.print(numbers[i] + " ");
        }
    }
}
