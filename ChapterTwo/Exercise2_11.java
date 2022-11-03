package ChapterTwo;
import java.util.Scanner;

/* 2.11 (Population projection) Rewrite Programming Exercise 1.11 to prompt the user to enter the number of years and
 * displays the population after the number of years. Use the hint in Programming Exercise 1.11 for this program. The
 * population should be cast into an integer. Here is a sample run of the program:
 * Enter the number of years: 5
 * The population in 5 years is 325932970
 */

public class Exercise2_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of years: ");
        int years = input.nextInt();

        long currentPopulation = 312032486;
        double daysInYear = 365;
        double secondsInYear = 31536000;
        double birthsPerYear = secondsInYear / 7.0;
        double deathsPerYear = secondsInYear / 13.0;
        double immigrantsPerYear = secondsInYear / 45.0;

        //Using a for loop
        for(int i = 1; i <= years; i++){
            currentPopulation += (birthsPerYear + immigrantsPerYear - deathsPerYear);
        }
        System.out.println("The population in " + years + " years is " + currentPopulation);

        //Alternative Method (using a while loop)
        currentPopulation = 312032486;

        int i = 1;
        while(i <= years){
            currentPopulation += (birthsPerYear + immigrantsPerYear - deathsPerYear);
            i++;
        }
        System.out.println("The population in " + years + " years is " + currentPopulation);
    }
}