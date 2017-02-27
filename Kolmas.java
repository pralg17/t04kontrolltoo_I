import java.io.*;
import java.net.*;
public class Kolmas{
    String asukoht;
    public Kolmas(String asukoht){
        this.asukoht = asukoht;
    }
    BufferedReader kysiLugeja(){
        try{return new BufferedReader(new InputStreamReader(new URL(asukoht).openConnection().getInputStream()));
        } catch (Exception ex) {
            return null;
        }
    }
    public double Keskminekokkus()throws IOException{
        BufferedReader lugeja = kysiLugeja();
        String rida = lugeja.readLine();
        int kokku=0;
        double summa=0;
        double keskmine = 0;
        while(rida !=null){
            double kiirus = Double.parseDouble(rida);
            summa += 1/kiirus;
            kokku++;
            rida = lugeja.readLine();
        }
       lugeja.close();
       keskmine = kokku/summa;
       return keskmine;
    }      
}    