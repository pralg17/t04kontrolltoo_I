public class teine{
	public static String korrutis (int []m){
		int arv = 1;
		double aste = m.length;
		for (int i=0; i<m.length; i++){
			arv = arv*m[i];
		}
		return "Korrutis on " + arv + " Astendaja pöördväärtus on " + aste + " Vastus on " + Math.pow(arv, 1.0/aste);
	}
	public static void main(String[] args){
		int[] arvud={5, 5, 4, 2};
		System.out.println(korrutis(arvud));
	}
}

/*
Esimene ülesande vastus: 
Sisesta esimene arv: 2
Sisesta teine arv: 8
Arvude ruutjuur on 4.0

Teise ülesande vastus: 
Korrutis on 200 Astendaja pöördväärtus on 4.0 Vastus on 3.7606030930863934
*/