/*
 * Name : Ryan Santos
 * ID :  0266872
 * Date : 2 / 5 /2019
 * Assignment : Assignment 8 
 * Description : Create a guessing game with the while loop
 */
package assignment8whileloopguessinggame;

import java.util.Scanner;

import java.util.Random;

public class Assignment8WhileLoopGuessingGame
{

    public static void main(String[] args) 
    {
        // declare and initialize scanner (takes in keyboard input)
         Scanner numericInput = new Scanner(System.in);
        Scanner stringInput = new Scanner(System.in);

        // declare and create new Random object
        Random rnd = new Random();
        
        final int MIN = 1;
        final int MAX = 10;
        final int RANGE = MAX - MIN +1;
        final char YES = 'Y';
        final char NO = 'N';

        // prime the while loop
        char continueGame = YES;

        while (continueGame != NO) {
            //generate new random number for game
            int randomNumber = rnd.nextInt(RANGE);

            //declare and initialize counter to 0
            int counter = 0;
            int wrongGuessCounter = 0;
            
            //prime user guess loop w/ value outside of random value
            int userGuess = randomNumber - 1;
            
            System.out.println("I'm thinking of a number betwee 1 and 10, can you guess it");

            //allow user to guess while incorrect
            while (userGuess != randomNumber) {
                //prompt user for their guess and store value
                System.out.println("Guess a number between 1 and 10");
                userGuess = numericInput.nextInt();

                //increment counter
                counter++;
                System.out.println("Sorry that wasn't the number I was thinking. \n Try Again");
                wrongGuessCounter++;
                
                while(userGuess == randomNumber)
                {
                   System.out.println("That's exactly the number I was thinking of!");
                   break;
                }

            }
            
            //prompt user if they wish to play again 
            System.out.println("\nWould you like to play again (Y/N)?");
            continueGame = stringInput.next().charAt(0);

            //force upper case
            continueGame = Character.toUpperCase(continueGame);
            
        }      
        
        System.out.println(" Thanks for playing!");
       
    }
    
}
