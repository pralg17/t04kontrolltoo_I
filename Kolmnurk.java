
// 1. Kolmnurga X ja Y koordinaatide kuvamine. Kaks massiivi 

public class Kolmnurk{		
   public static void main(String[] args) { // 
		int[] Xkoordinaadid = {13, 8, -45, 0};
		int[] Ykoordinaadid = {6, -3, 76, 7};
		int[] Xkoordinaadid2 = {3, 17, -12, 4};
		int[] Ykoordinaadid2 = {5, -98, 71, 16};
		
		System.out.println("X-koordinaadid:");
		PrintKoordinaadid(Xkoordinaadid);
		System.out.println("Y-koordinaadid:");
		PrintKoordinaadid(Ykoordinaadid);
		
		System.out.println("X2-koordinaadid:");
		PrintKoordinaadid(Xkoordinaadid2);
		System.out.println("Y2-koordinaadid:");
		PrintKoordinaadid(Ykoordinaadid2);
		
		
	}	
		
	public static void PrintKoordinaadid(int[] number) { //tsykkel muuutjate v2ljatrykkimiseks
		for (int n = 0; n < number.length; n++) {
			System.out.print(number[n]);
			System.out.print(",");
		}
		
	}
	// 2. Kolmnurga v6rdkylgsuse kontroll
/*	
	
*/	
}
	





