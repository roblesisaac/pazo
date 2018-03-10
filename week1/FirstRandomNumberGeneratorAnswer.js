package journal3b;
import java.util.Scanner; // for user keyboard entered input
import java.util.Random; // a random object used for making random numbers/characters
/**
 *
 * @author Ryan
 */
public class Journal3B {
    
    Scanner in = new Scanner(System.in); // creating an instance for scanner class
    Random rnd = new Random(); // created new instance for random class
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner in = new Scanner(System.in);
        Random rnd = new Random();
        
        int min = 97, max = 122;
        for(int i = 0; i < 10; i++)
        {
           char r = (char)(rnd.nextInt((max-min) + 1) + min);
           System.out.println(r);
        }
        
    }
    
}
