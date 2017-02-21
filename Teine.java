package com.company;
import java.io.*;
import java.util.Scanner;

public class Teine {

    public static void main(String[] args) throws IOException {

        Scanner scan = new Scanner (System.in);
        System.out.print("Mitu arvu tahad sisestada: ");
        int kogus = scan.nextInt();

        int[] numbrid = new int[kogus];
        int kordus=0;
        for(kordus=0;kordus<kogus;kordus++){
            System.out.println("Sisesta arv: ");
            numbrid[kordus] = scan.nextInt();
        }


        int keskmiseKordus=0;
        double keskmine = 0;
        double summa = 0;

        for(keskmiseKordus=0;keskmiseKordus<kogus;keskmiseKordus++){
            if (keskmiseKordus == 0){
                summa = summa + (numbrid[keskmiseKordus]/2.0);
            } else if (keskmiseKordus == numbrid.length-1){
                summa = summa + (numbrid[kogus-1]/2.0);
            } else {
                summa = summa + numbrid[keskmiseKordus];
            }
        }


        System.out.println("Vastus:"+summa);

    }
}

/*
Kronoloogiline keskmine Teine punkt Tanel Otsa
Mitu arvu tahad sisestada: 5
Sisesta arv:
2
Sisesta arv:
4
Sisesta arv:
6
Sisesta arv:
8
Sisesta arv:
10
Vastus:24.0

 */
