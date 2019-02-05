/*
 * Name : Ryan Santos
 * ID :  0266872
 * Date : 2 / 5 /2019
 * Assignment : Journal 3C
 * Description : Create a guess game that asks if you want to play again with a nested while loop.
 */
package javaapplication38;

import java.util.Scanner;

import java.util.Random;

public class JavaApplication38 {

    public static void main(String[] args) {
        // declare and initialize scanners
        Scanner numericInput = new Scanner(System.in);
        Scanner stringInput = new Scanner(System.in);

        // create random number generator
        Random rnd = new Random();

        // declare and initialize local constants
        final int MIN_VALUE = 1;
        final int MAX_VALUE = 10;
        final int RANGE = MAX_VALUE - MIN_VALUE + 1;
        final char YES = 'Y';
        final char NO = 'N';

        // prime the while loop
        char continueGame = YES;

        while (continueGame != NO) {
            //generate new random number for game
            int randomNumber = rnd.nextInt(RANGE);

            //declare and initialize counter to 0
            int counter = 0;

            //prime user guess loop w/ value outside of random value
            int userGuess = randomNumber - 1;

            //allow user to guess while incorrect
            while (userGuess != randomNumber) {
                //prompt user for their guess and store value
                System.out.println("Guess a number between 1 and 10");
                userGuess = numericInput.nextInt();

                //increment counter
                counter++;

            }

            // display number of guesses
            System.out.println("   =       =    =======   =======");
            System.out.println("     =   =      =         =");
            System.out.println("       =        =====     =======");
            System.out.println("       =        =               =");
            System.out.println("       =        =               =");
            System.out.println("       =        =======   =======");
            System.out.println("\nIt took you " + counter + " tries");

            //prompt user if they wish to play again 
            System.out.println("\nWould you like to play again (Y/N)?");
            continueGame = stringInput.next().charAt(0);

            //force upper case
            continueGame = Character.toUpperCase(continueGame);
        }

        System.out.println("/nThanks for playing!");

    }
}
