package Chapter_05;

/* 5.18(Display four patterns using loops) Use nested loops that display the following patterns in four separate
 * programs:
 * Pattern A        Pattern B        Pattern C        Pattern D
 * 1                1 2 3 4 5 6                1      1 2 3 4 5 6
 * 1 2              1 2 3 4 5                2 1        1 2 3 4 5
 * 1 2 3            1 2 3 4                3 2 1          1 2 3 4
 * 1 2 3 4          1 2 3                4 3 2 1            1 2 3
 * 1 2 3 4 5        1 2                5 4 3 2 1              1 2
 * 1 2 3 4 5 6      1                6 5 4 3 2 1                1
 */

public class Exercise5_18 {
    public static void main(String[] args) {

        System.out.println("Pattern A");
        for(int row = 1; row <= 6; row++){
            for(int column = 1; column <= row; column++){
                System.out.print(column + " ");
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("Pattern B");
        for(int row = 6; row >= 1; row--){
            for(int column = 1; column <= row; column++){
                System.out.print(column + " ");
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("Pattern C");
        for(int row = 1; row <= 6; row++) {
            for (int space = 6 - row; space >= 1; space--) {
                System.out.print("  ");
            }
            for (int column = row; column >= 1; column--) {
                System.out.print(column + " ");
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("Pattern D");
        for(int row = 0; row < 6; row++){
            for (int space = 0; space < row; space++) {
                System.out.print("  ");
            }
            for(int column = 1; column <= 6 - row; column++){
                System.out.print(column + " ");
            }
            System.out.println();
        }

    }
}
