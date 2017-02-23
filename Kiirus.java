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

import com.sun.org.apache.bcel.internal.classfile.SourceFile;

public class Kiirus {

	static void annaKeskmine(int kiirus1, int kiirus2){
		System.out.printf("Kahe auto keskmine kiirus on: %.1f", ((float) kiirus1+kiirus2)/2);
	}
	


	public static void main(String[] args) {
		annaKeskmine(70,90);
}


}
