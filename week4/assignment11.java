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
 
  public int sumConsonants() {
    System.out.println("Enter two uppercase leters.");
    String s = in .nextLine();
    char letter1 = s.charAt(0);
    char letter2 = s.charAt(1);
    int l1 = (int) letter1;
    int l2 = (int) letter2;

    if (!Character.isUpperCase(letter1) || !Character.isUpperCase(letter2)) {
      return -1;
    } else {
      // define your low and high letters
      // use an if statement to figure out which l1 or l2 is higher or lower
      // set your sum to 0
      // creat for loop with i starting at low and finishing once i <= high
      for() {
        // set var cChar converting i to char with (char) i
        // use if statement to figure out if cChar is AEIO or U
        // if its not equal add i to sum
      }
      return sum;
    }
  }

  public static void main(String[] args) {
    Lab11 console = new Lab11();
    int x = console.sumConsonants();
    System.out.println("The sum of the consonants is " + x);
  }

}
