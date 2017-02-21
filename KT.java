import java.util.Scanner;
import java.io.*;
import java.net.*;

public class KT{
	//Esimese punkti ülesanne
	public static float KeskmineI(float[] EsiKesK){
		float vastus1=((EsiKesK[0]+EsiKesK[1]+EsiKesK[2])/EsiKesK.length);
		return vastus1;
	}
	//Esimese punkti ülesanne
	public static float KeskmineII(float[] TeiKesK){
		float vastus2=((TeiKesK[0]+TeiKesK[1]+TeiKesK[2])/TeiKesK.length);
		return vastus2;
	}
	
	//Teise punkti ülesanne
	public static double KokkuKeskmine(double[] kilomeeterKesk){
		double vastus3=((kilomeeterKesk[0]+kilomeeterKesk[1]+kilomeeterKesk[2]+kilomeeterKesk[3]+kilomeeterKesk[4])/kilomeeterKesk.length);
		return vastus3;
	}
	
	//Keskmise leidmiseks luban ainult 3 argumenti kilomeetri kohta, ehk kokku 6 
	public static void main(String[] args) throws IOException{
		//Esimese punkti ülesanne
		if(args.length<6){
			System.out.println("Liiga vähe argumente esimese ülesande täitmiseks. Peab olema kuus arvu!");
		} else if(args.length>6){
			System.out.println("Liiga palju argumente esimese ülesande täitmiseks. Peab olema kuus arvu!");
		} else {
			//Esimese kilomeetri keskmised kiirused
			System.out.println("Esimene ülesanne-------------------------------------------");
			float arv1=Float.parseFloat(args[0]);
			float arv2=Float.parseFloat(args[1]);
			float arv3=Float.parseFloat(args[2]);
			//Teise kilomeetri keskmised kiirused
			float arv4=Float.parseFloat(args[3]);
			float arv5=Float.parseFloat(args[4]);
			float arv6=Float.parseFloat(args[5]);
			
			float[] EsiKesK={arv1, arv2, arv3};
			float[] TeiKesK={arv4, arv5, arv6};
			
			float LoppKesk1=KeskmineI(EsiKesK);
			float LoppKesk2=KeskmineII(TeiKesK);
			
			System.out.println("Esimene kilomeeteri keskmine: "+LoppKesk1);
			System.out.println("Teise kilomeeteri keskmine: "+LoppKesk2);
			
		}
	
		//Teise punkti ülesanne
		System.out.println("Teine ülesanne-------------------------------------------");
		double[] kilomeeterKesk = new double[5];
		//See kord küsin kasutajalt
		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < kilomeeterKesk.length; i++)  {
			System.out.print("Sisesta kilomeetri läbimise keskmine kiirus: ");
			kilomeeterKesk[i] = scan.nextDouble();
		}
		
		double LoppKesk3=KokkuKeskmine(kilomeeterKesk);
		System.out.println("5 kilomeetri läbimise kesmine kiirus on: "+LoppKesk3);
		
		//Kolmanda punkti ülesanne
		System.out.println("Kolmas ülesanne-------------------------------------------");
		
		//BufferedReader lugeja=new BufferedReader(new FileReader("KeskmisteVastus.txt"));
		//String rida=lugeja.readLine();
		//String oigevastus = "Veebiaadressilt loetud kilomeetriste lõikude kogu teekonna keskmine kiirus on: 13.157752";
		//lugeja.close(); 
		//if(rida.equals("Veebiaadressilt loetud kilomeetriste lõikude kogu teekonna keskmine kiirus on: 13.157752")){
		//	System.out.println("Õige vastus");}
		//if(!rida.equals("Veebiaadressilt loetud kilomeetriste lõikude kogu teekonna keskmine kiirus on: 13.157752")){
			//System.out.println("Võib arvutada");
			//lugeja.close(); 
			BufferedReader lugeja2 = new BufferedReader(new InputStreamReader(
			new URL("http://www.tlu.ee/~matu350/KT_keskmised%20kiirused.txt").openConnection().getInputStream()
			));
			String rida2=lugeja2.readLine();
			PrintWriter kirjutaja=new PrintWriter(new FileWriter("KeskmisteVastus.txt"));
			
			float kokku=0;
			int loendur=1;
			while(rida2!=null){
				System.out.println(rida2);
				float average = Float.parseFloat(rida2);
				kokku = ((kokku+average)/loendur);
				rida2=lugeja2.readLine();
				loendur++;
			}
			System.out.println("Keskmine: "+kokku);
			kirjutaja.println("Veebiaadressilt loetud kilomeetriste lõikude kogu teekonna keskmine kiirus on: "+kokku);
			kirjutaja.close();
			lugeja2.close(); 
		//}
		
	}
}

		



