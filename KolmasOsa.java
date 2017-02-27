import java.io.*;
import java.util.*;

public class KolmasOsa{
	public static void main(String[] args) throws IOException{
		
		double[] sisendArvud=null;
	
		BufferedReader failist=new BufferedReader(new FileReader("numbrid.txt"));
		
		String[] m=failist.readLine().split(" ");
		
		sisendArvud=new double[m.length];
		
		for(int i=0; i<m.length; i++){
			sisendArvud[i]=Double.parseDouble(m[i]);
		}
		
		failist.close();
		
		if (args.length == 1) {
		
			try {
				
				int kordaja = Integer.parseInt(args[0]);
				double[] keskmised = new double[sisendArvud.length-kordaja+1];
				
				for(int i=0; i<sisendArvud.length-kordaja+1; i++){
					
					double summa = 0;
					
					for(int j=0; j<kordaja; j++){
						summa += sisendArvud[i+j];
					}
					
					keskmised[i] = summa/kordaja;
					
				}
				
				try {
					PrintWriter pw=new PrintWriter(new FileWriter("tulemus.txt"));
					pw.println(Arrays.toString(keskmised));
					pw.close();
				} catch(Exception ex) {ex.printStackTrace();}
				
/*  				System.out.println("\n" + Arrays.toString(sisendArvud));
				System.out.println("\n" + Arrays.toString(keskmised) + "\n"); */

			} catch (Exception ex) {
				System.out.println("\n Tundub et libiseva keskmise arvutamiseks vajaliku arvude hulga sisestamisel läks miskit nihu. Proovi uuesti! \n");
			}
			
		} else {
			
			System.out.println("\n Sisesta programmi välja kutsudes lõppu mitut järjestikust arvu libiseva keskmise arvutamiseks kasutada.\n Kuna massiivis on " + sisendArvud.length + " arvu siis mõistliku tulemuse saamiseks peab arv jääma vahemikku 1-" + sisendArvud.length + "\n");
		}
		
	}
}
