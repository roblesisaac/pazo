import java.util.Scanner;

public class JavaApplication21 
{
   
    public static void main(String[] args) 

    {

        Scanner in = new Scanner(System.in);

        //prompt the user and store two input values
        System.out.println("Enter two values : ");
        int firstValue = in.nextInt();
        int secondValue = in.nextInt();
        
        //compute boolean flags to determine potential outcomes
        boolean firstValueGreaterThanSecond = firstValue > secondValue;
        boolean valuesEqual= firstValue == secondValue;
       
        
        //declare variable to hold final result
        String finalResult = "";

        if (valuesEqual) 
        {
            finalResult = "These values are equal";
        }   
       else
        {
             int smallest = 0;
             int largest = 0;
            
            if(firstValueGreaterThanSecond)
            {
                smallest = secondValue;
                largest = firstValue;
            }
            
            else
            {
                smallest = firstValue;
                largest = secondValue;
                
            }
            
            finalResult = "the largest value is " + largest;
        } 
        //display final output
        System.out.println( finalResult  );
    
    } 
}
