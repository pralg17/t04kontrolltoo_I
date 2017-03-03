public class Autod{
  double s1, s2;
  double v1, v2;
  public Autod(double kaugus1, double kiirus1, double kaugus2, double kiirus2){
    s1=kaugus1;
    s2=kaugus2;
    v1=kiirus1;
    v2=kiirus2;
  }

  public String threeSeconds(){
    return "Auto1 kaugus algpunktist 3s p2rast on "+
    (((((v1*1000)/3600)*3)/1000)+s1)+
    "\nAuto2 kaugus algpunktist 3s p2rast on "+
    (((((v2*1000)/3600)*3)/1000)+s2)+"\n";
  }

  public String fiveMinutes(){
    return "Auto1 kaugus algpunktis 5min p2rast on "+
    (((((v1*1000)/60)*5)/1000)+s1)+
    "\nAuto2 kaugus algpunktist 5min p2rast on "+
    (((((v2*1000)/60)*5)/1000)+s2)+"\n";

  }

  public String twoHours(){
    return "Auto1 kaugus algpunktist 2h p2rast on "+((v1*2)+s1)+
    "\nAuto2 kaugus algpunktist 2h p2rast on "+((v2*2)+s2)+"\n";
    }

  public String toString(){
    return "Auto1 kaugus mnt algusest on "+s1+"km"+
    " ja liigub kiirusega "+v1+"km/h"+
    "\nAuto2 kaugus mnt algusest on "+s2+"km"+
    " ja liigub kiirusega "+v2+"km/h";


  }
}
