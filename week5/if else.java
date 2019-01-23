package journal2a;

import java.util.Scanner;

public class Journal2A {

     public static void main(String[] args) 
     {
        Scanner in = new Scanner(System.in);
        
        //ask user for input with scanner object
        System.out.println("Enter two values");
        int firstValue = in.nextInt();
        int secondValue = in.nextInt();
        
        //setting conditons for if statement
        if((firstValue > secondValue))
        {
            System.out.println(" Your first value is greater than your second value");
        }
        else if((firstValue != secondValue))
        {
            System.out.println("your first value is not euqal to your second");
        }
        else
        {
            System.out.println("Your frist value is equal to your second value");
        }
        
     }    
}
