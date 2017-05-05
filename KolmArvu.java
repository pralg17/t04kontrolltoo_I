/**
 Libisev keskmine

 * Koosta funktsioon kolme arvu aritmeetilise keskmise leidmiseks. Katseta.


 */
import java.io.*;
public class KolmArvu {

    public static float aritmeetilinekeskmine(float c, float d, float f){

        float ak2 = (c + d + f)/3;

        return ak2;
    }


    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("See programm arvutab kolme arvu aritmeetiline keskmine");

        System.out.println("Sisestage esimene arv");
        String arv1 = reader.readLine();
        float a = Float.parseFloat(arv1);

        System.out.println("Sisestage teine arve");
        String arv2 = reader.readLine();
        float b = Float.parseFloat(arv2);

        System.out.println("Sisestage kolmas arve");
        String arv3 = reader.readLine();
        float c = Float.parseFloat(arv3);


        float ak = aritmeetilinekeskmine(a, b, c);


        System.out.println("Antud kolme arve aritmeetiline keskmine on " + ak);
    }


}
