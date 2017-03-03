public class Autod{
  double s1, s2;
  double v1, v2;

  public Autod(double kaugus1, double kiirus1, double kaugus2, double kiirus2){
    s1=kaugus1;
    s2=kaugus2;
    v1=kiirus1;
    v2=kiirus2;
  }
  public String toString(){
    return "Auto1 kaugus mnt algusest on "+s1+"km"+
    " ja liigub kiirusega "+v1+"km/h"+
    "\nAuto2 kaugus mnt algusest on "+s2+"km"+
    " ja liigub kiirusega "+v2+"km/h\n";
  }
}
