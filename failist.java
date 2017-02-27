import java.io.*;
  public class failist{
   public static void main(String[] args) throws IOException{
     BufferedReader andmed= new BufferedReader(
     new FileReader("sisend.txt")
   );
  String rida=andmed.readLine();
  PrintWriter printer = new PrintWriter(new FileWriter("tulemus.txt"));
  while(rida!=null){
     String[] r=rida.split(",");
      double a= Double.parseDouble(r[0]);
      double v1= Double.parseDouble(r[1]);
      double b= Double.parseDouble(r[2]);
      double v2= Double.parseDouble(r[3]);
      double sekundid = (v1*((((a/v1)*60)+0.01666)/60));
      double sekundid2 = (v2*((((b/v2)*60)+0.01666)/60));
      double minutid = (v1*((((a/v1)*60)+5)/60));
      double minutid2 = (v2*((((b/v2)*60)+5)/60));
      double tunnid = (v1*((((a/v1)*60)+120)/60));
      double tunnid2 = (v2*((((b/v2)*60)+120)/60));
       printer.println("Auto kaugus maantee algusest on "+a+" km ja kiirus on "+v1+" km/h.\n Auto asukoht 3 sekundi pärast on "+
        sekundid+" km,\n 5 minuti pärast "+minutid+" km,\n ja 2 tunni pärast "+tunnid+" km.\n\n"+
        "Auto kaugus maantee algusest on "+b+" km ja kiirus on "+v2+" km/h.\n Auto asukoht 3 sekundi pärast on "+
         sekundid2+" km,\n 5 minuti pärast "+minutid2+" km,\n ja 2 tunni pärast "+tunnid2+" km.\n");
        rida=andmed.readLine();
     }
     andmed.close();
     printer.close();
   }
 }
 //
 // Auto kaugus maantee algusest on 3.0 km ja kiirus on 3.0 km/h.
 //  Auto asukoht 3 sekundi pärast on 3.000833 km,
 //  5 minuti pärast 3.25 km,
 //  ja 2 tunni pärast 9.0 km.
 //
 // Auto kaugus maantee algusest on 15.0 km ja kiirus on 100.0 km/h.
 //  Auto asukoht 3 sekundi pärast on 15.027766666666666 km,
 //  5 minuti pärast 23.333333333333332 km,
 //  ja 2 tunni pärast 215.0 km.
 //
 // Auto kaugus maantee algusest on 50.0 km ja kiirus on 95.0 km/h.
 //  Auto asukoht 3 sekundi pärast on 50.026378333333334 km,
 //  5 minuti pärast 57.916666666666664 km,
 //  ja 2 tunni pärast 240.0 km.
 //
 // Auto kaugus maantee algusest on 30.0 km ja kiirus on 99.0 km/h.
 //  Auto asukoht 3 sekundi pärast on 30.027489000000006 km,
 //  5 minuti pärast 38.25000000000001 km,
 //  ja 2 tunni pärast 228.00000000000003 km.
