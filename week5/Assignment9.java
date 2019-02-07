/*
 * Name : Ryan Santos
 * ID :  0266872
 * Date : 2 / 6 /2019
 * Assignment : Assignment 9
 * Description : Making a simple math calculator
 */
package assignment9primedloopsandparsing;

import java.util.Scanner;


public class Assignment9PrimedLoopsandParsing {

    public static void main(String[] args) 
    {
        // declare and initialize scanner
        Scanner in = new Scanner(System.in);
        
        
        
        //display options and promt user to make a decision
        System.out.println("Select which math operation ou would like to use, followed by the value.");
        System.out.println(" S - sine ");
        System.out.println(" C - cosine ");
        System.out.println(" T - tangent ");
        System.out.println(" R - square root");
        System.out.println(" N - natural log");
        System.out.println(" X - exit the program");
        char operation = in.nextLine().charAt(0);
        String sValue = in.nextLine().substring(2);
        double dValue = Double.parseDouble(sValue);

        // switch statements used to perform calculation and print output depending on which case selected
        switch (Character.toUpperCase(operation)) {
            case 'S':
                System.out.println("The sine of " + dValue + " is : " + Math.sin(dValue));
                break;
            case 'C':
                System.out.println("The cosine of " + dValue + " is : " + Math.cos(dValue));
                break;
            case 'T':
                System.out.println("The tangent of " + dValue + " is : " + Math.tan(dValue));
                break;
            case 'R':
                System.out.println("The square root of " + dValue + " is : " + Math.sqrt(dValue));
                break;
            case 'N':
                System.out.println("The natrual log of " + dValue + " is : " + Math.log(dValue));
                break;
            case 'X':
                //System.exit();
                break;
        }
        
        
    }
    
}
