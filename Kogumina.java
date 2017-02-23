public class Kogumina {
	
    public static double keskmine(int []m , int [] c){
        double hinneteKorrutis = 0;
        double eapLiitmine = 0;
        for (int i=0; i<m.length;i++) {
            hinneteKorrutis += m[i]* c[i];
 
            eapLiitmine += c[i];
        }
 
       double keskmine = hinneteKorrutis / eapLiitmine;
        return keskmine;
    }
 
    public static void main(String[] args){
        System.out.println("Lisan hinded ja ainepunktid...");
        int [] hinded = {4,3,2,10};
        int [] eap = {7,5,1,1,};
        keskmine(hinded, eap);
        System.out.println("Kaalutud keskmine on: " + keskmine(hinded, eap));
    }
}
/*
Lisan hinded ja ainepunktid...
Kaalutud keskmine on: 3.9285714285714284
*/