import java.util.*;
public class harmooniline{
	double a, b;
	//int[] myIntArray = new int[]{15, 30, 80, 120, 75, 60, 150};
	public harmooniline(double aeg1, double aeg2){
		if(aeg1<=0){throw new RuntimeException("Sobimatu aeg1");}
		if(aeg2<=0){throw new RuntimeException("Sobimatu aeg2");}
		
		a=aeg1;
		b=aeg2;
		
	}
	
	public double kiirused1(){
		
		return ((1000/a)*18)/5;
	
	}
	public double kiirused2(){
		
		return ((1000/b)*18)/5;
	
	}
	
	

}
