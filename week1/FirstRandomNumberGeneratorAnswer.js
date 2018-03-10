import java.util.*;
import java.lang.*;
import java.io.*;
 
public class MyClass {
    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);
        Random rnd = new Random();
        
        int min = 97, max = 122;
        for(int i = 0; i < 10; i++)
        {
           char r = (char)(rnd.nextInt((max-min) + 1) + min);
           System.out.println(r);
        }
      
    }
}
