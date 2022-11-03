package ChapterFive;
import java.util.Scanner;

/* 5.16(Find the factors of an integer) Write a program that reads an integer and displays all its smallest factors in
 * increasing order. For example, if the input integer is 120, the output should be as follows: 2,2,2,3,5.
 */

public class Exercise5_16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter an integer: ");
        int num = input.nextInt();
        int i = 2;

        while (num / i != 1){
            if(num % i == 0){
                System.out.print(i + ",");
                num /= i;
            }
            else {
                i++;
            }
        }
        System.out.println(num + ".");
    }
}
