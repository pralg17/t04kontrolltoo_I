import java.io.*;
public class Kronoloogiline3{
	public static void main(String[] args) throws IOException{
		BufferedReader failist=new BufferedReader(new FileReader("temp.txt"));
		System.out.println(failist.readLine());
		String rida=failist.readLine();
		String[] m=rida.split(",");
		//System.out.println("Kuupaev"+m[0]+", kell 0"+m[1]+", kell 6"+m[2]+", kell 12"+m[3]+",kell 18"+m[4]+",kell 24"+m[5]);
		

 
		PrintWriter kirjutaja = new PrintWriter(new FileWriter("temp1.txt"));
 
         int[] summad = new int[5];
         double summa1 = 0;
		 double summa2 = 0;
		 double summa3 = 0;
 
        while(rida!=null) {
             m = rida.split(",");
 
             double N1 = Integer.parseInt(m[1]);
             double N2 = Integer.parseInt(m[2]);
             double N3 = Integer.parseInt(m[3]);
             double N4 = Integer.parseInt(m[4]);
             double N5 = Integer.parseInt(m[5]);
 
             summa1 = (N1/2.0)+(N5/2.0);
			 summa2 = (N2 + N3 + N4);
			 summa3 = (summa1 + summa2) / 5.0;
             kirjutaja.println("Kuupäev: "+m[0]+" Keskmine temp: "+summa3);
             rida = failist.readLine();
         }
         failist.close();
         kirjutaja.close();
		 


 }
	}
