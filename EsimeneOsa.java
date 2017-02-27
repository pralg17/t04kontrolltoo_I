public class EsimeneOsa {
	
	static double keskmine(double arv1, double arv2, double arv3){
		return (arv1 + arv2 + arv3)/3;
	}
	
	public static void main(String[] args){
		
		if (args.length == 3) {
			
			try{
				double arv1 = 0;
				double arv2 = 0;
				double arv3 = 0;
				
				arv1 = Double.parseDouble(args[0]);
				arv2 = Double.parseDouble(args[1]);
				arv3 = Double.parseDouble(args[2]);
				
				System.out.println("\n Nende kolme arvu keskmine on " + keskmine(arv1, arv2, arv3) + "\n");
			
			} catch (Exception ex) {
				System.out.println("\n Tundub et vämalt üks sisestatud suurustest polnud arv. Proovi uuesti! \n");
			}
			
		} else {
			
			System.out.println("\n Sisesta programmi välja kutsudes lõppu kolm arvu, eraldades need tühikutega \n");
		
		}
	}
	
}