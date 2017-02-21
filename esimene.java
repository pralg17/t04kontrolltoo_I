import java.util.Scanner;
public class esimene{
	public static float korrutamine(float a, float b){
		float korrutamine = (a*b);
		return korrutamine;
	}
	
	public static void main(String[] args){
		float a, b;
		Scanner scan = new Scanner(System.in);
		System.out.print("Sisesta esimene arv: ");
		a = scan.nextFloat();
		System.out.print("Sisesta teine arv: ");
		b = scan.nextFloat();
		float korrutamine = korrutamine (a, b);
		System.out.println("Arvude ruutjuur on " + Math.sqrt(korrutamine));
	}
}