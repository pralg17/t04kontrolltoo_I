
public class Massiivid_KT { 

//	KARP JA VURRUD
//  ulesanne 1
	public static void main(String[] args) { 
	int array[] = {3,5,43,27,13,100,590,1005,993,7}; 
	
	System.out.println("Massiiv:" );
	
	for(int i=0;i<array.length;i++){ 
		System.out.print(array[i]+" ");
	}
	
	// meetod sort jarjestab massiivid olevad elemendid
	sort(array); 
	
		
		System.out.println("25% väiksemad:");
		for(int i=0;i<4;i++){
		System.out.print(array[array.length-1-i]+" ");
		}
		
		
	
	VaiksestSur(array);
	} 

// iga massiivi element ma vordlen jargmise massiivi elemendiga ning kui ta on suurem
// ta votab suurema elemendi vaartuse endale
	public static void sort(int[] array){ 
		for(int i=0;i<array.length;i++){ 
			for(int ii=0;ii<array.length;ii++){ 
				if(array[i] > array[ii]){ 
					int abi = array[ii]; 
					array[ii] = array[i]; 
					array[i] = abi; 
				}			 
			} 
		} 

	System.out.println("\nJarjestatud massiiv:"); 
	
// tsukkel annab massiivi [votmele] vaartus ning korrast naitab neid
	for(int ii=0;ii<array.length;ii++){ 
		System.out.print(array[ii]+" "); 
	} 	

	
	System.out.println("\nSuurim vaartus: "+array[0]); 
	System.out.println("Vahim vaartus: "+array[array.length-1]); //kuna algab nullist -1 viimaseks
	}
	
	
	//ulesanne kaks ------------------------- tegemata
	//jagan massiivi 4 osaks, kuna on vaja leida 1/4, 1/2, 3/4  väiksemad arvud
	
	public static void VaiksestSur(int[] array){ 
	sort(array); 
	int jaotus = array.length % 4; //jääk jagamisel 4ga  
	
	

	//tekitan 4 tüja massiivi
	
	
	
	//  		(esialgne massiivi           4+(kui jääk jagamisel 4ga suurem kui 1/2/3 
	//			elementide arv jagada)	     siis liita 1, kui vahem siis liita 0)
										
										

	int array25[] = new int[array.length/4+(jaotus >= 1 ? 1 : 0)];  //2>=1? true = 2
  
	
	

	// for tsukliga täiendan tühjad masiivi jaotud arvudega
	System.out.println("25% väiksemad arvud massiivist:"); 
	
		for(int i=0;i<array25.length;i++) { 
			System.out.print(array[i]+" "); 
			array25[i] = array[i]; 
		} 
	
		
	}
}
	
	
	
	