import java.io.*;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Andmed {
    public static void main (String[] args)  throws IOException{
        
		/* Esimene */
		Kahekeskmine maa1 = new Kahekeskmine(100.56, 50.4);
		System.out.println("Esimene ülesanne:");
		System.out.println("Kahe kilomeetri pikkuse l6igu keskmine kiirus on "+maa1.Keskmine2KM()+" km/h \n");
		
		/* Teine */
		L6ikudekeskmine kiirused1 = new L6ikudekeskmine("kiirus.txt");
		System.out.println("Teine ülesanne:");
		System.out.println("Keskmine kiirus on "+kiirused1.Keskminekokku()+" km/h \n");

		/* Kolmas */
		Kolmas kiirused2 = new Kolmas("http://www.tlu.ee/~oaheinla/Kiirused/kiirused.txt");
		String string = "Keskmine kiirus on "+kiirused2.Keskminekokkus()+" km/h";
		System.out.println("Kolmas ülesanne:");
		Lugeja kiirused3 = new Lugeja("tulemus.txt");       
		String v6rdus = kiirused3.Keskminekokkuss();
		if(!string.equals(v6rdus)){
			try {
            BufferedWriter write = new BufferedWriter ( new FileWriter ("tulemus.txt"));
            write.write(string);
            write.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		System.out.println("Fail kirjutati üle ja sisu on järgmine: "+string);
		} else {
		System.out.println("Faili ei kirjutatud üle ja sisu on järgmine: "+v6rdus);
		}
    }
}
/*
[oaheinla@greeny t04kontrolltoo_I]$ java Andmed
Esimene ülesanne:
Kahe kilomeetri pikkuse l6igu keskmine kiirus on 67.14658187599365 km/h

Teine ülesanne:
Keskmine kiirus on 67.14658187599365 km/h

Kolmas ülesanne:
Fail kirjutati üle ja sisu on järgmine: Keskmine kiirus on 67.14658187599365 km/h
*/