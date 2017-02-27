import java.io.*;
import java.util.*;
public class KKeskmine{
	static double Kaalutud_Keskmine(double Ainepunktid1, double Ainepunktid2, double Hinne1, double Hinne2){
		//Vastavalt numbrile -> A=5, B=4, C=3 jne.
		return ((Ainepunktid1*Hinne1)+(Ainepunktid2*Hinne2))/(Ainepunktid1+Ainepunktid2);
	}
	public static double Kaalutud_Keskmine_Kogumikega(int[] ainep_kogumik, int[] hinnete_kogumik){
		double K_Kesk_kogumiga = 0;
		double ainep_h_k_summa = 0;
		for(int i=0; i<ainep_kogumik.length; i++){
			ainep_h_k_summa = ainep_h_k_summa + ainep_kogumik[i] * hinnete_kogumik[i];
		}
		
		double ainep_summa = 0;
		for(int i: ainep_kogumik){
			ainep_summa += i;
		}
		
		K_Kesk_kogumiga = ainep_h_k_summa/ainep_summa;
		return K_Kesk_kogumiga;

	}
	public static void main(String[] args){
		
		//Esimene punkt
		
		System.out.println("Arvutame kaalutud keskmise: " + Kaalutud_Keskmine(6, 6, 2, 3) + "\n");
		
		//Teine punkt
		
		Scanner scan = new Scanner(System.in);
		int mitu;
		System.out.println("Mitu ainet teil oli see semester? ");
		mitu = scan.nextInt();
		System.out.println("Sisestage ainepunktid: ");
		int[] ainep_kogumik = new int[mitu];
		for(int i=0; i<mitu; i++){
			ainep_kogumik[i] = scan.nextInt();
		}
		System.out.println("Sisestage hinded: ");
		int[] hinnete_kogumik = new int[mitu];
		for(int i=0; i<mitu; i++){
			hinnete_kogumik[i] = scan.nextInt();
		}
		System.out.println("Kogumikes olevate andmete järgi on kaalutud keskmine: " + Kaalutud_Keskmine_Kogumikega(ainep_kogumik, hinnete_kogumik));
		
		//Kolmas punkt
		
		
	}
}


/*
Tulemused:

[krisliiv@greeny t04kontrolltoo_I]$ java KKeskmine
Arvutame kaalutud keskmise: 2.5

Mitu ainet teil oli see semester?
3
Sisestage ainepunktid:
6
4
6
Sisestage hinded:
3
3
3
Kogumikes olevate andmete järgi on kaalutud keskmine: 3.0

*/

