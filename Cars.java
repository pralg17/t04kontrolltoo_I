
public class Cars{
    double s, v, t1, t2, t3;

public Cars(double kaugus, double kiirus, double sekund, double minut, double tund){
    s = kaugus;
    v = kiirus;
    t1 = sekund;
    t2 = minut;
    t3 = tund;
}
// Teepikkuse arvtamise valem s = v * t

public double sekund(){
    return s+(v*(t1/3600));
}
public double minut(){
     return s+(v*(t2/60));
}
public double tund(){
     return s+(v*t3);
}


public String toString(){
    return "Auto kaugus on "+s+" km ja autode kiirus on "+v+" km/h auto, auto kaugus algusest 3 sekundi p2rast on "+sekund()+" kilomeetrit ning 5 minuti p2rast on kaugus "+minut()+" kilomeetrit ja 2 tunni p2rast "+tund()+" kilomeetrit";
    }
}
