package pohikursus;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
/*
AUTOD TEEL
 */
    public static void main(String[] args) {
        Car cars1 = new Car(10.00, 15.00, 15.00, 10.00);
        System.out.println("Cars1 Car 1 distance: " + cars1.getCar1DistanceFromStart());
        System.out.println("Cars1 Car 1 speed: " + cars1.getCar1Speed());
        System.out.println("Cars1 Car 2 distance: " + cars1.getCar2DistanceFromStart());
        System.out.println("Cars1 Car 2 speed: " + cars1.getCar2Speed());
        /* +3 SECONDS*/
        cars1.newDistance(3);
        System.out.println("Cars1 Car 1 new distance (3 sec): " + cars1.getCar1DistanceFromStart());
        System.out.println("Cars1 Car 2 new distance (3 sec): " + cars1.getCar2DistanceFromStart());
        /* +5 MINUTES / 300 SECONDS */
        cars1.newDistance(300);
        System.out.println("Cars1 Car 1 new distance (5 min): " + cars1.getCar1DistanceFromStart());
        System.out.println("Cars1 Car 2 new distance (5 min): " + cars1.getCar2DistanceFromStart());
        /* +2 HOURS / */
        cars1.newDistance(7200);
        System.out.println("Cars1 Car 1 new distance (2 h): " + cars1.getCar1DistanceFromStart());
        System.out.println("Cars1 Car 2 new distance (2 h): " + cars1.getCar2DistanceFromStart());

        try(BufferedReader br = new BufferedReader(new FileReader("cars.txt"))){
            for (String line = br.readLine(); line!=null; line = br.readLine()){
                String[] fileData = line.split(" ");
                Car temporaryCars = new Car(Double.parseDouble(fileData[0]), Double.parseDouble(fileData[1]),
                        Double.parseDouble(fileData[2]), Double.parseDouble(fileData[3]));
                temporaryCars.newDistance(Integer.parseInt(fileData[4]));
                temporaryCars.saveInFile("fileResult.txt");
                temporaryCars = null;
            }
        } catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }

        cars1.saveInFile("Cars1.txt");
        /*
        Cars1 Car 1 distance: 10.0
        Cars1 Car 1 speed: 15.0
        Cars1 Car 2 distance: 15.0
        Cars1 Car 2 speed: 10.0
        Cars1 Car 1 new distance (3 sec): 10.0125
        Cars1 Car 2 new distance (3 sec): 15.008333333333333
        Cars1 Car 1 new distance (5 min): 11.2625
        Cars1 Car 2 new distance (5 min): 15.841666666666667
        Cars1 Car 1 new distance (2 h): 41.2625
        Cars1 Car 2 new distance (2 h): 35.84166666666666
         */

    }
}
