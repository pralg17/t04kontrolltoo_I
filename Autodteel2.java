// Autod teel ulesanne 2

public class Autodteel2{
	double k, v, s, m, t;
	
	public Autodteel2(double kaugus, double kiirus, double sekund, double minut, double tund ){
		
		k = kaugus;
		v = kiirus;
		s = sekund;
		m = minut;
		t = tund;
	}
	
	public double sekund(){
		
		return v*s;
		
	}
	
	public double minut(){
		
		return v*m;
		
	}
	
	public double tund(){
		
		return v*t;
	}
	
	
	
	public String toString(){
	
		
		return("Auto kaugus maantee algusest on "+k+"km ning auto liikumiskiirus on "+v+"km/h. Auto kaugus maantee algusest 3 sekundi parast on "+ (k+sekund())+" km, 5 minuti parast "+(k+minut())+" km , 2 tunni parast "+(k+tund())+" km");
	}
}