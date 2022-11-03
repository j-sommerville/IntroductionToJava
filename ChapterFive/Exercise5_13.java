package ChapterFive;

/* 5.13(Find the largest n such that n^3 < 12,000) Use a while loop to find the largest integer n such that n^3 is less
 * than 12,000.
 */

public class Exercise5_13 {
    public static void main(String[] args) {
        int n = 1;

        while((Math.pow(n,3)) < 12000){
            n++;
        }
        n--;
        System.out.println("The largest integer n is " + n + " and " + n + "^3 is " + (Math.pow(n , 3)));
    }
}
