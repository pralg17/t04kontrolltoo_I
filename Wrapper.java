public class Wrapper{
    public static void main(String[] args){

        Double[] X = new Double[] {1.0,2.0,3.0};
        Double[] Y = new Double[] {3.0,1.0,2.0};
        Double[] X1 = new Double[] {1.4,2.3,0.3,-3.5};
        Double[] Y1 = new Double[] {4.0,1.3,5.7,-2.5};
        Kolmnurk k1 = new Kolmnurk(X,Y);

        System.out.println("Külgede pikkused:");
        System.out.println(k1.getSides());
        System.out.println("Keskpunkti koordinaadid:");
        System.out.println(k1.getMidpoint());
        System.out.println("Kontrollime, kas võrdkülgsus jääb järgmise protsendi piirdeisse:");
        System.out.println(k1.eqLatDev(50));
        System.out.println("Nüüd vaatame, kas punktide kaugus keskpaigast jääb järgmise protsendi ulatusse:");
        System.out.println(k1.cenDistDev(10));

        Kolmnurk hulknurk = new Kolmnurk(X1,Y1);
        System.out.println("Samad näitajad hulknurga puhul:");
        System.out.println(hulknurk.getSides());
        System.out.println(hulknurk.getMidpoint());
        System.out.println(hulknurk.eqLatDev(50));
        System.out.println(hulknurk.cenDistDev(10));

    }
}

