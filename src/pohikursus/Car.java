package pohikursus;

/**
 * Created by AASA on 23.02.2017.
 */
public class Car {
    /*KILOMETERS*/
    private double car1DistanceFromStart, car2DistanceFromStart, car1Speed, car2Speed;
    public Car(double car1DistanceFromStart, double car2DistanceFromStart, double car1Speed, double car2Speed){
        this.car1DistanceFromStart = car1DistanceFromStart;
        this.car2DistanceFromStart = car2DistanceFromStart;
        this.car1Speed = car1Speed;
        this.car2Speed = car2Speed;
    }
    public double getCar1DistanceFromStart() {
        return car1DistanceFromStart;
    }
    public void setCar1DistanceFromStart(double car1DistanceFromStart) {
        this.car1DistanceFromStart = car1DistanceFromStart;
    }
    public double getCar2DistanceFromStart() {
        return car2DistanceFromStart;
    }
    public void setCar2DistanceFromStart(double car2DistanceFromStart) {
        this.car2DistanceFromStart = car2DistanceFromStart;
    }
    public double getCar1Speed() {
        return car1Speed;
    }
    public void setCar1Speed(double car1Speed) {
        this.car1Speed = car1Speed;
    }
    public double getCar2Speed() {
        return car2Speed;
    }
    public void setCar2Speed(double car2Speed) {
        this.car2Speed = car2Speed;
    }

    public void newDistance(int seconds){
        double car1Speed = (getCar1Speed()/60)/60;
        double car2Speed = (getCar2Speed()/60)/60;
        setCar1DistanceFromStart(getCar1DistanceFromStart()+(car1Speed*seconds));
        setCar2DistanceFromStart(getCar2DistanceFromStart()+(car2Speed*seconds));
    }
}
