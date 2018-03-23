/*
 Ryan Santos
ID:0266872
3/21/2018
Despcription: Creating a summing method.
 */
package lab12;

import java.util.Scanner;

public class Lab12 {
    
    public int sumNumber(int a, int b, int c) {
        return a + b + c;
   }
  
    public double sumNumber(double a, double b, double c){
        return (a + b + c);
    }
    
  public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Lab12 console = new Lab12();
        int x, y, z;
        System.out.println("Enter 2 three digit integers.");
        x = in.nextInt();
        y = in.nextInt();
        z = in.nextInt();
        System.out.println("The sum of the first two is " + console.sumNumber(x,y,z) + console.sumNumber(x,y,z));
        
        
    
    }
        
}
            
       
        
