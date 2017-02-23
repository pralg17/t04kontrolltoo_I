public class KaalutudKesk {
	
    public static double keskmine(double a, double b, double a1, double b1){
        double keskmine = 0;
        keskmine =(a*a1 + b*b1)/ (a1 + b1);
        return keskmine;
    }
 
    public static void main(String[] args){
        System.out.println("Lisan hinded ja ainepunktid...");
        int hinne1 = 2;
        int hinne2 = 1;
        int eap1 = 4;
        int eap2 = 5;
        System.out.println("Kaalutud keskmine on: " + keskmine(hinne1, hinne2, eap1, eap2));
    }
}
/*
Lisan hinded ja ainepunktid...
Kaalutud keskmine on: 1.4444444444444444
*/
