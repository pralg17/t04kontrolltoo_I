
import java.io.*;
import java.net.*;
public class Andmeuuring{
	String asukoht;
	public Andmeuuring(String asukoht){
		this.asukoht=asukoht;
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
	//oletame, et need hinded ja punktid on kõrvuti.

	public double keskmine(int tulbanr) throws IOException{
		BufferedReader lugeja=kysiLugeja();
		boolean alustatud=false;
		String rida=lugeja.readLine(); //pealkirjarida
		rida=lugeja.readLine();

		int[] eapd;
		int[] hinded;
		while(rida!=null){
			String[] m=rida.split(",");
			 try{
			  int hinne=int.parseInt(m[tulbanr]);
			  int eapd=int.parseInt(m[tulbanr+1]);
			  if(alustatud){
				   int[] hinded=new int[sisestused];
        			Scanner sc=new Scanner(System.in);
       				for(int j=0;j<sisestused;j++)
           				hinded[j]=sc.nextInt();
			  } else {
				  maxtemp=temperatuur;
				  alustatud=true;
			  }
			 } catch(Exception veaandmed){
				 puuduvaid++;
			 }
			 rida=lugeja.readLine();
		}
		if(puuduvaid>0){System.err.println("Puuudu "+puuduvaid);}
		lugeja.close();
		return maxtemp;
	}
	
}