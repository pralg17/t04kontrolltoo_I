public class autod{
  double a, b;

  public autod(double kaugus, double kiirus){
    a = kaugus;
    b = kiirus;
  }
  public String toString(){
    return "Auto kaugus punktist on "+a+" km ja kiirus on "+b+" km/h.";
  }
}