import java.io.*;

public class geomKeskmine{
	public static double korrutabJaRuutjuur(double a, double b){
		return Math.sqrt(a*b);
	}
	
	public static void main(String[] args) throws IOException{
		/*Esimene punkt*/
		double a = 20;
		double b = 30;
		double vastus = korrutabJaRuutjuur(a, b);
		System.out.println(vastus);
		
		/*Teine punkt*/
		double kogus = 0;
		double tulemus = 0;
		double korrutis = 1;
		for(String arv: args){
			kogus = kogus+1;
			korrutis = korrutis * Integer.parseInt(arv);
		}
		if(kogus>0){
			tulemus = Math.pow(korrutis, (1/kogus));
			System.out.println(kogus);
			System.out.println(korrutis);
			System.out.println("Arvud korrutatuna ja seejarel kogusega juuritud on "+ tulemus);
		} else{
			System.out.println("Te ei sisestanud yhtegi arvu");
		}
		
		/*Kolmas punkt*/
		BufferedReader failist = new BufferedReader(new FileReader("sisend.txt"));
		System.out.println(failist.readLine());
		String rida = failist.readLine();
		String[] m = rida.split(",");
		double esimeneAasta = Double.parseDouble(m[0]) * Double.parseDouble(m[1]);
		double teineAasta = esimeneAasta * Double.parseDouble(m[2]);
		double kolmasAasta = teineAasta * Double.parseDouble(m[3]);
		double neljasAasta = kolmasAasta * Double.parseDouble(m[4]);
		double viiesAasta = neljasAasta * Double.parseDouble(m[5]);
		
		double koefitsendidKorrutis = Double.parseDouble(m[1])*
										Double.parseDouble(m[2])*
										Double.parseDouble(m[3])*
										Double.parseDouble(m[4])*
										Double.parseDouble(m[5]);
		
		double geomKeskmine = Math.pow(koefitsendidKorrutis, 1.0/5);
		
		System.out.println("Koefitsendi korrutis: "+ koefitsendidKorrutis+" Keskmine: "+ geomKeskmine);
		
		double geomEsimeneAasta = Double.parseDouble(m[0]) * geomKeskmine;
		double geomTeineAasta = geomEsimeneAasta * geomKeskmine;
		double geomKolmasAasta = geomTeineAasta * geomKeskmine;
		double geomNeljasAasta = geomKolmasAasta * geomKeskmine;
		double geomViiesAasta = geomNeljasAasta * geomKeskmine;

		
		System.out.println("Algne palk: "+ m[0] +"\n"+ esimeneAasta+"  "+ geomEsimeneAasta +"\n"+
														teineAasta+"  "+ geomTeineAasta +"\n"+ 
														kolmasAasta+"  "+ geomKolmasAasta +"\n"+ 
														neljasAasta+"  "+ geomNeljasAasta +"\n"+
														viiesAasta+"  "+ geomViiesAasta);
	}
}