package ChapterOne;

/* 1.9 (Area and perimeter of a rectangle) Write a program that displays the area and perimeter of a rectangle with the
 * width of 4.5 and height of 7.9 using the following formula:
 * area = width * height
 */

public class Exercise1_09 {
    public static void main(String[] args) {
        double width = 4.5;
        double height = 7.9;
        double area = width * height;
        double perimeter = 2 * (height + width);
        System.out.println("The area of a rectangle with a width of 4.5 and a height of 7.9 is " + area +
                " or " + Math.round(area * 100) / 100.0);
        System.out.println("The perimeter of a rectangle with a width of 4.5 and a height of 7.9 is " + perimeter);

    }
}
