public class keskmine2{
    
    public static void main(String[] args){
        int[] numbrid = new int[5];
            numbrid[0] = 2;
            numbrid[1] = 4;
            numbrid[2] = 6;
            numbrid[3] = 8;
            numbrid[4] = 10;
            int pikkus = numbrid.length;
        int kordus = 0;

        int i = 0;
        double v = 0;

        for(i=0;i<pikkus;i++){
            if(i==0){
                v +=(numbrid[i]/2.0);
            }else if(i==(pikkus-1)){
                v += numbrid[pikkus-1]/2.0;
            }else{
                v += numbrid[i];
            }
        }
         v = v/(pikkus-1);

         System.out.println("Arvude keskmine on: " + v);
    }
}