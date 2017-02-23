public class esimene_ja_teine_main{

	public static void main (String[] args){
		
		esimene_ja_teine yl2 = new esimene_ja_teine(35, 53, 42);
		System.out.println("Esimese ülesande vastus: " + esimese_arvutus(35, 53));
		System.out.println("Teise ülesande vastus: " + yl2.ruutjuur());



	}


	public static double esimese_arvutus(int arv1, int arv2){
		
		return Math.sqrt(arv1*arv2);
		
	}

}

/*


[gregness@greeny t04kontrolltoo_I]$ java esimene_ja_teine_main
Esimese ülesande vastus: 43.069710934716056
Teise ülesande vastus: 42.71014718980152


*/