import java.util.*;

public class TeineOsa {

	static double keskmine(double arv1, double arv2, double arv3){
		return (arv1 + arv2 + arv3)/3;
	}
	
	public static void main(String[] args){
		
		if (args.length > 2) {
		
			try {
				
				double[] keskmised = new double[args.length-2];
				
				for(int i=0; i<args.length-2; i++){
					

					double arv1 = 0;
					double arv2 = 0;
					double arv3 = 0;
					
					arv1 = Double.parseDouble(args[i]);
					arv2 = Double.parseDouble(args[i+1]);
					arv3 = Double.parseDouble(args[i+2]);
					
					keskmised[i] = keskmine(arv1, arv2, arv3);
					
				}

				System.out.println("\n" + Arrays.toString(keskmised) + "\n");

			} catch (Exception ex) {
				System.out.println("\n Tundub et vähmalt üks sisestatud märkidest polnud arv. Proovi uuesti! \n");
			}
			
		} else {
			
			System.out.println("\n Sisesta programmi välja kutsudes lõppu vähemalt kolm arvu, eraldades need tühikutega \n");
		}
	}
	
}