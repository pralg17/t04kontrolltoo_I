
public class Arvutus{
	int a1, a2, b1, b2;
	public Arvutus(int eap1, int hinne1, int eap2, int hinne2){
	if(eap1<=0){throw new RuntimeException("sobimatu ainepunktide arv");}
	if(eap2<=0){throw new RuntimeException("sobimatu ainepunktide arv");}
		a1=eap1;
		a2=hinne1;
		b1=eap2;
		b2=hinne2;
		
	}
	public double eaparv(){
		return a1+b1;
	}
	public double kaalutudkeskmine(){
		return (a2*a1+b2*b1)/eaparv();
	}

}
