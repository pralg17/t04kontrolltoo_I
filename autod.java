public class autod{
  double a, b, c, d, e;

  public autod(double kaugus, double kiirus, double kaugus1, double kaugus2, double kaugus3){
    a = kaugus;
    b = kiirus;
	c = kaugus1;
	d = kaugus2;
	e = kaugus3;
  }
  
  public double kaugus1(){
    return a+(b*c);
  }

  public double kaugus2(){
    return a+(b*d);
  }

  public double kaugus3(){
    return a+(b*e);
  }
  
  public String toString(){
    return "Auto kaugus maantee algusest on "+a+" km ja kiirus on "+b+" km/h. Auto asukoht 3 sekundi pärast: "+kaugus1()+" km, 5 minuti pärast: "+kaugus2()+" km, ja 2 tunni pärast: "+kaugus3()+" km.";
  }
}