package Chapter_07;
import java.util.Scanner;

/* 7.3 (Count occurrence of numbers) Write a program that reads the integers between 1 and 100 and counts the
 * occurrences of each. Assume the input ends with 0. Here is a sample run of the program:
 * Enter the integers between 1 and 100: 2 5 6 5 4 3 23 43 2 0
 * 2 occurs 2 times
 * 3 occurs 1 time
 * 4 occurs 1 time
 * 5 occurs 2 times
 * 6 occurs 1 time
 * 23 occurs 1 time
 * 43 occurs 1 time
 * Note that if a number occurs more than one time, the plural word “times” is used in the output.
 */

public class Exercise7_03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter integers between 1 and 100 (enter 0 when finished): ");

        int[] integers = new int[100];
        int numbers;
        int i = 0;

        do{
            numbers = input.nextInt();
            integers[i] = numbers;
            i++;
        }
        while(numbers != 0);

        countNumbers(integers);
    }

    public static void countNumbers(int[] integers){
        for(int i = 1; i <= integers.length; i++){
            int count = 0;
            for(int j = 0; j < integers.length; j++){
                if(integers[j] == i){
                    count++;
                }
            }
            if(count != 0){
                if(count > 1) {
                    System.out.println(i + " occurs " + count + " times");
                }
                else {
                    System.out.println(i + " occurs " + count + " time");
                }
            }
        }
    }
}
