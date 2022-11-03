package ChapterFour;

/* 4.3 (Geography: estimate areas) Find the GPS locations for Atlanta, Georgia; Orlando, Florida; Savannah, Georgia;
 * and Charlotte, North Carolina from www.gps-data-team.com/map/ and compute the estimated area enclosed by these four
 * cities. (Hint: Use the formula in Programming Exercise 4.2 to compute the distance between two cities. Divide the
 * polygon into two triangles and use the formula in Programming Exercise 2.19 to compute the area of a triangle.)
 */

public class Exercise4_03 {
    public static void main(String[] args) {
        //Atlanta, Georgia
        double x1 = Math.toRadians(33.7490);
        double y1 = Math.toRadians(84.3880);

        //Orlando, Florida
        double x2 = Math.toRadians(28.5384);
        double y2 = Math.toRadians(81.3789);

        //Savannah, Georgia
        double x3 = Math.toRadians(32.0809);
        double y3 = Math.toRadians(81.0912);

        //Charlotte, North Carolina
        double x4 = Math.toRadians(35.2271);
        double y4 = Math.toRadians(80.8431);


        //first triangle
        double side1 = Math.pow(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2), 0.5);
        double side2 = Math.pow(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2), 0.5);
        double side3 = Math.pow(Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2), 0.5);

        double sides = (side1 + side2 + side3) / 2;
        double area = Math.sqrt((sides * (sides - side1) * (sides - side2) * (sides - side3)));

        //second triangle
        side1 = Math.pow(Math.pow(x4 - x1, 2) + Math.pow(y4 - y1, 2), 0.5);
        side2 = Math.pow(Math.pow(x3 - x4, 2) + Math.pow(y3 - y4, 2), 0.5);
        side3 = Math.pow(Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2), 0.5);

        sides = (side1 + side2 + side3) / 2;
        area += Math.sqrt((sides * (sides - side1) * (sides - side2) * (sides - side3)));

        System.out.println("The area of the four cities is " + area + " km");
    }
}
