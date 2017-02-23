public class teine{
	public static String korrutis (int []m){
		int arv = 1;
		double aste = m.length;
		for (int i=0; i<m.length; i++){
			arv = arv*m[i];
		}
		return "Korrutis on " + arv + " Pöörduväärtus astendaja on " + aste + " Vastus on " + Math.pow(arv, 1.0/aste);
	}
	public static void main(String[] args){
		int[] arvud={12, 6, 1, 2};
		System.out.println(korrutis(arvud));
	}
}

/*
Esimene ülesande vastus: 
Teise ülesande vastus: 
*/