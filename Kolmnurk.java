public class Kolmnurk{
	int a, b;
    boolean kyljedvordsed;
	public Kolmnurk(int xKoord, int yKoord, boolean vordKylgne){
		a=xKoord;
		b=yKoord;
        kyljedvordsed=vordKylgne;
	}

    public String kasOnVordkylgne(){
		        if (kyljedvordsed){
            return "Tegemist on võrdkülgse kolmnurgaga";
        }

        return "Tegemist ei ole võrdkülgse kolmnurgaga";
    }

	public String toString(){
		return "Kolmnurga x koordinaat on "+a+" ja y koordinaat "+b;
	}
}
