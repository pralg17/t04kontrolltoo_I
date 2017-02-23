public class Funktsioon {

   public static void main(String[] args) {
      int hinne1 = 5;
      int hinne2 = 4;
      int hinne3 = 3;

      int eap1 = 6;
      int eap2 = 4;
      int eap3 = 3;
      double keskmine = eapKokku(hinne1, hinne2, hinne3, eap1, eap2, eap3);

      //int f = minArv(a, b, c, d, e);
      //System.out.println("Esimese aine hinne ja EAP-de arv: " + hinne1 + eap1 +"Teine aine hinne ja EAP-de arv: " + hinne2 + eap2 + "Kolmas aine hinne ja EAP-de arv: " +hinne3 + eap3);
      System.out.println("Kaalutud keskmine: " + keskmine);

   }




   /** returns the minimum of two numbers */


   public static double eapKokku(int hinne1, int hinne2, int hinne3, int eap1, int eap2, int eap3) {
       int eapd;
       double hinneKordaEap;
       double kaalutudKeskmine;
       eapd = eap1+eap2+eap3;
       hinneKordaEap = (hinne1*eap1)+(hinne2*eap2)+(hinne3*eap3);
       kaalutudKeskmine = hinneKordaEap/eapd;


       return kaalutudKeskmine;
    }

}


/*

[heinparn@greeny t04kontrolltoo_I]$ java Funktsioon
Kaalutud keskmine: 4.230769230769231


*/
