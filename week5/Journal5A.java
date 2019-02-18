/*
 * Name : Ryan Santos
 * ID :  0266872
 * Date : 2 / 16  /2019
 * Assignment : Journal 5A Single Dimensional Arrays
 * Description : Creating an array with a method that calls numbers divisible by 10
 */
package journal5adimensionalarrays;

import java.util.Random;

public class Journal5ADimensionalArrays {
    
    //create and intiliaze constants and global variables
    static int count;
    final int DIVISOR_BY = 10;

    // created method for creating the array
    public int[] createArray(int size) {
        int[] array = new int[size];
        Random rand = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(101);
        }

        return array;

    }

    // counting how many times divisble by 10
    public int[] divisibleby10() {
        //create counter

        // call getting array method
        int[] myArray = this.createArray(10);

        // count number of times divisble by 10
        count = 0;
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] % DIVISOR_BY == 0) {

                count++;
            }
        }

        return myArray;

    }

    // method string created for final output in main
    public String theFinalResult(int count) {
        StringBuilder builder = new StringBuilder();

        String theFinalResult;
        builder.append("You have " + count + " numbers divisible by 10");

        theFinalResult = builder.toString();
        return theFinalResult;
    }

    public static void main(String[] args) {

// invoke class method
        Journal5ADimensionalArrays invoke = new Journal5ADimensionalArrays();

        //display final output
        invoke.divisibleby10();
        System.out.println(invoke.theFinalResult(count));

    }

}
