import java.util.Random;
import java.util.Scanner;
import java.io.*;

public class Snakeandladder.java {

    public static void main(String[] vaibhav)throws IOException {
        int WINNING_POSITION = 100;
        int startPosition = 0, numberOfPlayer = 1, numberOfDiceRolls = 0;

        Scanner scanner = new Scanner(System.in);
        DataInputStream d = new DataInputStream(System.in);

        System.out.println("Number Of Player:- " + numberOfPlayer);
        System.out.println("Current Position:-" + startPosition);

        while (startPosition != WINNING_POSITION) {

            System.out.print("Press 1 To Roll Dice: ");
            int number = Integer.parseInt(d.readLine());


            if (number == 1) {

                Random random = new Random();
                int dice = 1 + random.nextInt(6);
                System.out.println("Dice Rolling...");
                System.out.println("Dice Number: " + dice);


                int checkOptions = random.nextInt(3);


                switch (checkOptions) {
                    case 0:
                        System.out.println("OPTION: No Play");
                        break;
                    case 1:
                        System.out.println("OPTION: Ladder");
                        startPosition = startPosition + dice;
                        if (startPosition > WINNING_POSITION) {
                            startPosition -= dice;
                        }
                        break;
                    default:
                        System.out.println("OPTION: Snake");
                        startPosition = startPosition - dice;
                        // Reset Position Value To 0 When It Is Negative
                        if (startPosition < 0) {
                            startPosition = 0;
                        }
                        break;
                }

                System.out.println("Current Position: " + startPosition);
                numberOfDiceRolls++;

            } else {
                System.out.println("Error: Run The Program Again & Enter Valid Number");
            }
        }

        System.out.println("You Rolled Dices " + numberOfDiceRolls + " Times.");
        System.out.println("Congratulations! You Won The Game.");
    }

}

