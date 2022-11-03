package Chapter_05;

/* 5.4(Conversion from miles to kilometers) Write a program that displays the following table (note that 1 mile is 1.609
 * kilometers):
 * Miles       Kilometers
 * 1           1.609
 * 2           3.218
 * ...
 * 9           14.481
 * 10          16.090
 */

public class Exercise5_04 {
    public static void main(String[] args) {
        System.out.println("Miles        Kilometers");
        for(int i = 1; i <= 10; i++){
            if(i < 10){
                System.out.println(i + "             " + (i * 1.609));
            }
            else{
                System.out.printf(i + "            " + "%.3f",(i * 1.609));
            }
        }
    }
}
