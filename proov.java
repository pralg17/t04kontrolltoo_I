
public class proov{
	public static void main(String[] args){
		int[] arvud={65, 58, 103, 86};
		double summa=0;
		for(int i=0; i<arvud.length; i++){
			if(i==0){
				summa=arvud[i]/2.0+summa;
			} else if(i==arvud.length-1){
				summa=arvud[i]/2.0+summa;
			} else {
			summa=arvud[i]+summa;
		}
	}
double keskmine=summa/(arvud.length-1);


		System.out.println("Antud arvude kronoloogiline keskmine on "+keskmine);


	}
}

/*
Antud arvude kronoloogiline keskmine on 78.83333333333333
*/
