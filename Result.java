public class Result{
  public static void main(String[] args){
    Autod Autod1= new Autod(70, 90, 85, 95);
    Autod Autod2= new Autod(10, 50, 8, 55);
    Autod Autod3= new Autod(20, 70, 110, 120);

    System.out.println(Autod1.toString());
    System.out.println(Autod1.twoHours());

    System.out.println(Autod2.toString());
    //System.out.println(Autod2.twoHours());
    System.out.println(Autod2.threeSeconds());

    System.out.println(Autod3.toString());
    //System.out.println(Autod3.twoHours());
    System.out.println(Autod3.fiveMinutes());
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

/*
2. punkti tulemused
Auto1 kaugus mnt algusest on 70.0km ja liigub kiirusega 90.0km/h
Auto2 kaugus mnt algusest on 85.0km ja liigub kiirusega 95.0km/h
Auto1 kaugus algpunktist 2h p2rast on 250.0
Auto2 kaugus algpunktist 2h p2rast on 275.0

Auto1 kaugus mnt algusest on 10.0km ja liigub kiirusega 50.0km/h
Auto2 kaugus mnt algusest on 8.0km ja liigub kiirusega 55.0km/h
Auto1 kaugus algpunktist 3s p2rast on 10.041666666666666
Auto2 kaugus algpunktist 3s p2rast on 8.045833333333333

Auto1 kaugus mnt algusest on 20.0km ja liigub kiirusega 70.0km/h
Auto2 kaugus mnt algusest on 110.0km ja liigub kiirusega 120.0km/h
Auto1 kaugus algpunktis 5min p2rast on 25.833333333333336
Auto2 kaugus algpunktist 5min p2rast on 120.0
*/
