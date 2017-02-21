import java.util.Scanner;
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
	public static void main(String[] args){
		//Esimese punkti ülesanne
		if(args.length<6){
			System.out.println("Liiga vähe argumente esimese ülesande täitmiseks. Peab olema kuus arvu!");
		} else if(args.length>6){
			System.out.println("Liiga palju argumente esimese ülesande täitmiseks. Peab olema kuus arvu!");
		}else {
			//Esimese kilomeetri keskmised kiirused
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
		double[] kilomeeterKesk = new double[5];
		
		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < kilomeeterKesk.length; i++)  {
			System.out.print("Sisesta kilomeetri läbimise keskmine kiirus: ");
			kilomeeterKesk[i] = scan.nextDouble();
		}
		
		double LoppKesk3=KokkuKeskmine(kilomeeterKesk);
		System.out.print("5 kilomeetri läbimise kesmine kiirus on: "+LoppKesk3);
		
	}
}

		



