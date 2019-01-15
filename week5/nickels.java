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
       int nickels;
       
       System.out.println("Enter your Nickels");
       nickels = in.nextInt();
        
       int dollars = nickels / 20;
       int change = nickels % 20;
       int change1 = change / 2;
               
       System.out.println("You have $" + dollars + "." + change1);
        
    }
    
}
