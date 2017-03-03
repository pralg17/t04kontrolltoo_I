public class Main{
	public static void main(String[] args){
		
		//Tekitan 2 uut kolmnurka
		Kolmnurk kolmnurk1 = new Kolmnurk();
		Kolmnurk kolmnurk2 = new Kolmnurk();
		
		//Esimese kolmnurga kordinaadid
		kolmnurk1.x = 1;
		kolmnurk1.y = 3;
		
		//Teise kolmnurga kordinaadid
		kolmnurk2.x = 9;
		kolmnurk2.y = 5;
		
		System.out.println("Esimese kolmnurga x-kordinaat on: " + kolmnurk1.x);
		System.out.println("Esimese kolmnurga y-kordinaat on: " + kolmnurk1.y);
		System.out.println("Teise kolmnurga x-kordinaat on: " + kolmnurk2.x);
		System.out.println("Teise kolmnurga y-kordinaat on: " + kolmnurk2.y);
	}
}