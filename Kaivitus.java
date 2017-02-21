public class Kaivitus{
	public static void main(String[] args){
        Kolmnurk kolmnurk1=new Kolmnurk(50, 60, true);
        Kolmnurk kolmnurk2=new Kolmnurk(100, 90, false);
		System.out.println(kolmnurk1.toString());
		System.out.println(kolmnurk1.kasOnVordkylgne());
		System.out.println(kolmnurk2.toString());
		System.out.println(kolmnurk2.kasOnVordkylgne());
	}
}

/*

Programmi töökäik:

> javac Kaivitus.java Kolmnurk.java
> java Kaivitus

Kolmnurga x koordinaat on 50 ja y koordinaat 60
Tegemist on võrdkülgse kolmnurgaga
Kolmnurga x koordinaat on 100 ja y koordinaat 90
Tegemist ei ole võrdkülgse kolmnurgaga

*/
