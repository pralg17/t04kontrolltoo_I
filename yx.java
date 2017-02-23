public class yx {
	public static void main(String[] args) {
		
		double kesk = keskmine (6, 8, 10);
		double sum = summa (6, 8, 10);
		System.out.println("Arvude summa on " + sum);
		System.out.println("Arvude kronoloogiline keskmine on " + kesk);
		
	}
	
	public static double keskmine(double num1, double num2, double num3) {
		
		double keskmine = ((num1+num3) / 2 + num2) / 2;
		return keskmine;
		
	}
	public static double summa(double num1, double num2, double num3) {
		
		double summa = num1 + num2 + num3;
		return summa;
		
	}
}