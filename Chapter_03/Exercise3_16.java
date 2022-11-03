package Chapter_03;

/* 3.16(Random point) Write a program that displays a random coordinate in a rectangle. The rectangle is centered at
 * (0, 0) with width 100 and height 200.
 */

public class Exercise3_16 {
    public static void main(String[] args) {
        int width = (int) (Math.random() * (50 + 50) - 50);
        int height = (int) (Math.random() * (100 + 100) - 100);

        System.out.println("The coordinate for the rectangle is " + width + "," + height);
    }
}
