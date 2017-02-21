public class ylesanne2{
		public static String korruta(int[]m){
 		int arv=1;
 		double astmes = m.length;
 		for (int s=0; s<m.length;){
 			arv =arv*m[s];
 			s++;
 		}
 		return "Vastus:" + Math.pow(arv, 1.0/astmes);
 	}
 	
 	public static void main(String[] args){
 		int[] arvud={2, 1, 5, 2, 1, 4, 2};
 		System.out.println(korruta(arvud));
 	}
 } 

/*Vastus:2.064782369420003*/