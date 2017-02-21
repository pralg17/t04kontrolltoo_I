
import java.util.Scanner;


public class KaalutudKeskmine{
    public static double keskmine(double v, double t, double k, double l){
        double keskmine = 0;
        keskmine = (v*k+t*l)/(k+l);
        return keskmine;
    }
    
    public static void main(String[] args){
        System.out.println("Enter Grades and EAP(A=5, B=4 etc.. F=0)");
        double grade1;
        double grade2;
        double eap1;
        double eap2;
        Scanner in = new Scanner(System.in);
        System.out.println("Esimese hinne?: ");
        grade1 = in.nextDouble();
        System.out.println("Teise hinne?: ");
        grade2 = in.nextDouble();
        System.out.println("Esimese EAP?: ");
        eap1 = in.nextDouble();
        System.out.println("Teise EAP?: ");
        eap2 = in.nextDouble();
        double kaalutud1 = keskmine(grade1, grade2, eap1, eap2);
        System.out.println("Keskmine on "+kaalutud1);
        }
       
        
 }
    