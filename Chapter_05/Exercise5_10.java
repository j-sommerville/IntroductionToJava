package Chapter_05;

/* 5.10(Find numbers divisible by 5 and 6) Write a program that displays all the numbers from 100 to 1,000, ten per
 * line, that are divisible by 5 and 6.  Numbers are separated by exactly one space.
 */

public class Exercise5_10 {
    public static void main(String[] args) {
        int count = 0;

        for(int i = 100; i <= 1000; i++){
            if(i % 5 == 0 && i % 6 == 0){
                System.out.print(i + " ");
                count++;
            }
            if(count == 10){
                System.out.println("");
                count = 0;
            }
        }
    }
}
