public class Autod{
  double a, b, c, d, e;

  public Autod(double kaugus, double kiirus, double sekundid, double minutid, double tunnid){
    a = kaugus;
    b = kiirus;
    c = sekundid;
    d = minutid;
    e = tunnid;
  }

  public double sekundid(){
    return b*c;
  }

  public double minutid(){
    return b*d;
  }

  public double tunnid(){
    return b*e;
  }

  public String toString(){
    return "Auto kaugus maantee algusest on "+a+" km ja kiirus on "+b+" km/h. Auto asukoht 3 sekundi pärast on "+sekundid()+" km, 5 minuti pärast "+minutid()+" km, ja 2 tunni pärast "+tunnid()+" km.";
  }

}
