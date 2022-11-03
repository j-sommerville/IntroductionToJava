package Chapter_05;

/* 5.15(Display the ASCII character table) Write a program that prints the characters in the ASCII character table
 * from ! to ~. Display ten characters per line. The ASCII table is shown in Appendix B. Characters are separated by
 * exactly one space.
 */

public class Exercise5_15 {
    public static void main(String[] args) {
        int count = 0;

        for(char i = '!'; i <= '~'; i++){
            if(count < 10){
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
