package Chapter_06;

/* 6.16 (Number of days in a year) Write a method that returns the number of days in a year using the following header:
 * public static int numberOfDaysInAYear(int year)
 * Write a test program that displays the number of days in year from 2000 to 2020.
 */

public class Exercise6_16 {
    public static void main(String[] args) {
        System.out.println("Year       Days");
        for(int years = 2000; years <= 2020; years ++){
            System.out.printf("%4d", years);
            System.out.printf("%10d", numberOfDaysInAYear(years));
            System.out.println();
        }
    }

    public static int numberOfDaysInAYear(int year){
        int days;
        if (year % 4 == 0 || year % 100 != 0 && year % 400 == 0){
            days = 366;
        }
        else{
            days = 365;
        }
        return days;
    }
}
