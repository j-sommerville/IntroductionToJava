package Chapter_05;

/* 5.5(Conversion from kilograms to pounds and pounds to kilograms) Write a program that displays the following two
 * tables side by side:
 * Kilograms  Pounds    |      Pounds      Kilograms
 * 1             2.2    |      20               9.09
 * 3             6.6    |      25              11.36
 * ...
 * 197         433.4    |      510            231.82
 * 199         437.8    |      515            234.09
 */

public class Exercise5_05 {
    public static void main(String[] args) {
        System.out.println("Kilograms     Pounds     |     Pounds     Kilograms");

        for(int i = 1, j = 20; i < 200 && j <=515; i += 2, j += 5){
            System.out.printf("%-12d%8.1f", i, (i * 2.2));
            System.out.print("     |    ");
            System.out.printf("%-9d%12.2f\n", j, (j / 2.2));

        }
    }
}
