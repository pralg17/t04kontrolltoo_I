import java.util.Scanner;
 public class kontrolltoo_punkt1{
 	public static double keskmine(double a, double b, double c){
 		double keskmine = (a + b + c)/3;
 		return keskmine;
 	}

 	public static void main(String[] args){
 		double a, b, c;
 		Scanner scan = new Scanner(System.in);
 		System.out.println("Sisestage 3 arvu ja programm leiab nende aritmeetilise keskmise.");

		System.out.print("Sisesta esimene arv: ");
			a = scan.nextDouble();
		System.out.print("Sisesta teine arv: ");
			b = scan.nextDouble();
		System.out.print("Sisesta kolmas arv: ");

			c = scan.nextDouble();
		double keskmine = keskmine(a, b, c);
   		System.out.println("Sinu sisestatud kolme arvu aritmeetiline keskmine on "+keskmine);
   	}
   }