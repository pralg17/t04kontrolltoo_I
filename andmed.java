public class andmed{
	//kolme arvu aritmeetilise keskmise leidmiseks funktsioon
	double a, b, c;
	public andmed(double arv1,double arv2,double arv3){
		a=arv1;
		b=arv2;
		c=arv3;
	}
	public double vastus(){
		return Math.round(((a+b+c)/3)*100.0)/100.0;
	}
	public String toString(){
		return"kolme arvu keskmine: "+a+" x "+b+" x "+c+" / 3 = ";
	}
	
}