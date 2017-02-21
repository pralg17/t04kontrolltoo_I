import java.util.Scanner;
public class Esimenekt{
	
	public static void main(String[] args) {
		System.out.println("Sisesta esimene positiivne arv: ");
		Scanner scan1 = new Scanner(System.in);
		double a = scan1.nextDouble();
		
		System.out.println("Sisesta teine positiivne arv: ");
		Scanner scan2 = new Scanner(System.in);
		double b = scan2.nextDouble();
		
		double korrutis, ruutj;
		
		korrutis = a * b;
		System.out.println("Arvude korrutis on " + korrutis );
		
		ruutj = Math.sqrt(korrutis);
		System.out.println("Arvude ruutjuur on " + ruutj);
	}
	
}