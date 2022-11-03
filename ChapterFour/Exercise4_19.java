package ChapterFour;
import java.util.Scanner;

/* 4.19(Business: check ISBN-10) Rewrite the Programming Exercise 3.9 by entering the ISBN number as a string.
 */

public class Exercise4_19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter digit 1: ");
        String d1 = input.next();

        System.out.println("Enter digit 2: ");
        String d2 = input.next();

        System.out.println("Enter digit 3: ");
        String d3 = input.next();

        System.out.println("Enter digit 4: ");
        String d4 = input.next();

        System.out.println("Enter digit 5: ");
        String d5 = input.next();

        System.out.println("Enter digit 6: ");
        String d6 = input.next();


        System.out.println("Enter digit 7: ");
        String d7 = input.next();

        System.out.println("Enter digit 8: ");
        String d8 = input.next();

        System.out.println("Enter digit 9: ");
        String d9 = input.next();

        int d10 = ((Integer.parseInt(String.valueOf(d1)) * 1) + (Integer.parseInt(String.valueOf(d2)) * 2) +
                (Integer.parseInt(String.valueOf(d3)) * 3) + (Integer.parseInt(String.valueOf(d4)) * 4) +
                (Integer.parseInt(String.valueOf(d5)) * 5) + (Integer.parseInt(String.valueOf(d6)) * 6) +
                (Integer.parseInt(String.valueOf(d7)) * 7) + (Integer.parseInt(String.valueOf(d8)) * 8) +
                (Integer.parseInt(String.valueOf(d9)) * 9) % 11);

        if(d10 == 10){
            System.out.println("The ISBN-10 number is " + (Integer.parseInt(String.valueOf(d1))) +
                    (Integer.parseInt(String.valueOf(d2))) + (Integer.parseInt(String.valueOf(d3))) +
                    (Integer.parseInt(String.valueOf(d4))) + (Integer.parseInt(String.valueOf(d5))) +
                    (Integer.parseInt(String.valueOf(d6))) + (Integer.parseInt(String.valueOf(d7))) +
                    (Integer.parseInt(String.valueOf(d8))) + (Integer.parseInt(String.valueOf(d9))) + "X");
        }
        else{
            System.out.println("The ISBN-10 number is " + d1 + d2 + d3 + d4 + d5 + d6 + d7 + d8 + d9 + d10);
        }
    }
}
