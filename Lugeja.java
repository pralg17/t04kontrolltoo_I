import java.io.*;
import java.net.*;
public class Lugeja{
    String asukoht;
    public Lugeja(String asukoht){
        this.asukoht = asukoht;
    }
    BufferedReader kysiLugeja(){
        try{return new BufferedReader(new FileReader(asukoht));
            } catch (Exception ex) {
                return null;
            }
    }
    public String Keskminekokkuss()throws IOException{
       BufferedReader lugeja = kysiLugeja();
       String rida = lugeja.readLine();
       lugeja.close();
       return rida; 
    }
}    
