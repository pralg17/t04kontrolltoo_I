import java.util.Scanner;
 public class aritkesk{
 	public static double keskmine(double a, double b, double c){
		
 		double keskmine = (a + b + c)/3;
 		return keskmine;
 	}
 
 
 
 	public static void main(String[] args){
 		double a, b, c;
 		Scanner scan = new Scanner(System.in);
 		System.out.println("Sisestage 3 arvu ning ma leian nende aritmeetilise keskmise.");
		System.out.print("Sisesta 1. arv: ");
			a = scan.nextDouble();
		System.out.print("Sisesta 2. arv: ");
			b = scan.nextDouble();
		System.out.print("Sisesta 3. arv: ");
			c = scan.nextDouble();
		
		double keskmine = keskmine(a, b, c);
   		System.out.println("Arvude aritmeetiline keskmine on "+keskmine);
 	}
 }
 
 
 
 /* Kontroll töö 1. punkt: Programm leiab kolme arvu aritmeetilise keskmise*/