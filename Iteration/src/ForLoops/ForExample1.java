package ForLoops;

public class ForExample1 {

	public static void main(String[] args) {
		//start of code
		//variables
		int intLoopCounter = 0;
		//variables
		int intStartValue = 0, intLimit = 12,
				intIncrement = 3;
		
		//code
		//LOOP - INITIAL - CONDITION - STEP
		for (intLoopCounter = intStartValue;
			 intLoopCounter != intLimit;
				intLoopCounter += intIncrement)
		{
			System.out.println("Loop Counter = " + intLoopCounter);
		}
		
		//end of code

	}

}
