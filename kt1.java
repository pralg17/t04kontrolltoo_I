import java.util.Arrays;

public class kt1{
	
	public static void main(String[] args){
	//loon massiivi
		int[] array = new int[]{1, 3, 7, 5, 4, 6, 9, 2, 10};
		arraySort(array);
	}
	
	//sordin
	public static void arraySort(int[] array){
		
		Arrays.sort(array);
		for(int i=0; i<array.length; i++){
			
			System.out.println(array[i]);
		
		}
		int maxValue = array[array.length-1];
		int minValue = array[0];
		System.out.println("Max: "+maxValue+" Min: "+minValue);
	}
	
}