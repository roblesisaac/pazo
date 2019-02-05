
package journal3c2;

import java.util.Scanner;
import java.util.Random;

public class Journal3c2 {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        
        Random rnd = new Random();
        
        int count = 1;
        int num = 0;
        int guess = 0;
        char answer = ' ';

        System.out.println("Would you like to play a game (y/n)?");
        answer = in.next().charAt(0);
        
        while (answer=='y')
        {
            System.out.println("Guess a number between 1 and 10");
            num = rnd.nextInt(10) + 1;
            guess = in.nextInt();
            
            while (guess != num) 
            {
                System.out.println("Guess a number between 1 and 10");
                guess = in.nextInt();
                count++;

            }
            
            System.out.println("It took you " + count + " tries");
            count = 1;
            System.out.println("Would you like to play again (y/n) ?");
            answer = in.next().charAt(0);
        }
        
        System.out.println("thank you for playing");

    }

}
