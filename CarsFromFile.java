import java.io.*;
public class CarsFromFile{
    public static void main(String[] args) throws IOException{
        BufferedReader lugeja= new BufferedReader(
        new FileReader("Data.txt")
        );
        String rida=lugeja.readLine();
        int loendur=0;
        PrintWriter kirjutaja = new PrintWriter(new FileWriter("Result.txt"));
        while(rida!=null){
            loendur++;
            String[] r=rida.split(",");
            double s=Double.parseDouble(r[0]);
            double v=Double.parseDouble(r[1]);
            double t1=Double.parseDouble(r[2]);
            double t2=Double.parseDouble(r[3]);
            double t3=Double.parseDouble(r[4]);
            double sekundid=s+(v*(t1/3600));
            double minutid=s+(v*(t2/60));
            double tunnid=s+(v*t3);
            kirjutaja.println("Auto kaugus on "+s+" km ja autode kiirus on "+v+" km/h auto, auto kaugus algusest 3 sekundi p2rast on "+sekundid+" kilomeetrit ning 5 minuti p2rast on kaugus "+minutid+" kilomeetrit ja 2 tunni p2rast "+tunnid+" kilomeetrit");
            rida=lugeja.readLine();
        }
        lugeja.close();
        kirjutaja.close();
    }
}
