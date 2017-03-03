import java.io.*;
  public class fromFile{
   public static void main(String[] args) throws IOException{
     BufferedReader carData= new BufferedReader(
     new FileReader("carInfo.txt")
   );

   String row = carData.readLine();
   PrintWriter printResults = new PrintWriter(new FileWriter("carResults.txt"));
   while(row!=null){
     String[] r=row.split(",");
     double s1 = Double.parseDouble(r[0]);
     double v1 = Double.parseDouble(r[1]);
     double s2 = Double.parseDouble(r[2]);
     double v2 = Double.parseDouble(r[3]);
     double threeSeconds1 = (((((v1*1000)/3600)*3)/1000)+s1);
     double threeSeconds2 = (((((v2*1000)/3600)*3)/1000)+s2);
     double fiveMinutes1 = (((((v1*1000)/60)*5)/1000)+s1);
     double fiveMinutes2 = (((((v2*1000)/60)*5)/1000)+s2);
     double twoHours1 = ((v1*2)+s1);
     double twoHours2 = ((v2*2)+s2);
      printResults.println("Auto1 kaugus mnt algusest on "+s1+" km ja kiirus on "+v1+" km/h.\n Tema asukoht 3 sekundi pärast on "+
      threeSeconds1+" km,\n 5 minuti pärast "+fiveMinutes1+" km,\n ja 2 tunni pärast "+twoHours1+" km.\n\n"+
      "Auto2 kaugus mnt algusest on "+s2+" km ja kiirus on "+v2+" km/h.\n Tema asukoht 3 sekundi pärast on "+
      threeSeconds2+" km,\n 5 minuti pärast "+fiveMinutes2+" km,\n ja 2 tunni pärast "+twoHours2+" km.\n\n");
      row=carData.readLine();
   }
   carData.close();
   printResults.close();
 }
}
