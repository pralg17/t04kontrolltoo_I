public class Kahekeskmine{
    double kiirus1, kiirus2, keskminekiirus;
    
    public Kahekeskmine (double kiirus1, double kiirus2){
        this.kiirus1 = kiirus1;
        this.kiirus2 = kiirus2;
    }
    public double Keskmine2KM (){
        double keskminekiirus = 2/(1/kiirus1 + 1/kiirus2);
        return keskminekiirus;
    }
}
