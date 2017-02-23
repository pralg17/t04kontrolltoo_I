package pohikursus;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;

/**
 * Created by AASA on 23.02.2017.
 */
public class Car {
    /*KILOMETERS*/
    private Double car1DistanceFromStart, car2DistanceFromStart, car1Speed, car2Speed;
    public Car(Double car1DistanceFromStart, Double car2DistanceFromStart, Double car1Speed, Double car2Speed){
        this.car1DistanceFromStart = car1DistanceFromStart;
        this.car2DistanceFromStart = car2DistanceFromStart;
        this.car1Speed = car1Speed;
        this.car2Speed = car2Speed;
    }
    public Double getCar1DistanceFromStart() {
        return car1DistanceFromStart;
    }
    public void setCar1DistanceFromStart(Double car1DistanceFromStart) {
        this.car1DistanceFromStart = car1DistanceFromStart;
    }
    public Double getCar2DistanceFromStart() {
        return car2DistanceFromStart;
    }
    public void setCar2DistanceFromStart(Double car2DistanceFromStart) {
        this.car2DistanceFromStart = car2DistanceFromStart;
    }
    public Double getCar1Speed() {
        return car1Speed;
    }
    public void setCar1Speed(Double car1Speed) {
        this.car1Speed = car1Speed;
    }
    public Double getCar2Speed() {
        return car2Speed;
    }
    public void setCar2Speed(Double car2Speed) {
        this.car2Speed = car2Speed;
    }
    public void newDistance(int seconds){
        Double car1Speed = (getCar1Speed()/60)/60;
        Double car2Speed = (getCar2Speed()/60)/60;
        setCar1DistanceFromStart(getCar1DistanceFromStart()+(car1Speed*seconds));
        setCar2DistanceFromStart(getCar2DistanceFromStart()+(car2Speed*seconds));
    }
    public void saveInFile(String filename){
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(filename, true))){
            String content = "Car 1 new distance: " + getCar1DistanceFromStart() +
                    " Car 2 new distance: " + getCar2DistanceFromStart() + "\n";
            bw.write(content);

        } catch (IOException e){
            e.printStackTrace();
        }


    }
}


