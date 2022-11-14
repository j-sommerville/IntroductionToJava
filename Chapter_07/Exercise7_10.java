package Chapter_07;

/* 7.10 (Find the index of the smallest element) Write a method that returns the index of the smallest element in an
 * array of integers. If the number of such elements is greater than 1, return the smallest index. Use the following
 * header:
 * public static int indexOfSmallestElement(double[] array)
 * Write a test program that prompts the user to enter ten numbers, invokes this method to return the index of the
 * smallest element, and displays the index.
 */

import java.util.Scanner;

public class Exercise7_10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter ten numbers: ");


        double[] numbers = new double[10];

        for (int i = 0; i < numbers.length; i++){
            numbers[i] = input.nextDouble();
        }

        System.out.println("The index of the smallest element index is " + indexOfSmallestElement(numbers));
    }

    public static int indexOfSmallestElement(double[] array){
        double min = array[0];
        int index = 0;


        for(int i = 0; i < array.length; i++){
            if(min > array[i]){
                min = (array[i]);
                index = i;
            }
        }

        return index;
    }
}
