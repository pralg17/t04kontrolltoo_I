import java.io.*;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Andmed {
    public static void main (String[] args)  throws IOException{
        Kahekeskmine maa1 = new Kahekeskmine(100.56, 50.4);
		L6ikudekeskmine kiirused1 = new L6ikudekeskmine("kiirus.txt");
		Lugeja kiirused3 = new Lugeja("tulemus.txt");
        Kolmas kiirused2 = new Kolmas("http://www.tlu.ee/~oaheinla/Kiirused/kiirused.txt");
		
        System.out.println("Kahe kilomeetri pikkuse l6igu keskmine kiirus on "+maa1.Keskmine2KM()+" km/h");
		System.out.println("Keskmine kiirus on "+kiirused1.Keskminekokku()+" km/h");
        
		
        String string = "Keskmine kiirus on "+kiirused2.Keskminekokkus()+" km/h";
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