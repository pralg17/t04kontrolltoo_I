public class Arvutus {
	public static void main(String[] arvudTekstina) {
        double[] numbers=new double[arvudTekstina.length];
		for(int i=0; i<arvudTekstina.length; i++){
			numbers[i]=Double.parseDouble(arvudTekstina[i]);
		}
		
		//Esimese ja viimase jagamine kahega
		double summa = 0;
		double a = numbers[0] / 2;
		double b = numbers[numbers.length-1] / 2;
        // summa = a + b + numbers[1];
        
		
		double krono = 0;
		for(int i=1; i < numbers.length; i++){
			krono = krono + numbers[i];
			
		}
		double vastus = (a + b + (krono - numbers[numbers.length-1])) / (numbers.length -1);
		double keskmine = (a + b + (krono - numbers[numbers.length-1])) / 2;
		System.out.println("Arvude kronoloogiline keskmine : " + vastus);
		System.out.println("Arvude keskmine on : " + keskmine);
		
		

		
		
		
		
        }
}