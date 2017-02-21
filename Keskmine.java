import java.util.*;
public class Keskmine{
	public static void main(String[] args){
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Sisesta esimese kursuse ainepunktid: ");
		float ainep1 = keyboard.nextInt();
		System.out.print("Sisesta teise kursuse ainepunktid: ");
		float ainep2 = keyboard.nextInt();
		System.out.print("Sisesta esimene hinne: ");
		float hin1 = keyboard.nextInt();
		System.out.print("Sisesta teine hinne: ");
		float hin2 = keyboard.nextInt();
		
		double sum = ((hin1*ainep1)+(hin2*ainep2))/(ainep1+ainep2);
		
		System.out.println("Kaalutud keskmine hinne on "+sum);
		
	}
}