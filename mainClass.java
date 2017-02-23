package kontroll_1;

/**
 * Created by User on 23-Feb-17.
 */
public class mainClass {
    public static void main(String[] args) {

        Auto esimenePaar = new Auto(50,60,60,50);

        System.out.println(esimenePaar);

        System.out.println(esimenePaar.uusAsukoht(3,0,0));
        System.out.println(esimenePaar.uusAsukoht(0,5,0));
        System.out.println(esimenePaar.uusAsukoht(0,0,2));
    }
}
