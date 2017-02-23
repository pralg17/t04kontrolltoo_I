public class massiiv{	
	public static void massiiv(){
		int[] ajad={65, 58, 103, 87};
		int summa=0;
		for(int i=0; i<ajad.length; i++){
			summa=ajad[i]+summa;
			System.out.println(ajad[i]);
		}
		
		System.out.println(summa);
		//Leidke keskmine mass
		System.out.println(summa*1.0/ajad.length);
	}
	public static void main(String[] args){
		massiiv();
	}
}
