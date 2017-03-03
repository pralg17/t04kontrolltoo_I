import java.util.*;
import java.io.*; 

public class KronFailistFaili{
	
	public static double keskmine(double[] temperatuurid){
		double liida = 0;
		for(int i = 0; i < temperatuurid.length; i++){
			if(i== 0 || i == temperatuurid.length -1){
				liida += temperatuurid[i] / 2;
			}else {
				liida += temperatuurid[i];
			}
		}
		double vastus = liida / (temperatuurid.length -1);
		return vastus;
	}
	
	public static String t88tle(String rida){
		String[] m = rida.split(",");   //1.01  1 3 4 4
		String kuup2evFaili = m[0];          //1.01 vastusfaili
		double[] temperatuurid = new double[5];  //korjan k6ik temperatuurid
		temperatuurid[0] = Double.parseDouble(m[1]);
		temperatuurid[1] = Double.parseDouble(m[2]);
		temperatuurid[2] = Double.parseDouble(m[3]);
		temperatuurid[3] = Double.parseDouble(m[4]);
		temperatuurid[4] = Double.parseDouble(m[5]);
		String keskTempFaili = String.valueOf(keskmine(temperatuurid));  ////kutsu meetod keskmise arvutamiseks
		String vastusFaili = (kuup2evFaili + "," + keskTempFaili);
		return vastusFaili;
	}
	
	public static void main(String[] args) throws IOException{
		double[] arvud1 = {7, 6, 9, 5, 2};
		KronoloogilineKeskmine jada1 = new KronoloogilineKeskmine(arvud1);
		System.out.println("arvude " + Arrays.toString(arvud1) + " kronoloogiline keskmine on " + jada1.kronoloogilineKesk());
		
		//******
		BufferedReader lugeja = new BufferedReader(new FileReader("temperatuurid.txt"));
		PrintWriter kirjutaja = new PrintWriter(new FileWriter("temp_vastus.txt"));
		
		kirjutaja.println("kuup2ev,kesk"); //kirjuta pealkiri
		String rida = lugeja.readLine();   //loeb 1.pealkiri  kuup2ev,kl0,kl6,k12,k18
		rida = lugeja.readLine();          //loeb 2.rida
		while(rida != null){
			kirjutaja.println(t88tle(rida));  //kirjuta tulemus, mille tagastab funktsioon t88tle()
			rida = lugeja.readLine();         //loe jargmine rida
		}
		lugeja.close();
		kirjutaja.close();
	}
}

/*
Loen:
kuup2ev,kl0,kl6,k12,k18,k24
1.01,1,3,4,4,2
1.02,2,5,5,3,1
1.03,5,6,4,4,1
1.04,7,6,9,5,2

Kirjutan:
kuup2ev,kesk
1.01,3.125
1.02,3.625
1.03,4.25
1.04,6.125

*/



		
		

		
		