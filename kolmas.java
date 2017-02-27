import java.io.*;
import java.net.*;
import java.util.*;

public class kolmas{
	String asukoht;
	public static List<Double> uued_palgad = new ArrayList<Double>();
	public static List<Double> uued_palgad_yhtlane = new ArrayList<Double>();
	//uued_palgad = new ArrayList<Double>();

	public kolmas(String asukoht){
		this.asukoht=asukoht;
		this.uued_palgad=uued_palgad;
		this.uued_palgad_yhtlane=uued_palgad_yhtlane;
	}

	BufferedReader kysiLugeja(){
	  try{
		if(asukoht.startsWith("http://")){
			return new BufferedReader(new InputStreamReader(
			   new URL(asukoht).openConnection().getInputStream()));
		}
		else {
			return new BufferedReader(new FileReader(asukoht));
		}
	  } catch(Exception ex){		  
		  return null;
	  }
	}





	public List maksimum(int tulbanr) throws IOException{
		BufferedReader lugeja=kysiLugeja();
		String rida=lugeja.readLine(); 
		rida=lugeja.readLine();
		double palk=0;
		double abipalk=0;
		

		
		while(rida!=null){
			String[] m=rida.split(" ");
			try{

			  	double koefitsent = Double.parseDouble(m[tulbanr]);

				if(koefitsent>100){
				  	

					palk = koefitsent;
					uued_palgad.add(koefitsent);
					abipalk = koefitsent;

				} else if(koefitsent<0){

					uued_palgad.add(abipalk-(abipalk*Math.abs(koefitsent)));
					abipalk = abipalk-(abipalk*Math.abs(koefitsent));

					
				} else if(koefitsent>0){

					uued_palgad.add(abipalk+(abipalk*Math.abs(koefitsent)));
					abipalk = abipalk+(abipalk*Math.abs(koefitsent));

				}

			} catch(Exception e){
				e.printStackTrace();
			 }
			 rida=lugeja.readLine();
		


		}

		lugeja.close();
		return uued_palgad;
	}

	
	
	
	public static List yhtlane(){
		
		double esimene = uued_palgad.get(0);
		
		int pikkus = uued_palgad.size();		
		double viimane = uued_palgad.get(pikkus-1);		
		double kasv = (viimane - esimene)/(pikkus-1) ;
		System.out.println(viimane);
		System.out.println(esimene);
		System.out.println(kasv);
		System.out.println("pikkus: " + pikkus);
		double yhtlane_palk = 1000.0;
		uued_palgad_yhtlane.add(esimene);
		
		//PrintWriter kirjutaja = new PrintWriter (new FileWriter("palgad.txt"));
		for(int i=0; i<pikkus-1; i++){
			
			yhtlane_palk = yhtlane_palk+kasv;		
			uued_palgad_yhtlane.add(yhtlane_palk);
			System.out.println(yhtlane_palk);
			System.out.println(viimane);
		}
		//kirjutaja.close();
		
		return uued_palgad_yhtlane;
	}
	

}




