
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

/* [siimhuts@greeny t04kontrolltoo_I]$ java Data
Auto kaugus on 350.0 km ja autode kiirus on 60.0 km/h auto, auto kaugus algusest 3 sekundi p2rast on 350.25 kilomeetrit ning 5 minuti p2rast on kaugus 385.0 kilomeetrit ja 2 tunni p2rast 470.0 kilomeetrit
Auto kaugus on 120.0 km ja autode kiirus on 55.0 km/h auto, auto kaugus algusest 3 sekundi p2rast on 120.15277777777777 kilomeetrit ning 5 minuti p2rast on kaugus 138.33333333333334 kilomeetrit ja 2 tunni p2rast 175.0 kilomeetrit
Auto kaugus on 445.0 km ja autode kiirus on 100.0 km/h auto, auto kaugus algusest 3 sekundi p2rast on 445.97222222222223 kilomeetrit ning 5 minuti p2rast on kaugus 511.66666666666663 kilomeetrit ja 2 tunni p2rast 845.0 kilomeetrit
Auto kaugus on 75.0 km ja autode kiirus on 30.0 km/h auto, auto kaugus algusest 3 sekundi p2rast on 75.33333333333333 kilomeetrit ning 5 minuti p2rast on kaugus 95.0 kilomeetrit ja 2 tunni p2rast 105.0 kilomeetrit
[siimhuts@greeny t04kontrolltoo_I]$
*/
