/*
 Ryan Santos
ID:0266872
3/21/2018
Despcription: Creating a summing method.
 */
package lab11;

import java.util.Scanner;


public class Lab11 {

 Scanner in = new Scanner(System.in);
 
 public int sumConsonants() {
     
     System.out.println("Enter two uppercase leters.");
     
     String s = in.nextLine();
     char letter1 = s.charAt(0);
     char letter2 = s.charAt(1);
   // int x = Integer.parseInt(s); // converts string into int
    int l1 = (int)letter1;
    int l2 = (int)letter2;
    
    if(Character.isUpperCase(letter1)) {
        System.out.println("You must enter an uppercase letter.");
        
        if(!Character.isUpperCase(letter2)) {
            System.out.println("You must enter an uppercase letter.");
        }
    }
    else {
        return sumConsonants();
    }
    return (l1 + l2); // sum of ascii letters
     
 }
    public static void main(String[] args) {
        
        Lab11 console = new Lab11();
        int x = console.sumConsonants();
        System.out.println("The sum of the consonants is " + x);
        
    }
    
}
