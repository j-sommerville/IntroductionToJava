package Chapter_07;
import java.util.Scanner;

/* 7.18 (Bubble sort) Write a sort method that uses the bubble-sort algorithm. The bubblesort algorithm makes several
 * passes through the array. On each pass, successive neighboring pairs are compared. If a pair is not in order, its
 * values are swapped; otherwise, the values remain unchanged. The technique is called a bubble sort or sinking sort
 * because the smaller values gradually “bubble” their way to the top and the larger values “sink” to the bottom. Write
 * a test program that reads in ten double numbers, invokes the method, and displays the sorted numbers.
 */

public class Exercise7_18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[] nums = new double[10];
        System.out.println("Enter ten double numbers: ");

        for (int i = 0; i < nums.length; i++) {
            double numbers = input.nextDouble();
            nums[i] = numbers;
        }

        System.out.print("You entered: ");
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }

        System.out.println();
        bubbleSort(nums);
        System.out.print("The numbers in a sorted order are: ");
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }

    public static void bubbleSort(double[] numbers) {
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = 0; j < numbers.length - i - 1; j++) {
                if (numbers[j] > numbers[(j + 1)]) {
                    double min = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = min;
                }
            }
        }
    }
}
