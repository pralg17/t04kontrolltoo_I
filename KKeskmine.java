public class KKeskmine{
	static double Kaalutud_Keskmine(double Ainepunktid1, double Ainepunktid2, double Hinne1, double Hinne2){
		//Vastavalt numbrile -> A=5, B=4, C=3 jne.
		return ((Ainepunktid1*Hinne1)+(Ainepunktid2*Hinne2))/(Ainepunktid1+Ainepunktid2);
	}
	public static void main(String[] args){
		System.out.println("Arvutame kaalutud keskmise: " + Kaalutud_Keskmine(6, 6, 2, 3));
	}
}