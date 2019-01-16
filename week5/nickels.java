/*
 * Name : Ryan Santos
 * ID : 872
 * Date :  1/14  /2019
 * Description :
 */
package journal1c;

import java.util.Scanner;
public class Journal1c 
{
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
         // prompt user for input of coin amount
       System.out.print("Enter amount of pennies: ");
       int numberOfPennies = in.nextInt();
       
      // split pennies
       int dollarAmount = numberOfPennies/ 100;
       int changeAmount = numberOfPennies % 100;
       
       
        //display final output       
       System.out.printf("$ %,3d.%02d %n", dollarAmount, changeAmount);
    }
    
}
