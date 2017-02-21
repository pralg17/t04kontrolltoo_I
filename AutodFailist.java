import java.io.*;
public class AutodFailist{
  public static void main(String[] args) throws IOException{
    BufferedReader lugeja= new BufferedReader(
    new FileReader("andmed.txt")
    );
    String rida=lugeja.readLine();
    int loendur=0;
    PrintWriter kirjutaja = new PrintWriter(new FileWriter("vastus.txt"));
    while(rida!=null){
      loendur++;
      String[] r=rida.split(",");
      double a1=Double.parseDouble(r[0]);
      double a2=Double.parseDouble(r[1]);
      double a3=Double.parseDouble(r[2]);
      double a4=Double.parseDouble(r[3]);
      double a5=Double.parseDouble(r[4]);
      double sekundid = a1+(a2*a3);
      double minutid = a1+(a2*a4);
      double tunnid = a1+(a2*a5);
      kirjutaja.println("Auto kaugus maantee algusest on "+a1+" km ja kiirus on "+a2+" km/h. Auto asukoht 3 sekundi pärast on "+sekundid+" km, 5 minuti pärast "+minutid+" km, ja 2 tunni pärast "+tunnid+" km.");
      rida=lugeja.readLine();
    }
    lugeja.close();
    kirjutaja.close();
  }
}
