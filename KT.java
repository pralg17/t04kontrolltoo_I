public class KT {
	public static void main(String[] args) {
		
		double numbers1 = average(3, 4, 5);
		System.out.println("Arvude kronoloogiline keskmine on " + numbers1);
		
	}
	
	public static double average(double num1, double num2, double num3) {
		
		double average = (num1 / 2 + num2 + num3 / 2) / 2;
		return average;
		
	}
}