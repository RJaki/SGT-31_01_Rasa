package collections;

import java.util.LinkedList;
import java.util.Queue;

public class QueueInterface {
    public static void main(String[] args) {

        //Adding elements 2options: Queue or offer
        Queue<String> car = new LinkedList<>();
        car.add("Volvo");
        System.out.println(car);

        car.offer("Toyota");
        System.out.println(car);
        System.out.println(car.offer("Toyota")); //gives true or false
        System.out.println(car);

        System.out.println(car.peek());
        System.out.println(car);

        System.out.println(car.poll());
        System.out.println(car);



    }
}
