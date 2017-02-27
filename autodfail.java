import java.io.*;
public class autodfail{
  public static void main(String[] args) throws IOException{
    BufferedReader lugeja= new BufferedReader(
    new FileReader("kysiandmed.txt")
    );
    String rida=lugeja.readLine();
    int loendur=0;
    PrintWriter kirjutaja = new PrintWriter(new FileWriter("vastused.txt"));
    while(rida!=null){
      loendur++;
      String[] r=rida.split(",");
      double a=Double.parseDouble(r[0]);
      double b=Double.parseDouble(r[1]);
      double c=Double.parseDouble(r[2]);
      double d=Double.parseDouble(r[3]);
      double e=Double.parseDouble(r[4]);
      double kaugus1 = a+(b*c);
      double kaugus2 = a+(b*d);
      double kaugus3 = a+(b*e);
      kirjutaja.println("Auto kaugus maantee algusest on "+a+" km ja kiirus on "+b+" km/h. Auto asukoht 3 sekundi pärast: "+kaugus1+" km, 5 minuti pärast: "+kaugus2+" km, ja 2 tunni pärast: "+kaugus3+" km.");
      rida=lugeja.readLine();
    }
    lugeja.close();
    kirjutaja.close();
  }
}