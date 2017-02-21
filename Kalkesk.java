import java.util.Scanner;

public class Kalkesk{
	public static void main(String[] args){
		int a1;
		int a2;
		int b1;
		int b2;
		Scanner in = new Scanner(System.in);
 
		System.out.println("Sisesta esimese aine punktide arv: ");
		a1 = in.nextInt();
		System.out.println("Sisesta esimese aine hinde number(0-5): ");
		a2 = in.nextInt();
		System.out.println("Sisesta teise aine punktide arv: ");
		b1 = in.nextInt();
		System.out.println("Sisesta teise aine hinde number(0-5): ");
		b2 = in.nextInt();
		Arvutus laud1=new Arvutus(a1, a2, b1, b2);
		System.out.println(laud1.toString());
		System.out.println(laud1.kaalutudkeskmine());
	}
}