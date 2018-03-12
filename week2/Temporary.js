import java.util.*;
import java.lang.*;
import java.io.*;
 
public class MyClass {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); // creates a scanner isntacne

        Random rnd = new Random(); // creates a random instance
        int min = 65;
        int max = 90;
        int rNumber = rnd.nextInt((max-min)+1) + min;
        char rChar = (char)(rNumber);
        char guess = (char)(60);

        do { 
            if(guess == (char)(60)) {
                System.out.println("Guess the secret uppercase letter (it's " + rChar + ")"); 
            } else {
                System.out.println("Sorry you guessed the wrong letter, the secret letter preceeds the letter you guessed. Guess again.");   
            };
            guess = in.next().charAt(0);
        } while(guess != rChar);        
        System.out.println("You guessed correctly!");
    }

}
