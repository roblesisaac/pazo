package journal5adimensionalarrays;

import java.util.Random;

public class Journal5ADimensionalArrays {

    //create and intiliaze constants and global variables
    private static final int DIVISOR_BY = 10;
    private static int count = 0;

    // created method for creating the array
    public int[] createArray(int size) {

        int[] array = new int[size];

        Random rand = new Random();

        for (int i = 0; i < array.length; i++) {

            array[i] = rand.nextInt(101);

        }

        return array;

    }

    public int[] printArray(int[] myArray) {

        for (int i = 0; i < myArray.length; i++) {

        }

        return myArray;

    }

    // counting how many times divisble by 10
    public int[] divisiblebyTen(int[] myArray) {

        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] % DIVISOR_BY == 0) {
                count++;
            }
        }

        return myArray;

    }

    // method string created for final output in main
    public String theFinalResult(int count) {

        String theFinalResult = ("You have " + count + " numbers divisible by 10");

        return theFinalResult;
    }

    public static void main(String[] args) {

// invoke class method
        Journal5ADimensionalArrays invoke = new Journal5ADimensionalArrays();

        //display final output
        int[] myArray = invoke.printArray(10);
        invoke.divisiblebyTen(myArray);
        System.out.println(invoke.theFinalResult(count));

    }

}
