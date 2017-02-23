// Harmooniline keskmine
/*
 * Koosta funktsioon, mille sisendiks on kahe kilomeetripikkuse lõigu läbimise
 * kiirused (km/h), väljundiks nende kahe kilomeetri läbimise keskmine kiirus.
 *
 *
 * Funktsioonile antakse ette kilomeetripikkuste lõikude läbimiste keskmised kiirused
 * kogumina (km/h). Väljasta kogu selle tee läbimise keskmine kiirus.*/


/* psvm - main
 * sout- println */


public class Kiirus {

	public static void annaKeskmine(int kiirus1, int kiirus2) {
		System.out.printf("Kahe auto keskmine kiirus on: %.1f\n", ((float) kiirus1 + kiirus2) / 2);
	}

	public static void keskminineMassiivist(int... kiirused) {
		int total = 0;
		float vastus;
		for(int aKiirused : kiirused) {
			total = total + aKiirused;
		}
		System.out.printf("Sisestatud andmete keskmine on: %.1f", (float) total/kiirused.length);

	}

	public static void main(String args[]) {
		annaKeskmine(70, 90);
		keskminineMassiivist(60,70,90,120);
	}


}
