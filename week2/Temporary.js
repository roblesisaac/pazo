)
import java.util.*;
import java.lang.*;
import java.io.*;
 
public class MyClass {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); // creates a scanner isntacne

        Random rnd = new Random(); // creates a random instance
        int min = 65; // is A in ascii
        int max = 90; // is Z in ascii
        int rNumber = rnd.nextInt((max-min)+1) + min;
        char rChar = (char)(rNumber);
        char guess = (char)(60); 
        int x = guess;
     

        do { 
            if(guess != (rChar)) {
                System.out.println("Guess the secret uppercase letter (it's " + rChar + ")"); 
            } else {
                System.out.println("Sorry you guessed the wrong letter, the secret letter preceeds the letter you guessed. Guess again.");   
            }
            guess = in.next().charAt(0); // how to get char from next line (input)
           x = guess;
         if(x > rNumber ){
          System.out.println("Your guess came after the secret letter, try guessing a letter that comes before.");
         } else {
          System.out.prtintln("Your guess comes before the secret letter, try guessing a latter letter.");
                              }

        } while(guess != rChar);        
        System.out.println("You guessed correctly!");
    }

}
