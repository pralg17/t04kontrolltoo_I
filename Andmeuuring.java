import java.io.*;
import java.net.*;
public class andmed{
     public static void main(String[] args)throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("andmed.txt"));
 		String st=br.readLine();
         while(st!= null){
 			String[] m=st.split(",");
         }
 	br.close();
     }
 }

 /*   Õppuri läbitud kursuste nimed, hinded (A-F) ja punktid loetakse sisse failist.
 Tulemus kaalutud keskmise näol kirjutatakse teise faili
 */
