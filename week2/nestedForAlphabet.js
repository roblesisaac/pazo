 import java.util.*;
import java.lang.*;
import java.io.*;
 
public class MyClass {
    public static void main(String args[]) {
        
        String message = "";
        for(int count=65; count<91; count++) { // 91 is equal to 26 times in loop
          message += (char)(count); // same as message = message +(char)(count)
          System.out.println(message);
        }
      
    }
}
