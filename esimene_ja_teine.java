import java.util.*;

public class esimene_ja_teine {

	private int[] andmed;

	public esimene_ja_teine(int arv1, int arv2, int arv3){

		andmed = new int[]{arv1, arv2, arv3};


	}

	public double ruutjuur(){

		int i;
		double summa = 1.0;

		for(i=0; i<andmed.length; i++){

			summa = andmed[i] * summa;

		}

		summa = Math.pow(summa, (1.0/andmed.length) ); 

		return summa;

	}

	public String toString(){

		return Arrays.toString(andmed);

	}

}