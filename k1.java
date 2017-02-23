import java.io.*;
import java.util.*;
public class k1 {
	static double k1(double aine1, double aine2) {
		return (aine1+aine2)/2;
}	
	static double hinned(int hinne1, int hinne2){
		return (hinne1+hinne2)/2;
	}
	
	public static void main (String[] args) {
		System.out.println("Keskmine ainepunkt on: " + k1(70,54));
		System.out.println("Keskmine hinne on: " + hinned(3,2));
  }
}

/* [edgaseli@greeny t04kontrolltoo_I]$ java k1
Keskmine ainepunkt on: 62.0
Keskmine hinne on: 2.0
*/
