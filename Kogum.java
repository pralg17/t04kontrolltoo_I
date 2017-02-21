import java.util.Scanner;

public class Kogum{
	public static double kesk(int[] h, int[] a){
		double summa=0;
		double kkesk=0;
		for(int i=0;i<a.length;i++)
            summa = summa+h[i]*a[i]; /*ainep * hinded saan nende kogusumma*/
		double sum = 0;
        for(int i : a) { /*saan ainepunktide summa*/		
         sum += i;
        }  
        kkesk = summa/sum; 
        return kkesk;
    }
/*Kasutaja sisestab andmed*/
	public static void main(String[] args){
        int sisestused;
        double kkeskKokku;
        Scanner in = new Scanner(System.in);
        System.out.println("Mitu hinnet sisestad?"); /*Kui suur massiiv tuleb*/
        sisestused = in.nextInt();
        System.out.println("Sisesta hinded numbritega 0-5: "); 
        int[] hinded=new int[sisestused];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<sisestused;i++)
            hinded[i]=sc.nextInt();
        System.out.println("Sisesta ainepunktid");
        int[] ainep=new int[sisestused];
        for(int i=0;i<sisestused;i++)
            ainep[i]=sc.nextInt();
        kkeskKokku = kesk(hinded, ainep);
        System.out.println("Keskmine on "+kkeskKokku);
        }
          
 }

		
		
/*Lihtsam variant:
public class Kogum{
	public static void main(String[] args){
		int[] ainep={4, 6, 6, 3};
		int[] hin={5, 3, 4, 2};
		
		int summa=0;
		for(int i=0; i<ainep.length; i++){
			summa=ainep[i]+summa;
		}
		System.out.println("Ainepunktide summa: "+summa);
		
		int summa2=0;
		for(int i=0; i<hin.length; i++){
			summa2=hin[i]*ainep[i]+summa2;
		}
		System.out.println("Hinne * ainepunktide summa: "+summa2);
		System.out.println("Kaalutud keskmine on: "+summa2/summa);
	
	}
} */


/* valem: hin*ainep/ainep summa= kaalutud keskm */

