import java.util.Scanner;
public class KT1{
	public static double korrutis (double arv1, double arv2) {
		double korrutis = arv1*arv2;
		return Math.sqrt(korrutis);
	}
	
	public static void main(String[] args){
		int arv1, arv2;
		Scanner input = new Scanner(System.in);
		System.out.print("Sisestage esimene arv ");
		arv1=input.nextInt();
		System.out.print("Sisestage teine arv ");
		arv2=input.nextInt();
		double korrutis = korrutis (arv1, arv2);
		System.out.println("Arvude ruutjuur on " + korrutis);
	}
}
/* 
[annagubs@greeny t04kontrolltoo_I]$ java KT1
Sisestage esimene arv 2
Sisestage teine arv 8
Arvude ruutjuur on 4.0
 */