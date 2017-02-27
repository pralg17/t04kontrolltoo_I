import java.util.*;
public class ylesanne1{
	public static double squared(double a, double b){
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

