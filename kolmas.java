import java.io.*;
import java.net.*;
public class kolmas{
	public static void main (String[] args) throws IOException{
		BufferedReader failist = new BufferedReader(new FileReader("palgad.txt"));
		String rida = failist.readLine();
		PrintWriter kirjutaja = new PrintWriter(new FileWriter("uuedpalgad.txt"));
		rida = failist.readLine();
		double a11, a12, a13, a14, a15;
		double uusa11, uusa12, uusa13, uusa14, uusa15;
		double a, b, c, d, e;
		int[] arvud = new int[4];
		while(rida != null){
			String[] m = rida.split(",");
			a = Integer.parseInt(m[0]);
			b = Double.parseDouble(m[1]);
			c = Double.parseDouble(m[2]);
			d = Double.parseDouble(m[3]);
			e = Double.parseDouble(m[4]);
			
			double koefitsient = Math.pow(1.0*b*c*d*e, 5);
			a11 = a;
			uusa11 = a;
			a12 = a11*b;
			uusa12 = uusa11*koefitsient;
			a13 = a12*c;
			uusa13 = uusa12*koefitsient;
			a14 = a13*d;
			uusa14 = uusa13*koefitsient;
			a15 = a14*e;
			uusa15 = uusa14*koefitsient;
			
			System.out.println("Aasta 2011 palk: "+ a11 + "\nAasta 2012 palk: " + a12 + "\nAasta 2013 palk: " + a13 + "\nAasta 2014 palk: " + a14 + "\nAasta 2015 palk: " + a15);
 			kirjutaja.println("2011: "+a11+"\n2012: "+a12+" // Yhtlase koefitsiendiga: "+uusa12+"\n2013: "+a13+" // Yhtlase koefitsiendiga: "+uusa13+"\n2014: "+a14+" // Yhtlase koefitsiendiga: "+uusa14+"\n2015: "+a15+" // Yhtlase koefitsiendiga: "+uusa15);
 			break;
 		}
 		failist.close();
 		kirjutaja.close();
 	}
 
 }
