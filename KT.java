//import java.util.Arrays;

public class KT {
	public static void main(String[] args) {
		
		double numbers1 = average(3, 4, 5);
		double[] numbers2 = new double[] {23,5,67,43,201,22,9,70,78,100};
		System.out.println("Arvude kronoloogiline keskmine on " + numbers1);
		System.out.println(averageArray(numbers2));
		
	}
	
	public static double average(double num1, double num2, double num3) {
		
		double average = (num1 / 2 + num2 + num3 / 2) / 2;
		return average;
		
	}
	
	public static double averageArray(double[] numbers2) {
		
		double averageFirstNum = numbers2[0] / 2;
		double averageLastNum = numbers2[numbers2.length-1] / 2;
		double averageMiddleNums = 0;
		int arrayLength = numbers2.length;
		
		
		for(int i = 1; i < numbers2.length-1; i++) {
			averageMiddleNums = averageMiddleNums + numbers2[i];
		}
		
		double average = (averageFirstNum + averageMiddleNums + averageLastNum) / (numbers2.length-1);
		
		return average;
		// 11.5 + 495 + 50 = 556.5
		//556.5 / 9.0
	}
	
}