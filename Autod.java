public class Autod{
  double a, b, aeg;
  double uusasukoht3sek, uusasukoht3sek2, uusasukoht5min, uusasukoht5min2;
  double uusasukoht2h, uusasukoht2h2;
  int v1, v2;
  public Autod(double kaug1, int kiirus1, double kaug2, int kiirus2){
    if(kiirus1==0){throw new RuntimeException("Auto seisab!");}
    if(kiirus2==0){throw new RuntimeException("Auto seisab!");}
    a=kaug1;
    b=kaug2;
    v1=kiirus1;
    v2=kiirus2;
  }
  public String Sek(){
    return "auto kaugus maantee algusest 3sek parast on: "+(v1*((((a/v1)*60)+0.01666)/60))+"km"+
    "\nauto kaugus maantee algusest 3sek parast on: "+(v2*((((b/v2)*60)+0.01666)/60))+"km";
  }
  public String Min(){
    return "auto kaugus maantee algusest 5min parast on: "+(v1*((((a/v1)*60)+5)/60))+"km"+
    "\nauto kaugus maantee algusest 5min parast on: "+(v2*((((b/v2)*60)+5)/60))+"km";
  }
  public String Tund(){
    return "auto kaugus maantee algusest 2h parast on: "+(v1*((((a/v1)*60)+120)/60))+"km"+
    "\nauto kaugus maantee algusest 2h parast on: "+(v2*((((b/v2)*60)+120)/60))+"km";
  }


  public String toString(){
		return "auto liikumiskiirus on: "+(v1)+"km/h"+
    " ja ta kaugus maantee algusest on: "+a+"km"+
		"\nauto liikumiskiirus on: "+(v2)+"km/h"+
    " ja ta kaugus maantee algsest on: "+b+"km\n\n";
	}
}
