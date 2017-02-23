package kontroll_1;

/**
 * Created by User on 23-Feb-17.
 */
public class Auto {
    double kaugus1, kiirus1, kaugus2, kiirus2;

    public Auto(double kaugus1, double kaugus2, double kiirus1, double kiirus2) {
        this.kaugus1 = kaugus1;
        this.kaugus2 = kaugus2;
        this.kiirus1 = kiirus1;
        this.kiirus2 = kiirus2;
    }

    public String uusAsukoht(int sekundid,int minutid,int tund) {

         double uusKaugusEsimeneAuto = kaugus1 + ( tund * kiirus1 + kiirus1 / 60 * minutid + kiirus1 / 3600 * sekundid);
         double uusKaugusTeineAuto = kaugus2  + (tund * kiirus2 + kiirus2 / 60 * minutid + kiirus2 / 3600 * sekundid);

         String str = "Nende uued kaugused on " + uusKaugusEsimeneAuto + "km ja " + uusKaugusTeineAuto + "km";

         return str;

    }

    @Override
    public String toString() {
        return "Esimese auto kaugus on " + kaugus1 + "km, teise auto kaugus on " + kaugus2 + "km ja nende kiirus on " + kiirus1 + " ja " + kiirus2 + " km/h";
    }
}
