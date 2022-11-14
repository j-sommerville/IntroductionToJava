package Chapter_07;

/* 7.19 (Sorted?) Write the following method that returns true if the list is already sorted in increasing order.
 * public static boolean isSorted(int[] list)
 * Write a test program that prompts the user to enter a list and displays whether the list is sorted or not. Here is
 * a sample run. Note that the first number in the input indicates the number of the elements in the list. This number
 * is not part of the list.
 */

import java.util.Scanner;

public class Exercise7_19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a list of numbers");
        int numbers = input.nextInt();

        int[] list = new int[numbers];

        for(int i = 0; i < list.length; i++){
            list[i] = input.nextInt();
        }

        if(isSorted(list)){
            System.out.println("The list is sorted");
        }
        else{
            System.out.println("the list is not sorted");
        }
    }

    public static boolean isSorted(int[] list){
        boolean sorted = true;

        for(int i = 0; i < list.length; i++){
            if(list[i] > list[i + 1]){
                sorted = false;
                break;
            }
        }
        return sorted;
    }
}
