public class teine{
	public static double[] kiirused = {170, 160, 160, 165, 163, 165, 141, 159, 164};

	public static double keskmisedKiirusedKokku(double[] sisend) {
		double summa = 0;
		for(double objekt : sisend){
			summa += 1 / objekt;
		}
		return summa;
	}

	public static double kokku(double[] sisend) {
		return sisend.length / keskmisedKiirusedKokku(sisend);		
	}

	public static void main(String[] args) {
		System.out.println("Kogu tee läbimise keskmine kiirus on:  "+kokku(kiirused)+" km/h");
		
	}

}