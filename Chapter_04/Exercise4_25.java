package Chapter_04;

/* 4.25(Generate vehicle plate numbers) Assume a vehicle plate number consists of three uppercase letters followed by
 * four digits. Write a program to generate a plate number.
 */

public class Exercise4_25 {
    public static void main(String[] args) {
        int randomLetter1 = (int) Math.round(65 + Math.random() * (90 - 65 + 1));
        int randomLetter2 = (int) Math.round(65 + Math.random() * (90 - 65 + 1));
        int randomLetter3 = (int) Math.round(65 + Math.random() * (90 - 65 + 1));

        char letter1 = (char) randomLetter1;
        char letter2 = (char) randomLetter2;
        char letter3 = (char) randomLetter3;

        int number1 = (int) (0 + (Math.random() * 9));
        int number2 = (int) (0 + (Math.random() * 9));
        int number3 = (int) (0 + (Math.random() * 9));
        int number4 = (int) (0 + (Math.random() * 9));

        System.out.print("The vehicle plate number is ");
        System.out.print(letter1);
        System.out.print(letter2);
        System.out.print(letter3);
        System.out.print(number1);
        System.out.print(number2);
        System.out.print(number3);
        System.out.print(number4);
    }
}
