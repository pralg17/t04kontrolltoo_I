public class k2 {
	public static double average(int[]a, int[]b) {
		double marks = 0;
		double summation = 0;
		for (int i=0; i<a.length;i++) {
			marks = marks + a[i] * b[i];
			
			summation = summation + b[i];
			
		}
		
		double avg = marks / summation;
		return avg;
		
	}
	
	public static void main (String[] args) {
		int []marks = {2,5,7,2,4};
		int []eap = {5,4,3,6,2};
		System.out.println("Weighted average is: " + average(marks, eap));
		
		
	}
	
}

/*

Weighted average is: 3.55

*/