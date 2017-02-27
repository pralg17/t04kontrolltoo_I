import java.util.*;
public class YL1{
	public static double ruutjuur(double a, double b){
		return Math.sqrt(a*b);
	}
	public static void main(String[] args){
		double a, b;
		Scanner input = new Scanner(System.in);
		System.out.print("Sisestage esimene arv: ");
		a=input.nextInt();
		System.out.print("Sisestage teine arv: ");
		b=input.nextInt();
		System.out.println("Arvude ruutjuur on: " + ruutjuur(a,b));
	}
}
/*
[johareil@greeny t04kontrolltoo_I]$ java YL1
Sisestage esimene arv: 7
Sisestage teine arv: 12
Arvude ruutjuur on: 9.16515138991168
*/

