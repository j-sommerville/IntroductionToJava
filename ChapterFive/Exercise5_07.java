package ChapterFive;

/* 5.7(Financial application: compute future tuition) Suppose that the tuition for a university is $10,000 this year
 * and increases 5% every year. In one year, the tuition will be $10,500. Write a program that computes the tuition in
 * ten years and the total cost of four years’ worth of tuition after the tenth year.
 */

public class Exercise5_07 {
    public static void main(String[] args) {
        int tuition = 10000;
        int total = 0;
        double rateIncrease = 0.05;

        for(int i = 1; i <= 14; i++){
            tuition += (tuition * rateIncrease);

            if(i == 10) {
                System.out.println("The tuition in 10 years is $" + tuition);
            }
            if(i > 10) {
                total += tuition;
            }
        }
        System.out.println("The cost total of four years' tuition after the tenth year is $" + total);
    }
}
