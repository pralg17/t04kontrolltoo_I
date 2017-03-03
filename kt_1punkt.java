import java.util.Arrays;
import java.util.Collections;

class kt_1punkt{
	
	//Loon massiivi suvaliste numbritega.
	public static void main(String[] args) {
    Integer[] numbers = { 8, 2, 6, 7, 0, 1, 4, 9, 5, 3 };
	
	//Sorteerin massiivi kasvavas järjekorras.
	Arrays.sort(numbers);

	System.out.println("Järjestatud massiiv:");
	for (int number : numbers) {
	System.out.println(number);
		
		}
	
	//Leian massiivi väikseima ja suurima numbri.
	int min = (int) Collections.min(Arrays.asList(numbers));
    int max = (int) Collections.max(Arrays.asList(numbers));
	
	//Leian 25%, 50% ja 75% väiksemad.
	double number1=numbers[numbers.length/4];
	double number2=numbers[numbers.length/2];
	double number3=numbers[(numbers.length*3)/4];
		
	System.out.println("Min number: " + min);
	System.out.println("Väiksemad 25%: " + number1);
	System.out.println("Väiksemad 50%: " + number2);
	System.out.println("Väiksemad 75%: " + number3);
	System.out.println("Max number: " + max);
	
	}
}