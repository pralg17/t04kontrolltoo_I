import java.io.*;
public class Auto{
	public static void main(String[] args) throws IOException{
		BufferedReader failist=new BufferedReader(new FileReader("Sisend2.txt"));
		if(!failist.readLine().equals("Kiirus,Kaugus,Aeg3s,Aeg5m,Aeg2h")){
			throw new RuntimeException("tundmatu vorming");
		}
		String rida=failist.readLine();
		String[] m=rida.split(",");
		System.out.println("Kiirus: "+m[0]+"Kaugus: "+m[1]+",Aeg3s:"+m[2]+",Aeg5m:"+m[3]+",Aeg2h:"+m[4]);
		PrintWriter faili1=new PrintWriter(new FileWriter("vastus2.txt"));
		double Aeg3s=Double.parseDouble(m[2]);
		double Kiirus=Double.parseDouble(m[0]);
		double Kaugus=Double.parseDouble(m[1]);
		double Aeg5m=Double.parseDouble(m[3]);
		double Aeg2h=Double.parseDouble(m[4]);
		double[] v=Asukoht(Kiirus, Kaugus, Aeg3s, Aeg5m, Aeg2h);
		faili1.println("Kiirus,Kaugus,Kaugus3s,Kaugus5m,Kaugus2h");
		faili1.println(m[0]+","+m[1]+","+v[0]+","+v[1]+","+v[2]);
		
		faili1.close();
	}
		public static double[] Asukoht(double Kiirus, double Kaugus, double Aeg3s, double Aeg5m, double Aeg2h){
			double[] vastus=new double[3];
			vastus[0]=Kaugus+Kiirus*Aeg3s;
			vastus[1]=Kaugus+Kiirus*Aeg5m;
			vastus[2]=Kaugus+Kiirus*Aeg2h;
			return vastus;
		} 
}