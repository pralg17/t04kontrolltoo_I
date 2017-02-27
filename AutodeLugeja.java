import java.io.*;
public class AutodeLugeja{
  public static void main(String[] args) throws IOException{
    BufferedReader lugeja= new BufferedReader(
    new FileReader("andmed.txt")
    );
    String rida=lugeja.readLine();
    int loendur=0;
    PrintWriter kirjutaja = new PrintWriter(new FileWriter("vastus.txt"));
    while(rida!=null){
      loendur++;
      String[] r=rida.split(" ");
      double a=Double.parseDouble(r[0]);
      double b=Double.parseDouble(r[1]);
      double c=Double.parseDouble(r[2]);
      double d=Double.parseDouble(r[3]);
      double e=Double.parseDouble(r[4]);
      double sekundid = a+(b*c);
      double minutid = a+(b*d);
      double tunnid = a+(b*e);
      kirjutaja.println("Auto on maanteest "+a+" km kaugusel ja kiirus on "+b+" km/h. 3 sekundi pärast on auto "+sekundid+" km, 5 minuti pärast "+minutid+" km, ja 2 tunni pärast "+tunnid+" km kaugusel.");
      rida=lugeja.readLine();
    }
    lugeja.close();
    kirjutaja.close();
  }
}