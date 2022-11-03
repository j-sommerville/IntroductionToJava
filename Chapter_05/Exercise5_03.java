package Chapter_05;

/*
 * 5.3(Conversion from kilograms to pounds) Write a program that displays the following table (note that 1 kilogram is
 * 2.2 pounds):
 * Kilograms     Pounds
 * 1                2.2
 * 3                6.6
 * ...
 * 197            433.4
 * 199            437.8
 */

public class Exercise5_03 {
    public static void main(String[] args) {


        int kilograms = 1;
        double pounds = 2.2;

        System.out.println("Kilograms       Pounds");

        while(kilograms < 200){
            System.out.printf("%-15d%6.1f\n", kilograms, pounds);
            kilograms += 2;
            pounds = 2.2 * kilograms;
        }
    }
}
