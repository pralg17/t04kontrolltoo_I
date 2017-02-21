public class KT2{
	public static String korrutis (int[] m){
		int arv = 1;
		double aste = m.length;
		for(int i=0; i<m.length; i++){
			arv = arv*m[i];
		}
		return "Arvude korrutis on "+ arv + " Astendaja poordvaartus on " + aste + " Vastus on " + Math.pow(arv, 1.0/aste);
	}
	
	
	public static void main(String[] args){
		int[] arvud={1, 2, 2, 3};
		System.out.println(korrutis(arvud));
	}
}
/*
[annagubs@greeny t04kontrolltoo_I]$ java KT2
Arvude korrutis on 12 Astendaja poordvaartus on 4.0 Vastus on 1.8612097182041991 
*/