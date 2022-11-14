package Chapter_07;
import java.util.Scanner;

/* 7.20 (Revise selection sort) In Section 7.11, you used selection sort to sort an array. The selection-sort method
 * repeatedly finds the smallest number in the current array and swaps it with the first. Rewrite this program by
 * finding the largest number and swapping it with the last. Write a test program that reads in ten double numbers,
 * invokes the method, and displays the sorted numbers.
 */

public class Exercise7_20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] nums = new double[10];

        System.out.println("Enter ten integers: ");
        for(int i = 0; i < nums.length; i++){
            double numbers = input.nextDouble();
            nums[i] = numbers;
        }

        System.out.print("The numbers you entered are: ");
        for(int i = 0; i < nums.length; i++){
            System.out.print(nums[i] + " ");
        }

        System.out.println();
        System.out.print("The numbers in a sorted order are: ");
        sortNumbers(nums);
        for(int i = 0; i < nums.length; i++){
            System.out.print(nums[i] + " ");
        }
    }

    public static void sortNumbers(double[] numbers){

        for(int i = numbers.length - 1; i >= 0; i--){
            double max = numbers[i];
            int maxIndex = i;

            for(int j = 0; j < i; j++){
                if(max < numbers[j]){
                    max = numbers[j];
                    maxIndex = j;
                }
            }

            if(maxIndex != i){
                numbers[maxIndex] = numbers[i];
                numbers[i] = max;
            }
        }
    }
}
