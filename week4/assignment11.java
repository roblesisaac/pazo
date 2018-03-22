/*
 Ryan Santos
ID:0266872
3/21/2018
Despcription: Creating a summing method.
 */
package lab11;

import java.util.Scanner;
import java.lang.*;

public class Lab11 {
  Scanner in = new Scanner(System.in);
 
  //** try to keep your code tight like this **
  public int sumConsonants() {
    System.out.println("Enter two uppercase leters.");
    String s = in .nextLine();
    char letter1 = s.charAt(0);
    char letter2 = s.charAt(1);
    int l1 = (int) letter1;
    int l2 = (int) letter2;

    if (!Character.isUpperCase(letter1) || !Character.isUpperCase(letter2)) {
      return -1; // i think this is what he means by return -1
    } else {
     int loopCount = 0; // set this to the absolute value of the difference of l1 and l2 - Math.abs()
     // then create loop i<loopCount
      return (l1 + l2); // sum of ascii letters
    }

    // return sumConsonants(); shouldn't need this
  }

  public static void main(String[] args) {
    Lab11 console = new Lab11();
    int x = console.sumConsonants();
    System.out.println("The sum of the consonants is " + x);
  } // i got rid of the extra System.out.println("The sum of the consonants is " + x);

}
