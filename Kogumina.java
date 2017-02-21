import java.util.Scanner;


public class Kogumina{
    public static double keskmine(int[] a, int[] t){
        double summaarv = 0;
        double kokku = 0;
        for(int j=0;j<a.length;j++)
            summaarv = summaarv+a[j]*t[j];
        double sum = 0;
        for(int i : t) {       
         sum += i;
        }  
        kokku = summaarv/sum; 
        return kokku;
    }
    
    public static void main(String[] args){
        int sisestused;
        double keskmineKokku;
        Scanner in = new Scanner(System.in);
        System.out.println("Kui mitu hinnet sisestad?");
        sisestused = in.nextInt();
        System.out.println("Sisesta hinded (A = 5, B = 4, .... F = 0)");
        int[] hinded=new int[sisestused];
        Scanner sc=new Scanner(System.in);
        for(int j=0;j<sisestused;j++)
            hinded[j]=sc.nextInt();
        System.out.println("Sisesta EAP-d");
        int[] eapd=new int[sisestused];
        for(int j=0;j<sisestused;j++)
            eapd[j]=sc.nextInt();
        keskmineKokku = keskmine(hinded, eapd);
        System.out.println("Keskmine on "+keskmineKokku);


        }
          
 }
    