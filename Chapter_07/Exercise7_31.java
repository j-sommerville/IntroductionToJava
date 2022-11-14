package Chapter_07;
import java.util.Scanner;

/* 7.31 (Merge two sorted lists) Write the following method that merges two sorted lists
 * into a new sorted list.
 * public static int[] merge(int[] list1, int[] list2)
 * Implement the method in a way that takes at most list1.length + list2.length comparisons. Write a test program that
 * prompts the user to enter two sorted lists and displays the merged list. Here is a sample run. Note that the first
 * number in the input indicates the number of the elements in the list. This number is not part of the list.
 */

public class Exercise7_31 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first sorted list of numbers: ");
        int nums1 = input.nextInt();

        int[] list1 = new int[nums1];

        for (int i = 0; i < list1.length; i++) {
            list1[i] = input.nextInt();
        }

        System.out.println("Enter the second sorted list of numbers: ");
        int nums2 = input.nextInt();

        int[] list2 = new int[nums2];

        for (int i = 0; i < list2.length; i++) {
            list2[i] = input.nextInt();
        }

        int[] merged = merge(list1, list2);

        System.out.print("The merged list is: ");

        for (int i = 0; i < list1.length + list2.length; i++) {
            System.out.print(merged[i] + " ");
        }

    }


    public static int[] merge(int[] list1, int[] list2) {
        int[] mergedList = new int[list1.length + list2.length];
        int mergedIndex = 0;
        int listOneIndex = 0;
        int listTwoIndex = 0;

        while(listOneIndex < list1.length && listTwoIndex < list2.length){
            if (list1[listOneIndex] < list2[listTwoIndex]) {
                mergedList[mergedIndex] = list1[listOneIndex];
                listOneIndex++;
            }
            else{
                mergedList[mergedIndex] = list2[listTwoIndex];
                listTwoIndex++;

            }
            mergedIndex++;
        }

        while(listOneIndex < list1.length){
            mergedList[mergedIndex] = list1[listOneIndex];
            mergedIndex++;
            listOneIndex++;
        }

        while(listTwoIndex < list2.length){
            mergedList[mergedIndex] = list2[listTwoIndex];
            mergedIndex++;
            listTwoIndex++;
        }

        return mergedList;
    }
}

