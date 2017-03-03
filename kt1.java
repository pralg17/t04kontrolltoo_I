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
		
	//väljastan teises punktis nõutud väärtused
		int value1 = array[(int)(array.length*0.25)];
		int value2 = array[(int)(array.length*0.5)];
		int value3 = array[(int)(array.length*0.75)];
		int[] newArray = new int[]{minValue, value1, value2, value3, maxValue};
		System.out.println("Max: "+newArray[0]+" Min: "+newArray[newArray.length-1]);
		System.out.println("25% v2iksemad: "+newArray[1]);
		System.out.println("50% v2iksemad: "+newArray[2]);
		System.out.println("75% v2iksemad: "+newArray[3]);
		
	}
	
	
}