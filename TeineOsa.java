public class TeineOsa {

	static double keskmine(double arv1, double arv2, double arv3){
		return (arv1 + arv2 + arv3)/3;
	}
	
	public static void main(String[] args){
		
		double[] keskmised = null;
		
		for(int i=0; i<args.length-2; i++){
			

			double arv1 = 0;
			double arv2 = 0;
			double arv3 = 0;
			
			arv1 = Double.parseDouble(args[i]);
			arv2 = Double.parseDouble(args[i+1]);
			arv3 = Double.parseDouble(args[i+2]);
			
			keskmised = new double[keskmine(arv1, arv2, arv3)];
			
			System.out.println(args[i]);
			
			System.out.println(keskmised + "\n");
			
			
		}
		
/* 		if (args.length == 3) {
			
			try{
				double arv1 = 0;
				double arv2 = 0;
				double arv3 = 0;
				
				arv1 = Double.parseDouble(args[0]);
				arv2 = Double.parseDouble(args[1]);
				arv3 = Double.parseDouble(args[2]);
				
				System.out.println("\n Nende kolme arvu keskmine on " + keskmine(arv1, arv2, arv3) + "\n");
			
			} catch (Exception ex) {
				System.out.println("\n Tundub et v�hemalt �ks sisestatud suurustest polnud arv. Proovi uuesti! \n");
			}
			
		} else {
			
			System.out.println("\n Sisesta programmi v�a kutsudes l�ppu kolm arvu eraldades need t�hikutega \n");
		
		} */
	}
	
}