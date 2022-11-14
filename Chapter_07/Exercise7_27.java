package Chapter_07;
import java.util.Arrays;
import java.util.Scanner;

/* 7.27 (Identical arrays) The arrays list1 and list2 are identical if they have the same contents. Write a method that
 * returns true if list1 and list2 are identical, using the following header:
 * public static boolean equals(int[] list1, int[] list2)
 * Write a test program that prompts the user to enter two lists of integers and displays whether the two are identical.
 * Here are the sample runs. Note that the first number in the input indicates the number of the elements in the list.
 * This number is not part of the list.
 * Enter list1: 5 2 5 6 6 1
 * Enter list2: 5 5 2 6 1 6
 * Two lists are identical
 * Enter list1: 5 5 5 6 6 1
 * Enter list2: 5 2 5 6 1 6
 * Two lists are not identical
 */

public class Exercise7_27 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter list1: ");
        int nums1 = input.nextInt();

        int[] list1 = new int[nums1];
        for (int i = 0; i < list1.length; i++){
            list1[i] = input.nextInt();
        }

        System.out.println("Enter list2: ");
        int nums2 = input.nextInt();

        int[] list2 = new int[nums2];
        for (int i = 0; i < list2.length; i++){
            list2[i] = input.nextInt();
        }
        if(equals(list1, list2)){
            System.out.println("The two lists are identical");
        }
        else{
            System.out.println("The two lists are not identical");
        }

    }

    public static void sort(int[] list){

        for(int i = 0; i < list.length - 1; i++){
            int min = list[i];
            int minIndex = i;

            for (int j = i + 1; j < list.length; j++)
            if (min > list[j]){
                min = list[j];
                minIndex = j;
            }

            if(minIndex != i){
                list[minIndex] = list[i];
                list[i] = min;
            }
        }
    }
    public static boolean equals(int[] list1, int[] list2){
        boolean equals = true;

        sort(list1);
        sort(list2);

        if(list1.length != list2.length){
            equals = false;
        }

        for(int i = 0; i < list1.length; i++){
            if(list1[i] != list2[i]) {
                equals = false;
            }
        }
        return equals;
    }
}
