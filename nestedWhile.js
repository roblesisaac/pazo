import java.util.*;
import java.lang.*;
import java.io.*;
 
public class MyClass {
    public static void main(String args[]) {
      Scanner scan = new Scanner(System.in);
      Random rnd = new Random();
      
      int count = 1;
      int num = rnd.nextInt(10) + 1;
      int guess = scan.nextInt();
      String playgame = "y";
      while(playgame.equals("y")) {
        System.out.println("Guess a number between 1 and 10.");

        while(guess != num) {
          System.out.println("Guess again.");
          guess = scan.nextInt();
          count++;
        }
        System.out.println("took " + count + " times.");
        System.out.println("Play again? (y/n)");
        scan.nextLine();
        playgame = scan.nextLine();
      } 
      
      System.out.println("Thanks for playing!");
      
    }
}
