package com.company;
import java.io.*;
public class Kolmas {

    public static void main(String[] args) throws IOException {

        BufferedReader lugeja = new BufferedReader(
                new FileReader("kuup2ev.txt")
        );

        PrintWriter kirjutaja = new PrintWriter(new FileWriter("kuup2ev2.txt"));

        int loendur = 0;
        int[] summad = new int[5];
        String rida = lugeja.readLine();
        double summa = 0;

        while(rida!=null) {
            String[] m = rida.split(";");

            double a1 = Integer.parseInt(m[1]);
            double a2 = Integer.parseInt(m[2]);
            double a3 = Integer.parseInt(m[3]);
            double a4 = Integer.parseInt(m[4]);
            double a5 = Integer.parseInt(m[5]);

            summa = (a1/2.0)+a2+a3+a4+(a5/2.0);
            kirjutaja.println("Kuupäev: "+m[0]+" Keskmine temp: "+summa);
            rida = lugeja.readLine();
            loendur++;
        }
        lugeja.close();
        kirjutaja.close();
    }
}
/*
Väljatrükk :
Kuupäev: 01-02 Keskmine temp: 4.0
Kuupäev: 02-02 Keskmine temp: 3.5
Kuupäev: 03-02 Keskmine temp: 4.0
Kuupäev: 04-02 Keskmine temp: 16.5
Kuupäev: 05-02 Keskmine temp: 12.5

*/
