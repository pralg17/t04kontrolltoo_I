import java.util.*;

public class KarpJaVurrud{//TulpadeAndmed

    private int[] andmed;

    public KarpJaVurrud(int[] andmemassiiv){
        this.andmed=andmemassiiv;
        //massivi järjestamine
        Arrays.sort(andmed);
        int size = andmemassiiv.length;

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

    //millest 50% väiksemad
    public int _50(){
        int size = andmed.length;

    }


}