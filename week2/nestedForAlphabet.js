import java.util.*;
import java.lang.*;
import java.io.*;
 
public class MyClass {
    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);
        Random rnd = new Random();
        
        String message = "";
        for(int count=65; count<91; count++) {
          message += (char)(count);
          System.out.println(message);
        }
      
    }
}
