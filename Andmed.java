import java.io.*;

public class Andmed {
    public static void main (String[] args)  throws IOException{
        Kahekeskmine maa1 = new Kahekeskmine(100.56, 50.4);
		L6ikudekeskmine kiirused1 = new L6ikudekeskmine("kiirused.txt");
		
        System.out.println("Kahe kilomeetri pikkuse l6igu keskmine kiirus on "+maa1.Keskmine2KM()+" km/h");
		System.out.println("Keskmine kiirus on "+kiirused1.Keskminekokku()+" km/h");
		
    }
}