public class kogum{
	public static void main(String[] args){
		int[] hinded = {3, 5, 5, 4};
		int[] eap = {4, 4, 6, 3};
		int eapsumma = 0;
		for(int i=0; i<eap.length; i++){
			eapsumma=eap[i]+eapsumma;
		}
		int kogusumma = 0;
		for(int i=0; i<hinded.length; i++){
			kogusumma=hinded[i]*eap[i]+kogusumma;
		}
		System.out.println("Kaalutud keskmine on: " +kogusumma/eapsumma);
	}
}

/* 
Kaalutud keskmine on: 4
*/