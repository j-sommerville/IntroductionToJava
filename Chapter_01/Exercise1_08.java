package Chapter_01;

/* 1.8 (Area and perimeter of a circle) Write a program that displays the area and perimeter of a circle that has a
 * radius of 5.5 using the following formula:
 * perimeter = 2 * radius * pi
 * area = radius * radius * pi
 */


public class Exercise1_08 {
    public static void main(String[] args) {
        double radius = 5.5;
        double perimeter = 2 * radius * Math.PI;
        double area = radius * radius * Math.PI;
        System.out.println("The perimeter of a circle with a radius of 5.5 is: " + perimeter);
        System.out.println("The area of a circle with a radius of 5.5 is: " + area);
    }
}
