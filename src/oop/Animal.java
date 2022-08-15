package oop;

public class Animal {

    //Fields
    private String type;
    private String breed;
    private float weight;
    private int avgLifeSpan;


    //Creating custom constructor instead of using setter method
    //we must name it as the Class name of that file
    public Animal (String type, String breed, float weight, int avgLifeSpan){
        this.type = type;
        this.breed = breed;
        this.weight = weight;
        this.avgLifeSpan =avgLifeSpan;
    }

    //In case i.e. life span is not mandatory field we create new constructor
    public Animal (String type, String breed, float weight){
        this.type = type;
        this.breed = breed;
        this.weight = weight;
    }

    //empty method
    public Animal(){
    }

    public void setAvgLifeSpan(int avgLifeSpan){
        this.avgLifeSpan = avgLifeSpan;
    }


    //Method to print information
    public void printAnimalInfo(){
        System.out.println("Type: " + type);
        System.out.println("Breed: " + breed);
        System.out.println("Wight: " + weight + "kg");
        System.out.println("Average life span: " + avgLifeSpan + "years");
    }
}
