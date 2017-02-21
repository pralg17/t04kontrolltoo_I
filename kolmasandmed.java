import java.io.*;
public class kolmasandmed{
	public static void main(String[] args) throws IOException{
		BufferedReader failist=new BufferedReader(new FileReader("koef.txt"));
		if(!failist.readLine().equals("Aasta,Palk")){
			throw new RuntimeException("tundmatu vorming");
		}
		String rida=failist.readLine();
		String[] m=rida.split(",");
		System.out.println("Eesimese aasta: "+m[0]+", Palk "+m[1]);
		PrintWriter faili1=new PrintWriter(new FileWriter("koef.txt"));
		double Palk=Double.parseDouble(m[1]);
		double Aasta=Double.parseDouble(m[0]);
		faili1.close();
	}
}