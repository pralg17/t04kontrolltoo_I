public class YL2{
	public static double korrutis(int[] m){
		int arv = 1;
		int aste = m.length;
		for(int i=0; i<m.length; i++){
			arv = arv*m[i];
		}
		return Math.pow(arv, 1.0/aste);
	}
		
	public static void main(String[] args){
		int[] arvud={1, 5, 2, 7, 3};
		System.out.println("Vastus: "+korrutis(arvud));
	}
}
/*
[johareil@greeny t04kontrolltoo_I]$ java YL2
Vastus: 2.9136934585761924
*/