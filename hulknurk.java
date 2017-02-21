public class hulknurk{		
	private static void printArray(int[] anArray) {
		for (int i = 0; i < anArray.length; i++) {
			if (i > 0) {
				System.out.print(", ");
			}
			System.out.print(anArray[i]);
		}
	}	
	
   public static void main(String[] args) {
		int[] nurk1 = {2, 5, 6, 4, 7, 3};
		int[] nurk2 = {6, 7, 4, 2, 9, 6};
		System.out.println("Kolmnurgade x-koordinaadid:");
		printArray(nurk1);
		System.out.println("");
		System.out.println("Kolmnurgade y-koordinaadid:");
		printArray(nurk2);
		System.out.println("");
	}	

}
