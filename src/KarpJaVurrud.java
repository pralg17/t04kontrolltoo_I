import java.util.*;
import java.util.ArrayList;


public class KarpJaVurrud{//TulpadeAndmed

    private int[] andmed;

    public KarpJaVurrud(int[] andmemassiiv){
        this.andmed=andmemassiiv;
        //massivi järjestamine
        Arrays.sort(andmed);
    }

    public int[] kysiAndmed(){
        return andmed;
    }

    @Override
    public String toString(){
        return Arrays.toString(andmed);
    }

    //suurim väärtus
    public int maksimum(){
        int suurim=andmed[0];
        for(int i=1; i<andmed.length; i++){
            if(andmed[i]>suurim){suurim=andmed[i];}
        }
        return suurim;
    }

    //vähim väärtus
    public int minimum(){
        int v2him=andmed[0];
        for(int i=1; i<andmed.length; i++){
            if(andmed[i]<v2him){v2him=andmed[i];}
        }
        return v2him;

    }

    public int on25v2iksemad(){
        int asd = (int) (0.25 * andmed.length);
        return andmed[asd];
    }

    public int on50v2iksemad(){
        int asd = (int) (0.5 * andmed.length);
        return andmed[asd];
    }

    public int on75v2iksemad(){
        int asd = (int) (0.75 * andmed.length);
        return andmed[asd];
    }



}