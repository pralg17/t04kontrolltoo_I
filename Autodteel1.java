// Autod teel ulesanne 1

public class Autodteel1{
	double k, v;
	
	public Autodteel1(double kaugus, double kiirus){
		k = kaugus;
		v = kiirus;
	}
	
	public String toString(){
		return("Auto kaugus maantee algusest on "+k+" km"+" ning auto liikumiskiirus on "+v+" km/h");
	}
}