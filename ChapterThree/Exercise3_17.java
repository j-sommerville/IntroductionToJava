package ChapterThree;
import java.util.Scanner;

/* 3.17(Game: scissor, rock, paper) Write a program that plays the popular scissor-rock-paper game. (A scissor can cut
 * a paper, a rock can knock a scissor, and a paper can wrap a rock.) The program randomly generates a number 0,1, or
 * 2 representing scissor, rock, and paper. The program prompts the user to enter a number 0,1, or 2 and displays a
 * message indicating whether the user or the computer wins, loses, or draws. Here are sample runs:
 * scissor (0), rock (1), paper (2): 1
 * The computer is scissor. You are rock. You won
 * scissor (0), rock (1), paper (2): 2
 * The computer is paper. You are paper too. It is a draw
 */

public class Exercise3_17 {
    public static void main(String[] args) {
        int random = (int) (Math.random() * (2 - 0 + 1));

        String random1 = null;
        if (random == 0){
            random1 = ("scissor");
        }
        if (random == 1){
            random1 = ("rock");
        }
        if (random == 2){
            random1 = ("paper");
        }

        Scanner input = new Scanner(System.in);
        System.out.println("Enter 0, 1 or 2. Scissor is for 0, Rock is for 1, and Paper is for 2.");
        int userInput = input.nextInt();

        String userInput1 = null;
        if (userInput == 0){
            userInput1 = ("scissor");
        }
        if (userInput == 1){
            userInput1 = ("rock");
        }
        if (userInput == 2) {
            userInput1 = ("paper");
        }

        if(userInput == 0 && random == 1){
            System.out.println("You selected " + userInput1 + " and the computer selected " + random1 + ".");
            System.out.println("You lost.");
        }
        else if(userInput == 0 && random == 2){
            System.out.println("You selected " + userInput1 + " and the computer selected " + random1 + ".");
            System.out.println("You won!");
        }
        else if(userInput == 1 && random == 0){
            System.out.println("You selected " + userInput1 + " and the computer selected " + random1 + ".");
            System.out.println("You won!");
        }
        else if(userInput == 1 && random == 2){
            System.out.println("You selected " + userInput1 + " and the computer selected " + random1 + ".");
            System.out.println("You lost.");
        }
        else if(userInput == 2 && random == 0){
            System.out.println("You selected " + userInput1 + " and the computer selected " + random1 + ".");
            System.out.println("You lost.");
        }
        else if(userInput == 2 && random == 1){
            System.out.println("You selected " + userInput1 + " and the computer selected " + random1 + ".");
            System.out.println("You won!");
        }
        else if(userInput == random) {
            System.out.println("You selected " + userInput1 + " and the computer also selected " + random1 + ".");
            System.out.println("It is a draw.");
        }
        else{
            System.out.println("Invalid input. Enter 0, 1 or 2. Scissor is for 0, Rock is for 1, and Paper is for 2.");
        }
    }
}
