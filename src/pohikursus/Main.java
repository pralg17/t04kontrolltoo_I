package pohikursus;

public class Main {

    public static void main(String[] args) {
        Car cars1 = new Car(10, 15, 15, 10);
        Car cars2 = new Car(100, 0, 0, 100);
        System.out.println("Cars1 Car 1 distance: " + cars1.getCar1DistanceFromStart());
        System.out.println("Cars1 Car 2 speed: " + cars1.getCar2Speed());
        System.out.println("Cars2 Car 1 speed: " + cars2.getCar1Speed());
        System.out.println("Cars2 Car 1 distance: " + cars2.getCar2DistanceFromStart());

        /*
        Cars1 Car 1 distance: 10
        Cars1 Car 2 speed: 10.0
        Cars2 Car 1 speed: 0.0
        Cars2 Car 1 distance: 0
         */
    }
}
