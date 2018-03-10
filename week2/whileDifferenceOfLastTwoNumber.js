import java.util.*;
import java.lang.*;
import java.io.*;
 
public class MyClass {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
      
        int previous = 1;
        int current = 2;
        while(Math.abs(current-previous) <= 10) {
            System.out.println("Pick a number.");
            previous = current;
            current = scan.nextInt();
        }
        System.out.println("The difference between the last two numbers enter is greater than 10.");
      
    }
}
