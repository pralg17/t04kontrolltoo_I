
import java.io.*;
import java.util.*;
public class kolmasmain{
	public static void main(String[] args) throws IOException{
		kolmas uuring=new kolmas("koefitsendid.txt");
		System.out.println("Uued palgad (nad kirjutati ka faili palgad.txt):");
		System.out.println(uuring.maksimum(0));
		//System.out.println(reader.yhtlane());
		kolmas.yhtlane();







		PrintWriter kirjutaja = new PrintWriter (new FileWriter("palgad.txt"));
		/*
		for(double dbl : reader.uued_palgad){


			//System.out.printf("First Name: %s\nLast Name: %s",firstname, lastname);

			kirjutaja.println(dbl);
			//kirjutaja.println("algne: "+ dbl + "hilisem: " + (dbl+(dbl*kasv)) + ".");
		}
		*/
		//kirjutaja.close();
		kirjutaja.println("kindla koefitsendiga :::: ühtlase koefitsendiga");
		for(int i=0; i<kolmas.uued_palgad.size(); i++){

			kirjutaja.println(kolmas.uued_palgad.get(i) + " :::: " + kolmas.uued_palgad_yhtlane.get(i) );
		}
		kirjutaja.close();
		






	}
}

/*

väljatrükk:

[gregness@greeny t04kontrolltoo_I]$ java kolmasmain
Uued palgad (nad kirjutati ka faili palgad.txt):
[1000.0, 1050.0, 1029.0, 998.13, 1008.1113, 1083.7196475]
1083.7196475
1000.0
16.743929500000014
pikkus: 6
1016.7439295
1083.7196475
1033.487859
1083.7196475
1050.2317885
1083.7196475
1066.975718
1083.7196475
1083.7196474999998
1083.7196475


*/
