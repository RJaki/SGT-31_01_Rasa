package homeWork.MaximumDistance;

import java.util.Scanner;

public class CallingVehicle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter fuel amount in your vehicle");
        float fuel = scanner.nextFloat();

        System.out.println("Enter your vehicle's fuel usage per 100km");
        float fuelUsage = scanner.nextFloat();

        System.out.println("Enter how many passengers will be in the vehicle");
        int passengers = scanner.nextInt();


        Vehicle vehicle = new Vehicle(fuel, fuelUsage, passengers);
        System.out.printf("Your vehicle can drive maximum of %.2f kilometers", vehicle.maxDistance());

        System.out.println();
        System.out.println(vehicle.maxDistance(100, 4.7f,4));





/* My solution for Vehicle
        Vehicle vehicle = new Vehicle(70f, 7f, 0);
        vehicle.maxDistance();

        System.out.println();*/

        //Additional task, my solution
        /*Object car maxDistance method works
        (just only if I pass values in both lines as bellow
        and I couldn't find out what wrong I did
        Car car = new Car(70f, 7f, 0, false);
        car.maxDistance(70f, 7f, 0, false);*/

    }
}
