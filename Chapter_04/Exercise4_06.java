package Chapter_04;

/* 4.6 (Random points on a circle) Write a program that generates three random points on a circle centered at (0, 0)
 * with radius 40 and display three angles in a triangle formed by these three points, as shown in Figure 4.7a. (Hint:
 * Generate a random angle a in radians between 0 and 2p, as shown in Figure 4.7b and the point determined by this
 * angle is (r*cos(a), r*sin(a)).)
 */

public class Exercise4_06 {
    public static void main(String[] args) {
        double radius = 40;

        double random = Math.random() * 360;
        double x = radius * Math.cos(random * Math.PI / 180);
        double y = radius * Math.sin(random * Math.PI / 180);
        System.out.println("(" + x + "," + y + ")");

        random = Math.random() * 360;
        x = radius * Math.cos(random * Math.PI / 180);
        y = radius * Math.sin(random * Math.PI / 180);
        System.out.println("(" + x + "," + y + ")");

        random = Math.random() * 360;
        x = radius * Math.cos(random * Math.PI / 180);
        y = radius * Math.sin(random * Math.PI / 180);
        System.out.println("(" + x + "," + y + ")");
    }
}
