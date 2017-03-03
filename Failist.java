import java.io.*;

public class Failist {

    static double keskmiseArvutamine (double hindedKokku,double eapdKokku){

      double keskmine = hindedKokku/eapdKokku;

      //Funktsioon tagastab kaalutud keskmise
       return keskmine;

    }

    public static void main(String[] arg) throws IOException {

        BufferedReader lugeja = new BufferedReader(
                new FileReader("andmed.txt")
        );

        PrintWriter kirjutaja = new PrintWriter(new FileWriter("andmed2.txt"));

        String rida = lugeja.readLine();
        double summa = 0;
        double hindedKokku = 0;
        double eapdKokku = 0;
        while(rida!=null) {
            String[] m = rida.split(",");

            double a1 = Integer.parseInt(m[1]); //Hinne
            double a2 = Integer.parseInt(m[2]); //EAP
//System.out.println("m1: " +m[1]);

            //Hinnete kokkukorrutamine
            hindedKokku += a1* a2;
            //System.out.println(hindedKokku);
            //Eap-de kokkuliitmine
            eapdKokku += a2;
          //  System.out.println(eapdKokku);

           /* summa = (a1/2.0)+a2+a3+a4+(a5/2.0); */
            kirjutaja.println("Aine: "+m[0]+"| Keskmine hinne pärast selle tulemuse sissekandmist: "+keskmiseArvutamine(hindedKokku,eapdKokku));
            rida = lugeja.readLine();


        }

        kirjutaja.println("Mida tegelikult ülesandes taheti: "+ keskmiseArvutamine(hindedKokku,eapdKokku));
        lugeja.close();
        kirjutaja.close();
    }
}
