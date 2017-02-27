public class massiiv{	
	public static void massiiv(){
		double[] kiirused={30.0, 60.0};
		double summa=0;
		double aeg=0;
		for(int i=0; i<kiirused.length; i++){
			summa=(1/kiirused[i])+summa; 
			
		}
	
		/*kesk kiirus*/System.out.println((kiirused.length)/summa*1.0 +" km/h");
		
	}
	public static void main(String[] args){
		massiiv();
	}
}
