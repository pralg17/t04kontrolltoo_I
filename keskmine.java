public class keskmine{
	public static double keskmine(double arv1, double arv2, double arv3){
		double keskmine = 0;
		keskmine = ((arv1/2)+arv2+(arv3/2))/2;
		return keskmine;
	}
	public static void main(String[] arg){
		System.out.println(keskmine(3, 4, 5));
	}
}