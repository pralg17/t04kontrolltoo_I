import java.io.*;
public class kolmas{

static double keskmine (double a1, double a2, double a3, double a4, double a5){
return (a1/2+a2+a3+a4+a5/2)/4;
}

  public static void main(String[] args) throws IOException{
    BufferedReader lugeja=new BufferedReader(
    new FileReader("andmed.txt")
    );

    PrintWriter kirjutaja = new PrintWriter(new FileWriter("kuup2ev.txt"));

    int loendur=0;
    String rida=lugeja.readLine();
    rida=lugeja.readLine();


    while(rida!=null){
			String[] m=rida.split(" ");

      float a1=Integer.parseInt(m[1]);
      float a2=Integer.parseInt(m[2]);
      float a3=Integer.parseInt(m[3]);
      float a4=Integer.parseInt(m[4]);
      float a5=Integer.parseInt(m[5]);



      kirjutaja.println(m[0]+" kuupäeva keskmine temperatuur oli "+keskmine(a1,a2,a3,a4,a5));



    rida = lugeja.readLine();
  }
    lugeja.close();
    kirjutaja.close();
  }
}

/*
01-02 kuupäeva keskmine temperatuur oli 10.25
02-02 kuupäeva keskmine temperatuur oli 5.625
03-02 kuupäeva keskmine temperatuur oli 6.875
04-02 kuupäeva keskmine temperatuur oli 3.375
05-02 kuupäeva keskmine temperatuur oli 3.125
06-02 kuupäeva keskmine temperatuur oli 8.5
07-02 kuupäeva keskmine temperatuur oli 5.875
*/
