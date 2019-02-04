/*
 * Name : Ryan Santos
 * ID :  0266872
 * Date : 2 / 3 /2019
 * Assignment : Journal 3C - The while loop
 * Description : Modifying a while loop game to ask if you want to play again
 */
package journal3c.thewhileloop;

import java.util.Scanner;

import java.util.Random;

public class Journal3CTheWhileLoop {

    public static void main(String[] args) {
        // declare and initialize scanner (takes in keyboard input)
        Scanner in = new Scanner(System.in);

        // declare and create new Random object
        Random rnd = new Random();
        String answer = "";

        //System.out.println("Guess a number between 1 and 10");
        do {
            int guess = 0;
            int num = rnd.nextInt(10) + 1;
            int count = 1;

            count++;

            while (guess != num) {
                System.out.println("Guess a number between 1 and 10");
                guess = in.nextInt();
            }
            System.out.println("Would you like to play (y/n) ?");
            answer = in.nextLine();

            while (answer.equals("y"));
            answer = in.nextLine();
       
        } while (answer.equals("y"));
        System.out.println("thank you for playing");

    }

}
