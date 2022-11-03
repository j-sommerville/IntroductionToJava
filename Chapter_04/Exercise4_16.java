package Chapter_04;

/* 4.16 (Random character) Write a program that displays a random uppercase letter using the Math.random() method.
 */

public class Exercise4_16 {
    public static void main(String[] args) {
        int random = (int) Math.round(65 + Math.random() * (90 - 65 + 1));

        char letter = (char) random;

        System.out.println("The random letter is " + letter);
    }
}
