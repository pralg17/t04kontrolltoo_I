public class Kahekeskmine{
    double kiirus1, kiirus2, keskminekiirus;
    
    public Kahekeskmine (double kiirus1, double kiirus2){
        this.kiirus1 = kiirus1;
        this.kiirus2 = kiirus2;
    }
    public double Keskmine2KM (){
        double keskminekiirus = (kiirus1 + kiirus2)/2;
        return keskminekiirus;
    }
}
/*
V2ljund:
Kahe kilomeetri pikkuse l6igu keskmine kiirus on 75.48 km/h
*/