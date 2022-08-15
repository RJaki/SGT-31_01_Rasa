package oop;

import java.util.Scanner;

public class CallingCarClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Create a new object from Car class template
        //Set field values
        //Call printCarInfo method to check field values

        Car car1 = new Car(); //car1 is object
/*      car1.brand = "BMW";
        car1.maxSpeed = 208;
        //car1.color = "Black";   we could use this if in Car class fields would be public*/
        car1.setColor("Black"); //color is private therefore we need to call setter method
        car1.setBrand("Audi");
        car1.setMaxSpeed(200);

        car1.printCarInfo(); //car1 is object

        //Access individual fields
        //System.out.println("Max speed is " + car1.maxSpeed);
        System.out.println("Car's color is " + car1.getColor());
        System.out.println("Car's color is " + car1.getMaxSpeed());
        System.out.println("Car's color is " + car1.getBrand());

    }

}
