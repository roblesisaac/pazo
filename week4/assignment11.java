/*
 Ryan Santos
ID:0266872
3/21/2018
Despcription: Creating a summing method.
 */
package lab11;

import java.util.Scanner;


public class Lab11 { //had to define the method with int

  Scanner in = new Scanner(System.in);

  public int sumConsonants() { // i think definition goes here - not line 12
    System.out.println("Enter two uppercase leters.");
    String s = in.nextLine();
    char letter1 = s.charAt(0);
    char letter2 = s.charAt(1);
    int l1 = (int)letter1;
    int l2 = (int)letter2;

   // ** now you need to set up your for loop **
   // so you need to find the amount of times to loop which will be the difference between l1 and l2.
   // the result must be positive - i think you could use Math.abs ??
   // I think thats the point of his instructions here: Your method must allow for either argument to be larger. For instance, passing A, C should yield the same as passing C, A.
  // ** then **
   //You must also insure that the arguments to this method are upper case characters. If either argument is not you should return a -1 from the method;
   // if(Character.isUpperCase(ch)) then you would return System.out.println("Upper Case");
   
   return (l1 + l2); // sum of ascii letters
  }
  
  public static void main(String[] args) {
    Lab11 console = new Lab11();
    int x = console.sumConsonants();
    System.out.println("The sum of the consonants is " + x);
  }

}
