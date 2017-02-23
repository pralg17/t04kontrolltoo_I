public class Wrapper{
    public static void main(String[] args){

        Integer[] X = new Integer[] {1,2,3};
        Integer[] Y = new Integer[] {3,1,2};
        Kolmnurk k1 = new Kolmnurk(X,Y);
        System.out.println(k1.getSides());
        System.out.println(k1.getMidpoint());

    }
}

