import java.io.*;
import java.util.*;
import java.util.Random;
public class Main{
	
	public static void main(String[] args){
		List<Integer> x = new ArrayList<Integer>();
		List<Integer> y = new ArrayList<Integer>();
		Random rand = new Random();
		for(int i=0; i<3; i++){
			x.add(rand.nextInt(10));
		}
		for(int i=0; i<3; i++){
			y.add(rand.nextInt(10));			
		}
		Hulknurk h1 = new Hulknurk(x, y);
		System.out.println(h1);
		System.out.println(h1.Vordkylgne(Integer.parseInt(args[0])));
	}
	
}


/* Console output

[richkaja@greeny kt]$ java Main 50
x1: 5, y1: 4
x2: 1, y2: 7
x3: 7, y3: 8

Veaprotsent 50%
Kyljed5.0
Kyljed6.1
Kyljed4.5
Kaugused6.4
Kaugused7.1
Kaugused10.6
3.2  9.600000000000001
3.2  9.600000000000001
Ei asu samal kaugusel!
2.5  7.5
2.5  7.5
On vordkylgne!


*/