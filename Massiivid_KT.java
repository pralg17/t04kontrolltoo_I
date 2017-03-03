
public class Massiivid_KT { 

//	KARP JA VURRUD ulesanne

	public static void main(String[] args) { 
	int array[] = {3,5,43,27,13,100,590,1005,993,7}; 
	
	System.out.println("Massiiv:" );
	
	for(int i=0;i<array.length;i++){ 
		System.out.print(array[i]+" ");
	}
	
	// meetod sort jarjestab massiivid olevad elemendid
	sort(array); 
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
	}