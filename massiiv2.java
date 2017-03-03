import java.util.Arrays;

public class massiiv2{
	public static void main(String[] args){
		double[] massiiv={1, 0.2, 12, 15.2, 18, 9.9, 2.7};
		arraySort(massiiv);
		int arrayLength = massiiv.length;
      System.out.println("massiivis on: " + arrayLength+" elementi");
	}
	public static void arraySort(double[] massiiv){
		Arrays.sort(massiiv);
		for(int i=0; i<massiiv.length; i++){
			System.out.println(massiiv[i]);
		}
		double suurim= massiiv[massiiv.length-1];
		double v2ikseim=massiiv[0];
		double arv1=massiiv[massiiv.length/4];
		double arv2=massiiv[massiiv.length/2];
		double arv3=massiiv[(massiiv.length*3)/4];
		System.out.println("suurim on: "+suurim+" v2ikseim on :"+v2ikseim+" v22rtus millest 25% on v2iksemad on: "+arv1+" v22rtus millest 50% on v2iksemad on: "+arv2+" v22rtus millest 75% on v2iksemad on: "+arv3);
	}
	
   
}

/*

0.2
1.0
2.7
9.9
12.0
15.2
18.0
suurim on: 18.0 v2ikseim on :0.2 v22rtus millest 25% on v2iksemad on: 1.0 v22rtus millest 50% on v2iksemad on: 9.9 v22rtus millest 75% on v2iksemad on: 15.2
massiivis on: 7 elementi


*/