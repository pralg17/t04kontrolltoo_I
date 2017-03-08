import java.io.*;
public class AndmeteLooja{

    public static KarpJaVurrud arvudFailist(String failinimi, String eraldaja){
        int[] vastus=null;
        try{
            BufferedReader failist=new BufferedReader(new FileReader(failinimi));
            String[] m=failist.readLine().split(eraldaja);
            vastus=new int[m.length];
            for(int i=0; i<m.length; i++){vastus[i]=Integer.parseInt(m[i]);}
            failist.close();
        } catch(Exception ex){ex.printStackTrace();}
        return new KarpJaVurrud(vastus);
    }

}