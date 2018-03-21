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

  public sumConsonants() {

    System.out.println("Enter two uppercase leters.");

    String s = in .nextLine();
    // int x = Integer.parseInt(s); // converts string into int
    letter1 = in .nextLine();
    letter2 = in .nextLine();

    for (;;)


      return (char)(letter1 + letter2); // sum of ascii letters

  }
  public static void main(String[] args) {

    Lab11 console = new Lab11();
    int x = console.sumConsonants();
    System.out.prtinln("The sum of the consonants is " + x);

  }

}
