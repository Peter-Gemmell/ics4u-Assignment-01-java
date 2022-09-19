/*
*  Program makes rock paper scissor
*
* @author  Peter Gemmell
* @version 1.0
* @since 2022-9-16
*/

// Imports.
import java.util.Scanner;

/**
* This program calculates energy from mass.
* (remember to change the name after "final class").
*/
final class Game {
    /**
     * Rock.
     */
    private static final int ROCK = 1;

    /**
     * Paper.
     */
    private static final int PAPER = 2;

    /**
     * SCISSOR.
     */
    private static final int SCISSOR = 3;

    /**
    * Throw an exception IllegalStateException.
    * if this ever is called
    *
    * @throws IllegalStateException
    *
    */
    private Game() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
    * The starting main() function.
    *
    * @param args No args will be used
    */
    public static void main(final String[] args) {
        // Variables

        // Create a scanner object
        final Scanner myObj = new Scanner(System.in);
        // Ask for inputs
        System.out.println("Rock = 1, Paper = 2, Scissor = 3)"
                        + "Please pick number from 1-3 :  ");

        /*
        * This accepts an inputted and tests it.
        */
        try {
            // Stores float in variable.
            final int userInput = myObj.nextInt();
            // rdmn number gen.
            final int max = SCISSOR;
            final int min = ROCK;
            final int range = (max - min) + 1;
            final int randomNum = (int) (Math.random() * range) + min;
            final int robot = randomNum;
            // if's
            if (userInput == robot) {
                System.out.println("It was a tie!");
            } else if ((userInput == PAPER & robot == ROCK)
                       || (userInput == SCISSOR & robot == PAPER)
                       || (userInput == ROCK & robot == SCISSOR)) {
                System.out.println("You win!");
            } else if ((userInput == ROCK & robot == PAPER)
                       || (userInput == PAPER & robot == SCISSOR)
                       || (userInput == SCISSOR & robot == ROCK)) {
                System.out.println("A.I wins!");
            } else {
                System.out.println("Invalid Input");
            }
        } catch (java.util.InputMismatchException ex) {
            System.out.println("Not an acceptable input");
        } finally {
            System.out.println("\nDone.");
        }
    }
}
