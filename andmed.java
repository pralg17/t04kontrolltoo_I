import java.io.*;
import java.util.Arrays;
public class andmed{

	public static void main(String[] args){
		double andmed1 = vastus(11, 20, 13);
		double andmed2 = vastus(2, 4, 6);
		double [] massiiv1 = {1,2,3,4,5,6,7,8,9,10};
		double[] array = uusmassiiv(massiiv1);

		System.out.println(andmed1);
		System.out.println(andmed2);
		System.out.println(Arrays.toString(array));	
	}
	
	public static double vastus(double a, double b, double c){
		return Math.round(((a+b+c)/3)*100.0)/100.0;
	}
	public static double[] uusmassiiv(double[] massiiv1){
		double[] uuemmassiiv = new double[8];
		for(int i = 0; i < massiiv1.length-2; i++) {
			double arv = (massiiv1[i] + massiiv1[i+1] + massiiv1[i+2]) / 3;
			uuemmassiiv[i] = arv;
		}
		return uuemmassiiv;	
	}
}