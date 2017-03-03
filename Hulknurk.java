public class Hulknurk{
 	
    public static void main(String[] args){
		
		//Masiivid
 		int[] x = {2, 5, 6, 4, 7, 3};
 		int[] y = {6, 7, 4, 2, 9, 6};
		
		//Andmete väljatrükk
 		System.out.println("Kolmnurkade x-koordinaadid on:");
 		printArray(x);
 		System.out.println("Kolmnurkade y-koordinaadid on:");
 		printArray(y);
 	}

 	public static void printArray(int[] anArray){
 		for (int i = 0; i < anArray.length; i++){
 			if (i > 0) {
 				System.out.print(", ");
 			}
 			System.out.print(anArray[i]);	
 		}
		System.out.println("");
 	}	
	
}