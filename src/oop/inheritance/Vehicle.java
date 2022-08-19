package oop.inheritance;

public class Vehicle {
    //public final class Vehicle, due to "final" would not allow to add subclasses

    //Fields
    protected String brand; //we use protected access modifier when there will subclasses

    //Methods
    public void honk (){
        System.out.println("Tuut tuut");
        System.out.println("My brand is " + brand);
    }
}

class Bike extends Vehicle{

    public void honk(){ //method overriding
        System.out.println("Pfffff");
        System.out.println("My brand is " + brand);
    }

    public static void main(String[] args) {
        Bike bike = new Bike();
        bike.honk();
        bike.brand = "Volvo";
        bike.honk(); //calling to parent class Vehicle
    }
}
