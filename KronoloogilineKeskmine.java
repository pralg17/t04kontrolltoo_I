public class KronoloogilineKeskmine{
	
	//muutujad
	double[] arvud;
	
	//konstruktor
	public KronoloogilineKeskmine(double[] arvujada){
		arvud = arvujada;
	}
	
	//meetodid
	public double kronoloogilineKesk(){
		double liida = 0;
		for(int i = 0; i < arvud.length; i++){
			if(i== 0 || i == arvud.length -1){
				liida += arvud[i] / 2;
			}else {
				liida += arvud[i];
			}
		}
		double vastus = liida / (arvud.length -1);
		return vastus;
	}
}

