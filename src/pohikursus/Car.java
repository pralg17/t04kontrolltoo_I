package pohikursus;

/**
 * Created by AASA on 23.02.2017.
 */
public class Car {
    private int car1DistanceFromStart, car2DistanceFromStart;
    private double car1Speed, car2Speed;
    public Car(int car1DistanceFromStart, int car2DistanceFromStart, double car1Speed, double car2Speed){
        this.car1DistanceFromStart = car1DistanceFromStart;
        this.car2DistanceFromStart = car2DistanceFromStart;
        this.car1Speed = car1Speed;
        this.car2Speed = car2Speed;
    }

    public int getCar1DistanceFromStart() {
        return car1DistanceFromStart;
    }
    public void setCar1DistanceFromStart(int car1DistanceFromStart) {
        this.car1DistanceFromStart = car1DistanceFromStart;
    }
    public int getCar2DistanceFromStart() {
        return car2DistanceFromStart;
    }
    public void setCar2DistanceFromStart(int car2DistanceFromStart) {
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

}
