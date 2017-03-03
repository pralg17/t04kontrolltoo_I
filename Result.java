public class Result{
  public static void main(String[] args){
    Autod Autod1= new Autod(70, 90, 85, 95);
    Autod Autod2= new Autod(10, 50, 8, 55);
    Autod Autod3= new Autod(20, 70, 110, 120);

    System.out.println(Autod1.toString());
    System.out.println(Autod2.toString());
    System.out.println(Autod3.toString());
  }
}
/*
1. punkti tulemused
Auto1 kaugus mnt algusest on 70.0km ja liigub kiirusega 90.0km/h
Auto2 kaugus mnt algusest on 85.0km ja liigub kiirusega 95.0km/h

Auto1 kaugus mnt algusest on 10.0km ja liigub kiirusega 50.0km/h
Auto2 kaugus mnt algusest on 8.0km ja liigub kiirusega 55.0km/h

Auto1 kaugus mnt algusest on 20.0km ja liigub kiirusega 70.0km/h
Auto2 kaugus mnt algusest on 110.0km ja liigub kiirusega 120.0km/h
*/
