package ChapterOne;

/* 1.6 (Summation of a series) Write a program that displays the result of 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9.
 */

public class Exercise1_06 {
    public static void main(String[] args) {
        System.out.println(1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9);

        /* Alternative method
        int count = 0;
        int sum = 0;
        while(count < 10){
            sum += count;
            count++;
        }
        System.out.println(sum);
         */
    }
}
