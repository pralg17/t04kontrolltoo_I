/*ruutjuur(arv*arv)*/

public class ylesanne1{
     double a, b;
     public ylesanne1(double arv1, double arv2){
         if(arv1<=0){throw new RuntimeException("Sobimatu arv");}
         if(arv2<=0){throw new RuntimeException("Sobimatu arv");}
         a=arv1;
         b=arv2;
     }
     public double korrutis(){
     	return a*b;
	}
	public double ruutjuur(){
         return Math.sqrt(korrutis());
     }
}

