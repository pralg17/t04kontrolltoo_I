import java.util.*;
public class Kronoloogiline1ja2{
	
	public static double kronKesk(double x, double y, double z){
		return (x/2 + y + z/2) / 2.0;
	}
	
	public static void main(String[] args){
		// 1.osa t66st
		double arv1 = 8;
		double arv2 = 5;
		double arv3 = 10;
		double vastus = kronKesk(arv1, arv2, arv3);
		System.out.println("Arvude: " + arv1 + ", " + arv2 + ", " + arv3 + " kronoloogiline keskmine on: " + vastus);
		
		// 2.osa t66st
		double[] arvud1 = {5, 7, 9, 10, 12, 2};
		KronoloogilineKeskmine jada1 = new KronoloogilineKeskmine(arvud1);
		System.out.println("Arvude " + Arrays.toString(arvud1) + " kronoloogiline keskmine on " + jada1.kronoloogilineKesk());
	}
}
/*
Arvude: 8.0, 5.0, 10.0 kronoloogiline keskmine on: 7.0
Arvude [5.0, 7.0, 9.0, 10.0, 12.0, 2.0] kronoloogiline keskmine on 8.3
[karinrik@greeny t04kontrolltoo_I]$

*/


