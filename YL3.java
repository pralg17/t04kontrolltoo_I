import java.io.*;
import java.net.*;
public class YL3{
	public static void main(String[] args) throws IOException {
		BufferedReader failist = new BufferedReader(new FileReader("koefitsiendid.txt"));
		String rida=failist.readLine();
		PrintWriter kirjutaja = new PrintWriter(new FileWriter("vastus.txt"));
		rida=failist.readLine();
		double palk11, palk12, palk13, palk14, palk15;
		double koef_palk11, koef_palk12, koef_palk13, koef_palk14, koef_palk15;
		double a, b, c, d, e;
		int[] arvud = new int[4];
		while(rida!=null){
			String[] m=rida.split(",");
			a = Integer.parseInt(m[0]);
			b = Double.parseDouble(m[1]);
			c = Double.parseDouble(m[2]);
			d = Double.parseDouble(m[3]);
			e = Double.parseDouble(m[4]);
			
			double koefitsient= Math.pow(1.0*b*c*d*e, 5);
			palk11=a;
			koef_palk11=a;
			palk12=palk11*b;
			koef_palk12=koef_palk11*koefitsient;
			palk13=palk12*c;
			koef_palk13=koef_palk12*koefitsient;
			palk14=palk13*d;
			koef_palk14=koef_palk13*koefitsient;
			palk15=palk14*e;
			koef_palk15=koef_palk14*koefitsient;
			/*System.out.println("Aasta 2011 palk:"+ palk11 + "\nAasta 2012 palk:" + palk12 + "\nAasta 2013 palk:" + palk13 + "\nAasta 2014 palk:" + palk14 + "\nAasta 2015 palk:" + palk15);*/
			kirjutaja.println("2011: \nPalk: "+palk11+"\n2012: \nPalk: "+palk12+" || Ühtlase koefitsiendiga:"+koef_palk12+"\n2013: \nPalk: "+palk13+" || Ühtlase koefitsiendiga:"+koef_palk13+"\n2014: \nPalk: "+palk14+" || Ühtlase koefitsiendiga:"+koef_palk14+"\n2015: \nPalk: "+palk15+" || Ühtlase koefitsiendiga:"+koef_palk15);
			break;
		}
		failist.close();
		kirjutaja.close();
	}

}
/*
[johareil@greeny t04kontrolltoo_I]$ java YL3
Aasta 2011 palk:1000.0
Aasta 2012 palk:1200.0
Aasta 2013 palk:1200.0
Aasta 2014 palk:960.0
Aasta 2015 palk:1056.0
*/

