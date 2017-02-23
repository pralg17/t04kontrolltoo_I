import java.util.ArrayList;
import java.util.List;

public class Kolmnurk {

    Integer[] X;
    Integer[] Y;
    //Double[] sides;
    Integer sideCount;
    List<Double> sides = new ArrayList<>();
    Double[] midpoint;

    public Kolmnurk(Integer[] newX, Integer[] newY) {
        if (newX != null) {
            this.X = newX;
        } else {
            throw new RuntimeException("No X-coordinates");
        }
        if (newY != null) {
            this.Y = newY;
        } else {
            throw new RuntimeException("No Y-coordinates");
        }
        sideCount = X.length;
        //Calculating lengths of sides
        if(newX.length != newY.length){
            throw new RuntimeException("Need ei ole need droidid keda te otsite.");
        } else {
            for(int i=1;i<X.length;i++) {
                sides.add(calculateSide(X[i-1],Y[i-1],X[i],Y[i]));
            }
            sides.add(calculateSide(X[sideCount-1],Y[sideCount-1],X[0],Y[0]));
        }
        //Calculating midpoint
        this.midpoint = calcMidpoint(X,Y);

    }

    public boolean equiLateral() {
        boolean isEquiLateral = true;
        for(int i=1;i<X.length;i++){
            if(sides.get(i)!=sides.get(i-1)){
                isEquiLateral = false;
            }
        }
        return isEquiLateral;
    }

    public Double calculateSide(int X1, int Y1,int X2, int Y2){
        return(Math.sqrt(
                (double)Math.pow((X2-X1),2)+
                (double)Math.pow((Y2-Y1),2)
        ));
    }
    public List<Double> getSides(){
        return sides;
    }


    public String getMidpoint() {
        return String.valueOf(midpoint[0])+String.valueOf(midpoint[1]);
    }

    public Double[] calcMidpoint(Integer[] x,Integer[] y) {
        int xSum = 0;
        int ySum = 0;
        for(int i=0;i<x.length;i++) {
            xSum += X[i];
            ySum += Y[i];
        }

        Double xMid = (double)(xSum)/x.length;
        Double yMid = (double)(ySum)/x.length;
        Double[] result = {xMid,yMid};
        return result;
    }

}
