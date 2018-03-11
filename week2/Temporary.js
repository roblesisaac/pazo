package dowhilepracticeexam2;
import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author Ryan
 */
public class DoWhilePracticeExam2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random rnd = new Random();
        
        int min = 65;
        int max = 90;
        
        int rNumber = rnd.nextInt((max-min)+1) + min;
        char rChar = (char)(rNumber); 
        
        System.out.println("Guess the secret uppercase letter");
        String guess = in.nextLine();
        do {
             System.out.println("Sorry you guessed the wrong letter, the secret letter preceeds the letter you guessed. Guess again.");
             guess = in.nextLine();
        } while(guess != (rNumber));
        
        
      
      
                
               
    }
    
}
