package collections;

import java.util.ArrayList;

public class ListInterfaceExamples {
    public static void main(String[] args) {
        //Arraylist-class is a resizable array, which can be found in the java.until package

        //ArrayList Declaration
        ArrayList<String> car = new ArrayList<String>(); //<> must be used for ArrayList

        //Add elements
        car.add("Volvo");
        car.add("Mercedes");
        car.add("BMW");
        car.add("Jeep");
        car.add("Opel");

        //Print out all elements
        System.out.println(car);

        //Get elements by index
        System.out.println(car.get(0));

        //Add element at specific index, pvzkad Ford butu su indeksu 2
        car.add(2,"Ford");
        System.out.println(car);

        //Change element value
        car.set(3,"Toyota");
        System.out.println(car);

        //Remove element at specific index
        car.remove(5);
        System.out.println(car);

        //Size (how many elements)
        System.out.println(car.size());

        //Delete all elements
        car.clear();
        System.out.println(car);



    }
}
