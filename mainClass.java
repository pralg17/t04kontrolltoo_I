package kontroll_1;

import com.sun.deploy.net.protocol.about.AboutURLConnection;

import java.io.BufferedReader;
import java.io.*;
import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 * Created by User on 23-Feb-17.
 */
public class mainClass {
    public static void main(String[] args) throws FileNotFoundException {

        Auto esimenePaar = new Auto(50,60,60,50);

        System.out.println(esimenePaar);

        // TEINE PUNKT
        System.out.println(esimenePaar.uusAsukoht(3,0,0));
        System.out.println(esimenePaar.uusAsukoht(0,5,0));
        System.out.println(esimenePaar.uusAsukoht(0,0,2));

        // KOLMAS PUNKT
        BufferedReader lugeja= new BufferedReader(new FileReader("andmed.txt"));
        try {
            String rida= null;
            rida = lugeja.readLine();
            PrintWriter kirjutaja = new PrintWriter(new FileWriter("vastus.txt"));

            while (rida != null) {
                String[] r = rida.split(",");

                double esimeneKaug = Double.parseDouble(r[0]);
                double teineKaug = Double.parseDouble(r[1]);
                double esimeneKiirus = Double.parseDouble(r[2]);
                double teineKiirus = Double.parseDouble(r[3]);

                Auto temp = new Auto(esimeneKaug,teineKaug,esimeneKiirus,teineKiirus);
                kirjutaja.println(temp);

                kirjutaja.println(temp.uusAsukoht(Integer.parseInt(r[4]),Integer.parseInt(r[5]),Integer.parseInt(r[6])));

                kirjutaja.println("\n");
                try {
                    rida = lugeja.readLine();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            kirjutaja.close();
        }catch (IOException e)
        {
            e.printStackTrace();
        }
        try {

            lugeja.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
