public class Run{
  public static void main(String[] args){
    Autod autod1= new Autod(3, 3, 15, 100);
    Autod autod2= new Autod(50, 95, 30, 99);
    System.out.println(autod1.toString());
    System.out.println(autod2.toString());
    System.out.println(autod1.Sek());
    System.out.println(autod1.Min());
    System.out.println(autod1.Tund());
  }
}
