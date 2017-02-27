import java.io.*;
public class Autodteel3{
    public static void main(String[]args) throws IOException{
        BufferedReader lugeja= new BufferedReader(
        new FileReader("Autodteel3_andmed.txt")
        );
        String rida=lugeja.readLine();
        int loendur=0;
		PrintWriter faili = new PrintWriter(new FileWriter("Autodteel3_vastus.txt"));
        while(rida!=null){
        loendur ++;
        String[] m = rida.split(",");
        double arv1 = Double.parseDouble(m[0]);
		double arv2 = Double.parseDouble(m[1]);
		double arv3 = Double.parseDouble(m[2]);
		double arv4 = Double.parseDouble(m[3]);
		double arv5 = Double.parseDouble(m[4]);

        double sekundid = arv1+(arv2*arv3);
		double minutid = arv1+(arv2*arv4);
		double tunnid = arv1+(arv2*arv5);
		
		

        faili.println("Auto kaugus maantee algusest on "+arv1+"km"+" ja auto kiirus on "+arv2+"km/h. Auto asukoht 3 sekundi pärast on "+sekundid+"km, 5 minuti pärast "+ minutid+" km ning 2 tunni pärast "+ tunnid+"km.");
        rida=lugeja.readLine();
        }
        lugeja.close();
		faili.close();
    }
}