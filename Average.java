public class Average{

	public static float[] test = {1,2,3,4,5,6,7,8,9,10};

	public static float averageOfThree(float number1, float number2, float number3) {
		return (number1 + number2 + number3) / 3;
	}

	public static float[] slidingAverage(float[] input, int numbersForAverage) {
		float[] output = new float[input.length-(numbersForAverage-1)];
		for (int i=0; i<input.length-(numbersForAverage-1); i++) {
			output[i] = averageOfThree(input[i], input[i+1], input[i+2]);
			System.out.println(output[i]);
		}
		return output;
	}

	public static void main(String[] args) {
		//System.out.println(averageOfThree(3,4,5));
		slidingAverage(test, 3);
	}

}

/*
java Average
2.0
3.0
4.0
5.0
6.0
7.0
8.0
9.0
*/
