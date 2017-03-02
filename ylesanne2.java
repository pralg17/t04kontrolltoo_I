public class ylesanne2{
	public static double korrutis(int[] m){
		int arv = 1;
		int aste = m.length;
		for(int i=0; i<m.length; i++){
			arv = arv*m[i];
		}
		
		return Math.pow(arv, 1.0/aste);
	}
		
	public static void main(String[] args){
		int[] arvud={3, 3, 7, 4, 5};
		System.out.println("Vastus: "+korrutis(arvud));
	}
}

/*
[joosjuha@greeny t04kontrolltoo_I]$ java ylesanne2
Vastus: 4.169405251041168
*/