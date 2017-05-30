import java.io.*;
import java.util.*;
public class KKeskmine{
	//Funktsioon ise ette seadud hinnetega kontrollimiseks
	static double Kaalutud_Keskmine(double Ainepunktid1, double Ainepunktid2, double Hinne1, double Hinne2){
		//Vastavalt numbrile -> A=5, B=4, C=3 jne.
		return ((Ainepunktid1*Hinne1)+(Ainepunktid2*Hinne2))/(Ainepunktid1+Ainepunktid2);
	}
	//funktsioon scanneriga saadud andmete jaoks.
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
	//Failist loetud hinnete jaoks.
	public static double KK_Failist(String fnimi, int hindenr, int ainenr) throws IOException{
		BufferedReader reader = new BufferedReader(new FileReader(fnimi));
		String rida = reader.readLine();
		rida = reader.readLine();
		int hinne;
		double korrutiste_summa = 0;
		double ainepunktide_summa = 0;
		double kk = 0;
		List<Integer> hinded = new ArrayList<Integer>();
		List<Integer> punktid = new ArrayList<Integer>();
		while(rida!=null){
			String[] m = rida.split(",");
			String hindekontroll = m[hindenr];
			rida = reader.readLine();
			try{
				punktid.add(Integer.parseInt(m[ainenr]));
				if(hindekontroll.equals ("A")){
					hinne = 5;
					hinded.add(hinne);
				} else if(hindekontroll.equals ("B")){
					hinne = 4;
					hinded.add(hinne);
				} else if(hindekontroll.equals ("C")){
					hinne = 3;
					hinded.add(hinne);
				} else if(hindekontroll.equals ("D")){
					hinne = 2;
					hinded.add(hinne);
				} else if(hindekontroll.equals ("E")){
					hinne = 1;
					hinded.add(hinne);
				} else if(hindekontroll.equals ("F")){
					hinne = 0;
					hinded.add(hinne);
				}
			} catch (Exception ex){
				System.out.println("Andmetes on viga");
			}
		}
		for(int i=0; i<hinded.size(); i++){
			korrutiste_summa += hinded.get(i) * punktid.get(i);
			ainepunktide_summa += punktid.get(i);
		}
		kk = korrutiste_summa/ainepunktide_summa;
		reader.close();
		return kk;
	}
	
	public static void main(String[] args) throws IOException{
		
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
		System.out.println("Kogumikes olevate andmete järgi on kaalutud keskmine: " + Kaalutud_Keskmine_Kogumikega(ainep_kogumik, hinnete_kogumik) + "\n");
		
		//Kolmas punkt
		
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(
		new FileOutputStream("Kaalutud_Keskmine.txt"), "utf-8"));
		writer.write("Kaalutud keskmine on: " + KK_Failist("Ained.txt", 1, 2));
		writer.close();
		System.out.println("Kirjutamine lõpetatud");
		System.out.println("Vaadake faili Kaalutud_Keskmine.txt, et näha kaalutud keskmist");

	}
}


/*
Tulemused:

[kristarn@greeny Kontrollt66]$ java KKeskmine
Arvutame kaalutud keskmise: 2.5

Mitu ainet teil oli see semester?
5
Sisestage ainepunktid:
6
6
4
4
4
Sisestage hinded:
5
2
4
3
5
Kogumikes olevate andmete järgi on kaalutud keskmine: 3.75

Kirjutamine lõpetatud
Vaadake faili Kaalutud_Keskmine.txt, et näha kaalutud keskmist
[kristarn@greeny Kontrollt66]$

*/

