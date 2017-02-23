import java.io.*;
import java.util.*;
public class KKeskmine{
	static double Kaalutud_Keskmine(double Ainepunktid1, double Ainepunktid2, double Hinne1, double Hinne2){
		//Vastavalt numbrile -> A=5, B=4, C=3 jne.
		return ((Ainepunktid1*Hinne1)+(Ainepunktid2*Hinne2))/(Ainepunktid1+Ainepunktid2);
	}
	public double Kaalutud_Keskmine_Kogumikega(int[] ainep_kogumik, int[] hinnete_kogumik){
		return ((ainep_kogumik[0]*hinnete_kogumik[0])+(ainep_kogumik[1]*hinnete_kogumik[1]))/(ainep_kogumik[0]+ainep_kogumik[1]);
	}
	public static void main(String[] args){
		System.out.println("Arvutame kaalutud keskmise: " + Kaalutud_Keskmine(6, 6, 2, 3));
		Scanner scan = new Scanner(System.in);
		int[] ainep_kogumik = new int[2];
		int[] hinnete_kogumik = new int[2];
		System.out.println("Täidame kogumikud");
		for(int i=0; i<2; i++){
			System.out.println("Sisestage ainepunktid: ");
			ainep_kogumik[i] = scan.nextInt();
		}
		for(int i=0; i<2; i++){
			System.out.println("Sisestage hinded: ");
			hinnete_kogumik[i] = scan.nextInt();
		}
		System.out.println("Kogumikes olevate andmete järgi on kaalutud keskmine: " + Kaalutud_Keskmine_Kogumikega(int[] ainep_kogumik, int[] hinnete_kogumik));
	}
}