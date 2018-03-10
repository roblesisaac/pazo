import java.util.*;
import java.lang.*;
import java.io.*;
 
public class MyClass {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Pick a number.");
        int previous = scan.nextInt();
        System.out.println("Pick a number.");
        int current = scan.nextInt();
        while(Math.abs(current-previous) <= 10) {
            System.out.println("Pick a number.");
            previous = current;
            current = scan.nextInt();
        }
        System.out.println("The difference between the last two numbers enter is greater than 10.");
      
    }
}
