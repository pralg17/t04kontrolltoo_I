public class ylesanne2{
		public static String korruta(int[]m){
 		int arv=1;
 		double aste = m.length;
 		for (int s=0; s<m.length;){
 			arv =arv*m[s];
 			s++;
 		}
 		return "Vastus:" + Math.pow(arv, 1.0/aste);
 	}
 	
 	public static void main(String[] args){
 		int[] arvud={2, 1, 5, 2, 1, 4, 2};
 		System.out.println(korruta(arvud));
 	}
 } 

