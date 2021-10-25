class BetterSlot {
	int min = 1;
	int max = 50;
	
	
	// main
	public static void main(String[] args) {
		
		// Instantiate a BetterSlot object
		BetterSlot obj = new BetterSlot();
		/*int[] values = obj.pullTheLever();
		int payOffVal = obj.payOff(values);*/
		
		int[] testVals = {8,42,3,5,7};
		int payOffVal = obj.payOff(testVals);
		
		System.out.println(payOffVal);
		
	}
	
	// constructor
	public BetterSlot() {
	}
	
	public int payOff(int [] values) {
		bubbleSort(values); // sort values in array
	
		int sumFirstCalc = firstCalculation(values); // relates to first five rules
		int sumSecondCalc = secondCalculation(values); // relates to other three rules
		
		return sumFirstCalc + sumSecondCalc;
		
	}
	
	private int secondCalculation(int [] sortedValues) {
		int perfectSquare = 0;
		int powerOfTwo = 0;
		int fourtyTwo = 0;
		
		for(int i = 0; i < sortedValues.length; i++) {
			double sqrtNum = Math.sqrt(sortedValues[i]);
					
			if((sqrtNum - Math.floor(sqrtNum)) == 0) {
				// if only a perfect square
				perfectSquare = 7;
				
				// if a perfect square and power of two
				if(sortedValues[i] == 1 || sortedValues[i] == 4 || sortedValues[i] == 16) {
					powerOfTwo = 3;
				}
			}
			// if a power of two
			else if(sortedValues[i] == 1 || sortedValues[i] == 2 || sortedValues[i] == 4 ||
						sortedValues[i] == 8 || sortedValues[i] == 16 || sortedValues[i] == 32) {
				powerOfTwo = 3;
			}
			// if 42
			else if(sortedValues[i] == 42){
				fourtyTwo = 2;
			}
		}
		
		int currentTotal = perfectSquare + powerOfTwo + fourtyTwo;
		
		return currentTotal;
		
	}
	
	private int firstCalculation(int [] sortedValues) {

		// check if all five numbers are the same
		if(((sortedValues[0] == sortedValues[1]) && (sortedValues[1] == sortedValues[2]) 
				&& (sortedValues[2] == sortedValues[3]) && (sortedValues[3] == sortedValues[4]))) {
			return 1000000;
		}
		// check if four numbers are the same
		else if((((sortedValues[0] == sortedValues[1]) && (sortedValues[1] == sortedValues[2]) && (sortedValues[2] == sortedValues[3])) ||
				((sortedValues[1] == sortedValues[2]) && (sortedValues[2] == sortedValues[3]) && (sortedValues[3] == sortedValues[4])))) {
			return 10000;
		}
		// check if three numbers are the same
		else if ((sortedValues[0] == sortedValues[1] && sortedValues[1] == sortedValues[2]) ||
		(sortedValues[1] == sortedValues[2] && sortedValues[2] == sortedValues[3]) ||
		(sortedValues[2] == sortedValues[3] && sortedValues[3] == sortedValues[4])){
			if(((sortedValues[0] == sortedValues[1]) && (sortedValues[1] != sortedValues[2]) ||
			(sortedValues[3] == sortedValues[4]) && (sortedValues[2] != sortedValues[3]))){
				return 5000; // if the other two values are the same
			}
			else {
				return 100; // if the other two values are the different
			}
		}
		
		// check if two numbers are the same
		else if((sortedValues[0] == sortedValues[1]) || (sortedValues[1] == sortedValues[2]) ||
				(sortedValues[2] == sortedValues[3]) || (sortedValues[3] == sortedValues[4])) {
			return 10;
		}
		else {
			return 0;
		}
		
		
	}
	
	private void bubbleSort(int [] values) {
		
		int n = values.length;
		for(int i = 0; i < n - 1; i++) {
			for(int j = 0; j < n - i - 1; j++) {
				if(values[j] > values[j+1]) {
					int temp = values[j];
					values[j] = values[j + 1];
					values[j + 1] = temp;
				}
			}
		}
		
	}
	
	
	// done
	public int[] pullTheLever() {
		int[] vals = new int[5];
		
		// generate random numbers and fill in the array vals
		for(int i = 0; i < 5; i++) {
			vals[i] = (int)(Math.random() * (max - min + 1)) + min;
		}
		
		return vals;
	}
	
	
}