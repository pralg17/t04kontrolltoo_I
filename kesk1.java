public class kesk1{
	public static double kesk1(double a, double b){
		return Math.sqrt(a*b);
	}
	public static void main(String[] args){
		double a = Double.parseDouble(args [0]);
		double b = Double.parseDouble(args [1]);
		System.out.println(kesk1(a,b));
	}
}