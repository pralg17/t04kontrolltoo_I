import java.io.*;
public class List {

    public static double keskmiseArvutamine(int []h , int [] e){
      //Algväärtustan kokkuvõtmise muutujad
        double hindedKokku = 0;
        double eapdKokku = 0;
        for (int i=0; i<e.length;i++) {
            //Hinnete kokkukorrutamine
            hindedKokku += h[i]* e[i];
            //Eap-de kokkuliitmine
            eapdKokku += e[i];
        }
      //Kaalutud keskmise väljaarvutamine-
       double keskmine = hindedKokku/eapdKokku;

       //Funktsioon tagastab kaalutud keskmise
        return keskmine;
    }

    public static void main(String[] args){
      //  Hinnete ja EAP-de sisestamine
        int [] hinded = {5,5,5,4,4};
        int [] eap = {6,4,3,6,3};

        //hinnete ja eap-de saatmine funktsiooni keskmine
        //Katsetan, kas funktsiooni saatmine toimib
        //keskmiseArvutamine(hinded, eap);

        //hinnete ja eap-de saatmine funktsiooni keskmine ja tulemuse väljatrükk
        System.out.println("Minu hinnete kaalutud keskmine on: " + keskmiseArvutamine(hinded, eap));
    }
  /*   Õppuri läbitud kursuste nimed, hinded (A-F) ja punktid loetakse sisse failist.
  Tulemus kaalutud keskmise näol kirjutatakse teise faili

  */



  /*  [heinparn@greeny t04kontrolltoo_I]$ java List
Minu hinnete kaalutud keskmine on: 4.590909090909091
  */

}
