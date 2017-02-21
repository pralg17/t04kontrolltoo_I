import java.io.*;
public class kolmas1{
  public static void main(String[] args){
    BufferedReader lugeja=new BufferedReader(
    new FileReader("andmed.txt")
    );
    String rida=lugeja.readLine();
    rida=lugeja.readLine();
    while(rida!=null){
      String[] m=rida.split(" ");
      String kuupaev=m[0];
      float a1=Integer.parseInt(m[1]);
      float a2=Integer.parseInt(m[2]);
      float a3=Integer.parseInt(m[3]);
      float a4=Integer.parseInt(m[4]);
      float a5=Integer.parseInt(m[5]);

    System.out.println(kolmas2.kuupaev+" kuupäeva keskmine temperatuur oli "+kolmas2.keskmine);
    rida = lugeja.readLine();
}
lugeja.close();
}
}
