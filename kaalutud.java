public class kaalutud{
	public static double keskmine(double hinne1, double hinne2, double eap1, double eap2){
		double keskmine = 0;
		keskmine = (hinne1*eap1 + hinne2*eap2) / (hinne1 + hinne2);
		return keskmine;
		
	}
	public static void main(String[] args){
		int hinne1 = 3;
		int hinne2 = 5;
		int eap1 = 3;
		int eap2 = 4;
		System.out.println("Kaalutud keskmine on: " + keskmine(hinne1, hinne2, eap1, eap2));
	}
}