public class KT{
	public static float KeskmineI(float[] EsiKesK){
		float vastus1=((EsiKesK[0]+EsiKesK[1]+EsiKesK[2])/EsiKesK.length);
		return vastus1;
	}
	
	public static float KeskmineII(float[] TeiKesK){
		float vastus2=((TeiKesK[0]+TeiKesK[1]+TeiKesK[2])/TeiKesK.length);
		return vastus2;
	}
	
	//Keskmise leidmiseks luban ainult 3 argumenti kilomeetri kohta
	public static void main(String[] args){
		if(args.length<6){
			System.out.println("Liiga vähe argumente!");
		} else if(args.length>6){
			System.out.println("Liiga palju argumente!");
		}else {
			System.out.println("Tubli!");
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

	}
}