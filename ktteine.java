import java.util.Scanner;
import java.util.Arrays;
public class ktteine{
	public static int[] arvuta(int[] arvud){
		int[] massiiv = new int[arvud.length-2];
		int keskmine=0;
		for(int i=0; i<(arvud.length-2); i++){
		keskmine=(arvud[i]+arvud[i+1]+arvud[i+2])/3;
		massiiv[i] = keskmine;
		}
		return massiiv;
	}
		
public static void main(String[] args){
		int[] arvud={1, 2, 3, 4, 5};
		int[] vastus = arvuta(arvud);
  		System.out.println(Arrays.toString(vastus));
	}
}
