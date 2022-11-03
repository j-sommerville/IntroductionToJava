package ChapterSix;

/* 6.9 (Conversions between feet and meters) Write a class that contains the following two methods:
 * //Convert from feet to meters
 * public static double footToMeter(double foot)
 * //Convert from meters to feet
 * public static double meterToFoot(double meter)
 * The formula for the conversion is:
 * meter = 0.305 * foot
 * foot = 3.279 * meter
 * Write a test program that invokes these methods to display the following tables:
 * Feet     Meters     |     Meters     Feet
 *  1.0     0.305      |     20.0       65.574
 *  2.0     0.610      |     25.0       81.967
 *  ...
 *  9.0     2.745      |     60.0      196.721
 *  10.0    3.050      |     65.0      213.115
 */

public class Exercise6_09 {
    public static void main(String[] args) {
        System.out.println("Feet     Meters     |     Meters     Feet");
        System.out.println("______________________________________________");

        double feet = 1;
        double meters = 20;

        while(feet <= 10 && meters <= 65){
            System.out.printf("%4.1f", feet);
            System.out.printf("%10.3f", footToMeter(feet));
            feet++;

            System.out.printf("%7c ", '|');

            System.out.printf("%8.1f", meters);
            System.out.printf("%14.3f", meterToFoot(meters));
            meters += 5;


            System.out.println();
        }
    }

    //Convert from feet to meters
    public static double footToMeter(double foot){
        double meters = 0.305 * foot;
        return meters;
    }

    //Convert from meters to feet
    public static double meterToFoot(double meter){
        double foot = 3.279 * meter;
        return foot;
    }
}
