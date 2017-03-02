public class kesk2{
	public static double kesk2(int m[]){
		int arv = 1;
		int aste = m.length;
		for (int i=0; i<m.length; i++){
			arv = arv*m[i];
		}
		return Math.pow(arv, 1.0/aste);
	}
	public static void main(String[] args){
		int[] numbrid = {3, 2, 4, 5, 7};
		System.out.println("Vastus on: "+kesk2(numbrid));
	}
}
/*
Vastus on: 3.84464156815852
*/