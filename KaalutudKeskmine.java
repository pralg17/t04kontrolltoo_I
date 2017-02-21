public class KaalutudKeskmine{
    public static double keskmine(double v, double t, double k, double l){
        double keskmine = 0;
        keskmine = (v*k+t*l)/(k+l);
        return keskmine;
    }
    
    public static void main(String[] args){
        System.out.println("Enter Grades and EAP");
        double grade1 = Double.parseDouble(args[0]);
        double grade2 = Double.parseDouble(args[1]);
        double eap1 = Double.parseDouble(args[2]);
        double eap2 = Double.parseDouble(args[3]);
        double kaalutud1 = keskmine(grade1, grade2, eap1, eap2);
        System.out.println("Keskmine on "+kaalutud1);
        }
       
        
 }
    
