package Chapter_03;
import java.util.Scanner;

/* 3.7 (Financial application: monetary units) Modify Listing 2.10, ComputeChange .java, to display the nonzero
 * denominations only, using singular words for single units such as 1 dollar and 1 penny, and plural words for more
 * than one unit such as 2 dollars and 3 pennies.
 */

public class Exercise3_08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter integer 1: ");
        int integer1 = input.nextInt();

        System.out.println("Enter integer 2: ");
        int integer2 = input.nextInt();

        System.out.println("Enter integer 3: ");
        int integer3 = input.nextInt();

        int temp = 0;

        if(integer1 > integer2){
            temp = integer1;
            integer1 = integer2;
            integer2 = temp;
        }
        if(integer2 > integer3){
            temp = integer2;
            integer2 = integer3;
            integer3 = temp;
        }
        if(integer1 > integer2){
            temp = integer1;
            integer1 = integer2;
            integer2 = temp;
        }

        System.out.println("The integers you entered are: " + integer1 + " " + integer2 + " " + integer3);
    }
}
