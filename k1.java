import java.util.Scanner;

public class k1 {
	public static double weightedAvg(double h1, double h2, double a1, double a2) {
		double avg = (h1*a1 + h2*a2) /(a1+a2);
		return avg;
		
		
	}
	
	public static void main (String[] args) {
		int mark1, mark2, eap1, eap2;
		
		System.out.println("Enter marks: ");
		Scanner in = new Scanner (System.in);
		mark1 = in.nextInt();
		mark2 = in.nextInt();
		
		System.out.println("Enter EAP:");
		
		eap1 = in.nextInt();
		eap2 = in.nextInt();
		
		System.out.println("Weighted average is: " + weightedAvg(mark1,mark2,eap1,eap2));
	}
	
}

/*

Enter marks:
4
3
Enter EAP:
3
4
Weighted average is: 3.4285714285714284



*/