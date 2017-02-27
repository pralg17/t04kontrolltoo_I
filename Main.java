import java.io.*;
import java.util.*;
import java.util.Random;
public class Main{
	
	public static void main(String[] args){
		List<Integer> x = new ArrayList<Integer>();
		List<Integer> y = new ArrayList<Integer>();
		Random rand = new Random();
		for(int i=0; i<6; i++){
			x.add(rand.nextInt(10));
		}
		for(int i=0; i<6; i++){
			y.add(rand.nextInt(10));			
		}
		Hulknurk h1 = new Hulknurk(x, y);
		System.out.println(h1);
		System.out.println(h1.Vordkylgne(Integer.parseInt(args[0])));
	}
	
}


/* Console output

[richkaja@greeny t04kontrolltoo_I]$ java Main 50
x1: 0, y1: 4
x2: 7, y2: 9
x3: 8, y3: 2
x4: 1, y4: 0
x5: 4, y5: 4
x6: 9, y6: 4

Kyljed:
8.6
7.1
7.3
5.0
5.0
9.0

Kaugused:
4.0
11.4
8.2
1.0
5.7
9.8

Veaprotsent 50.0%

Vahemik:
2.0  6.0
Ei asu samal kaugusel!

Vahemik:
4.3  12.899999999999999
4.3  12.899999999999999
4.3  12.899999999999999
4.3  12.899999999999999
4.3  12.899999999999999
On vordkylgne!


*/