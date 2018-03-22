/*
 Ryan Santos
ID:0266872
3/21/2018
Despcription: Creating a summing method.
 */
package lab11;

import java.util.Scanner;


public int class Lab11 { //had to define the method with int

  Scanner in = new Scanner(System.in);

  public sumConsonants() {

    System.out.println("Enter two uppercase leters.");

    String s = in.nextLine();
    char letter1 = s.charAt(0); //updated
    char letter2 = s.charAt(1); //updated
   // replace 0 with appropriate index for letter2
   // i found this on lines 27-28 on instructions
    int l1 = (int)letter1; //updated
    int l2 = (int)letter2; //updated
   
   // to convert letter1 try int l1 = (int) letter1
   // i found this on lines 17-20 on instructions

   // for (;;) // get rid of this for now so function will execute

    return (l1 + l2); //updated 
   // sum of ascii letters
   // instead of returning this try returning the integers from the converted letters we got on line 25 to see if your on the right track

  }
  public static void main(String[] args) {

    Lab11 console = new Lab11();
    int x = console.sumConsonants();
    System.out.prtinln("The sum of the consonants is " + x);

  }

}
