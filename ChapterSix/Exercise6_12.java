package ChapterSix;

/* 6.12 (Display characters) Write a method that prints characters using the following header:
 * public static void printChars(char ch1, char ch2, int numberPerLine)
 * This method prints the characters between ch1 and ch2 with the specified numbers per line. Write a test program that
 * prints ten characters per line from 1 to Z. Characters are separated by exactly one space.
 */

public class Exercise6_12 {
    public static void main(String[] args) {
        printChars('1','z', 10);
    }

    public static void printChars(char ch1, char ch2, int numberPerLine) {
        int count = 0;
        while (ch1 <= ch2) {
            System.out.print(ch1 + " ");
            ch1++;
            count++;

            if(count == 10){
                System.out.println();
                count = 0;
            }
        }
    }
}
