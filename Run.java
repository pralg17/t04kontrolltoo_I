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

//
// auto liikumiskiirus on: 3km/h ja ta kaugus maantee algusest on: 3.0km
// auto liikumiskiirus on: 100km/h ja ta kaugus maantee algsest on: 15.0km
//
//
// auto liikumiskiirus on: 95km/h ja ta kaugus maantee algusest on: 50.0km
// auto liikumiskiirus on: 99km/h ja ta kaugus maantee algsest on: 30.0km
//
//
// auto kaugus maantee algusest 3sek parast on: 3.000833km
// auto kaugus maantee algusest 3sek parast on: 15.027766666666666km
// auto kaugus maantee algusest 5min parast on: 3.25km
// auto kaugus maantee algusest 5min parast on: 23.333333333333332km
// auto kaugus maantee algusest 2h parast on: 9.0km
// auto kaugus maantee algusest 2h parast on: 215.0km
//  
