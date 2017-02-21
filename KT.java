public class KT{
	double a, b, c, d;
	public kaalutudkeskmine(double hinne1, double hinne2, double aine1, double aine2){
		if(hinne1<=0){throw new RuntimeException("Sobimatu hinne");}
		if(hinne2<=0){throw new RuntimeException("Sobimatu hinne");}
		if(aine1<=0){throw new RuntimeException("Sobimatu ainepunktide arv");}
		if(aine2<=0){throw new RuntimeException("Sobimatu ainepunktide arv");}
		a=hinne1;
		b=hinne2;
		c=aine1;
		d=aine2;
		
	}	
	public double keskminek(){
		return (a*c + b*d)/c+d;
	}

	public String toString(){
		return "Kaalutud keskmine on "+keskminek()+" ainepunkti.";
	}
}