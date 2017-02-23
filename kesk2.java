public class kesk2{
	public static double kesk2(int m[]){
		int arv = 1;
		int aste = m.length;
		for (int i=0; i<m.length; i++){
			arv = arv*m[i];
		}
		return Math.pow(arv, aste);
	}
	public static void main(String[] args){
		int[] numbrid = {3, 2, 4, 5, 7};
		System.out.println("Vastus on: "+kesk2(numbrid));
	}
}
/*
Vastus on: 4.182119424E14
*/