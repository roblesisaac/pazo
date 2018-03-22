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
    String s = in .nextLine();
    char letter1 = s.charAt(0);
    char letter2 = s.charAt(1);
    int l1 = (int) letter1;
    int l2 = (int) letter2;

    if (Character.isUpperCase(letter1)) {
     // you dont need to nest the if statement on line 27. try if(condition1 || condition2)
     // replace condition1 with Character.isUpperCase(letter1) and so on.  
     // || means "or" in javascript
      System.out.println("You must enter an uppercase letter.");
      // if (!Character.isUpperCase(letter2)) {
      //  System.out.println("You must enter an uppercase letter.");
      //}
    } else {
      return sumConsonants(); // you want to put your for loop here instead of return sumConsonants();
    }
    return (l1 + l2); // this return statement will now move inside curly braces {} of your else statement inbetween lines 31-33

  }
  public static void main(String[] args) {

    Lab11 console = new Lab11();
    int x = console.sumConsonants();
    System.out.println("The sum of the consonants is " + x);

  }

}
