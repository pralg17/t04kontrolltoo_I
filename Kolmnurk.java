import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Kolmnurk {

    Double[] X;
    Double[] Y;
    //Double[] sides;
    Integer sideCount;
    List<Double> sides = new ArrayList<>();
    List<Double> distances = new ArrayList<>();
    Double[] midpoint;

    public Kolmnurk(Double[] newX, Double[] newY) {
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

        if(newX.length != newY.length){
            throw new RuntimeException("Need ei ole need droidid keda te otsite.");
        } else {

            //Calculate midpoint
            this.midpoint = calcMidpoint(X,Y);

            //Calculating lengths of sides
            for(int i=1;i<X.length;i++) {
                sides.add(calculateSide(X[i-1],Y[i-1],X[i],Y[i]));
            }
            sides.add(calculateSide(X[sideCount-1],Y[sideCount-1],X[0],Y[0]));

            //Calculating points' distance from the center
            for(int i=0;i<X.length;i++) {
                distances.add(calculateSide(X[i],Y[i],midpoint[0],midpoint[1]));
            }
        }
    }
    //Hälbeta võrdkülgsuse kontroll.
    public boolean equiLateral() {
        boolean isEquiLateral = true;
        for(int i=1;i<X.length;i++){
            if(sides.get(i)!=sides.get(i-1)){
                isEquiLateral = false;
            }
        }
        return isEquiLateral;
    }
    //Kahe koordinaadi vahelise kauguse arvutamine
    public Double calculateSide(Double X1, Double Y1, Double X2, Double Y2){
        return(Math.sqrt(
                Math.pow((X2-X1),2) +
                Math.pow((Y2-Y1),2)
        ));
    }
    //Külgede printimiseks
    public List<Double> getSides(){
        return sides;
    }

    //Võrdkülgsuse ja hälbe wrapper
    public String eqLatDev(Integer margin){
        return Boolean.toString(checkDistMargin(sides,margin));
    }
    //Keskpunkti stringi kujul esitamiseks
    public String getMidpoint() {
        return Arrays.toString(midpoint);
    }

    //Meetod arvutamaks keskpunkti.
    public Double[] calcMidpoint(Double[] x,Double[] y) {
        int xSum = 0;
        int ySum = 0;
        for(int i=0;i<x.length;i++) {
            xSum += X[i];
            ySum += Y[i];
        }

        Double xMid = (xSum)/(double)x.length;
        Double yMid = (ySum)/(double)x.length;
        Double[] result = {xMid,yMid};
        return result;
    }

    public Boolean cenDistDev(Integer margin){
        return checkDistMargin(this.distances, margin);
    }
    //Listi liikmete keskmise arvutamine ja hälbe kontroll
    public Boolean checkDistMargin(List<Double> input, Integer margin) {
        boolean meetsCriteria = true;
        double inputum = 0.0;
        for(int i=0;i<input.size();i++) {
            inputum += input.get(i);
        }
        Double sideAvg = inputum / input.size();
        for(int i=0;i<input.size();i++){
            if ((Math.abs(sideAvg - input.get(i)) / sideAvg) * 100.0 > (double)margin) {
                meetsCriteria = false;
            }
        }
        return(meetsCriteria);
    }
}
