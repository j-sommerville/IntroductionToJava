package Chapter_07;

/* *7.7 (Count single digits) Write a program that generates 100 random integers between 0 and 9 and displays the count
 * for each number. (Hint: Use an array of ten integers, say counts, to store the counts for the number of 0s, 1s, . .
 * . , 9s.)
 */

public class Exercise7_07 {
    public static void main(String[] args) {

        int[] counts = new int[10];

        for(int i = 0; i < 100; i++){
            int random = (int) ((int) 0 + (Math.random() * 10));
            counts[random]++;
        }

        for(int j = 0; j < counts.length; j++){
            System.out.println(j + "s: " + counts[j]);
        }
    }
}
