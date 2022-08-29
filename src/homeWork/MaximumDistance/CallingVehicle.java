package homeWork.MaximumDistance;

public class CallingVehicle {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle(70f, 7f, 0);
        vehicle.maxDistance();

        System.out.println();


        //Additional task
        /*Object car maxDistance method works
        (just only if I pass values in both lines as bellow
        and I couldn't find out what wrong I did */
        Car car = new Car(70f, 7f, 0, false);
        car.maxDistance(70f, 7f, 0, false);

    }
}
