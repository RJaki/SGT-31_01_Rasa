package oop;

public class Car {

    //1. Fields
    private String color;
    private String brand;
    private int maxSpeed;


    //2. Methods
    //Setter methods

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public void setColor(String color){     //setter method
        this.color = color;
    }

    //Getter methods

    public String getColor(){    //getter method do not setting anything therefore empty brackets
        return color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public String getBrand() {
        return brand;
    }

    public void printCarInfo(){
        System.out.println("Car info:");
        System.out.println("Brand: " + brand);
        System.out.println("Color: " + color);
        System.out.println("Maximum speed: " + maxSpeed);
    }


}
