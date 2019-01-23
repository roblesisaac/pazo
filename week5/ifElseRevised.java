package journal2a;

import java.util.Scanner;

public class Journal2A {

     public static void main(String[] args) 
     {
        Scanner in = new Scanner(System.in);
        
        //ask user for input with scanner object
        System.out.println("Enter two values : ");
        int firstValue = in.nextInt();
        int secondValue = in.nextInt();
        
        //declaring boolean 
        boolean firstGreaterThanSecond = firstValue > secondValue;
        boolean valuesNotEqual = firstValue != secondValue;
        
        int smallest = 0;
        int largest = 0;
        int first = 0;
        int second = 0;
       
        //setting conditons for if statement
        if(firstGreaterThanSecond)
        {
            smallest = secondValue;
            largest = firstValue;
        }
        else if(valuesNotEqual)
        {
           first = secondValue;
           second = firstValue;
        }
         
        else
        {
            smallest = firstValue;
            largest = secondValue;
        }            
               
        System.out.println( smallest + " is the smallest number");
        System.out.println( first + " is not equal to your second value");
        
     }    
}
