int firstNumber = 3;
int secondNumber = 7;

boolean firstSmallerThanSecond = firstNumber < secondNumber;

// declare variables for final state
int smallest, largest;

if(firstSmallerThanSecond)
{
	smallest = firstNumber;
	largest = secondNumber;
}
else
{
	smallest = secondNumber;
	largest = firstNumber;
}


//**********************************
// scenario 2 - lonely if approach
//**********************************
// declare variables for final state
int smallest = firstValue;
int largest = secondValue;

// if first HAPPENS to not be smaller swap
if(!firstSmallerThanSecond)
{
	smallest = secondNumber;
	largest = firstNumber;
}
