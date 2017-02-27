import java.io.*;
import java.util.Scanner;

public class kax {

    public static void main(String[] args) throws IOException {

        Scanner scan = new Scanner (System.in);
        System.out.print("Mitu arvu tahad sisestada: ");
        int mitux = scan.nextInt();

        int[] numbrid = new int[mitux];
        int kordus=0;
        for(kordus=0;kordus<mitux;kordus++){
            System.out.println("Sisesta arv: ");
            numbrid[kordus] = scan.nextInt();
        }


        int keskmiseKordus=0;
        double summa = 0;

        for(keskmiseKordus=0;keskmiseKordus<mitux;keskmiseKordus++){
            if (keskmiseKordus == 0){
                summa = summa + (numbrid[keskmiseKordus]/2.0);
            } else if (keskmiseKordus == numbrid.length-1){
                summa = summa + (numbrid[mitux-1]/2.0);
            } else {
                summa = summa + numbrid[keskmiseKordus];
            }
        }
		
		double kronokeskmine = summa/(mitux-1);


        System.out.println("Sisestatud arvude kronoloogiline keskmine on: "+kronokeskmine);

    }
}