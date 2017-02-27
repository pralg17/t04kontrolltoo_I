public class Kronoloogiline{
	
	public static double keskmine(double arv1, double arv2, double arv3){
		double lahend = 0;
		lahend = ((arv1/2) + arv2 + (arv3/2))/2;
		return lahend;
	}
	
	public static void main(String[] args){
		System.out.println(keskmine(5,15,25));
	}
	

	
	
}