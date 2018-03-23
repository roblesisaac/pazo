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
 
    // setup should looke more like this:
 
    public int sumOfDigits(int a) {
       // need a sum integer here set to 0
       // logic should go here to split and add digits of parameter "a". (eg: from 123 to  1+2+3)
       // return sum here;
    }
 
    public twoNumbers(int a, int b) {
       // need a sum integer here set to 0
       // sum += sum of the digits of "int a" (use your sumOfDigits Formula)
       // sum += sum of the digits of "int b" (use your sumOfDigits Formula)
       // return sum here;
    }
 
    // then have the user enter one 3 digit number and print the sum
    // and then have them enter two 3 digit numbers and print the sum
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
            
       
        
