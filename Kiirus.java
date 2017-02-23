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

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.*;
import java.lang.*;

public class Kiirus {

public static void annaKeskmine(int kiirus1, int kiirus2) {
	System.out.printf("Kahe auto keskmine kiirus on: %.1f\n", ((float) kiirus1 + kiirus2) / 2);
}

public static void keskminineMassiivist(int... kiirused) {
	int total = 0;
	for(int aKiirused : kiirused) {
		total = total + aKiirused;
	}
	System.out.printf("Sisestatud andmete keskmine on: %.1f\n", (float) total / kiirused.length);
}

public static void loeVeebist() throws IOException {
	double vastus;
	double total = 0;
	URL url = new URL("http://www.tlu.ee/~jaagup/andmed/muu/pikkused.txt");
	Scanner s = new Scanner(url.openStream());
	String content = s.nextLine();
	String[] array = content.split("\\s+");
	for(String element:array) {
		total = total + Integer.parseInt(element);
	}
	vastus = total/array.length;
	System.out.println(vastus);
}

public static void main(String args[]) throws IOException {
	annaKeskmine(70, 90);
	keskminineMassiivist(60, 70, 90, 120);
	loeVeebist();





}
}