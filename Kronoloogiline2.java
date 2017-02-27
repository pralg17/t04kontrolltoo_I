
public class Kronoloogiline2{

	public static void main(String[] args){
         int[] numbrid = new int[5];
		 numbrid[0] = 5;
		 numbrid[1] = 15;
		 numbrid[2] = 25;
		 numbrid[3] = 35;
		 numbrid[4] = 45;
		 int pikkus = numbrid.length;
         int kordus=0;

         int i=0;
         double v = 0;
		//Juhul kui on esimene arv siis jagan kahega, juhul kui on tegu massiivi viimase arvuga jagan kahega
		//Ülejäänud kordadel lihtsalt liidan


		//Juhul kui on esimene arv siis jagan kahega, juhul kui on tegu massiivi viimase arvuga jagan kahega
		//Ülejäänud kordadel lihtsalt liidan
        for(i=0;i<pikkus;i++){
			if (i==0){
				v +=(numbrid[i]/2.0);
			} else if (i==(pikkus-1)){
				v+= numbrid[pikkus-1]/2.0;
			} else {
				v+=numbrid[i];

			}
		 // Siin jagan tsüklist saadu massiivi pikkus-1-ega läbi
		 v = v/(pikkus-1);
 
 
         System.out.println("Arvude keskmine on:"+v);
 
     }
 }


