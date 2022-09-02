package collections;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        //Map consists of 2 values:  1st key and 2nd value. They can be any type of data.

        Map<String, Integer> map = new HashMap<>();// do not need to define HashMap<>() size in().

        //Add values to Map
        map.put("Bob", 900);
        map.put("John", 920);

        //Print out
        System.out.println(map);

        //Get value from key
        System.out.println("John's salary: " + map.get("John"));

        //All key values
        System.out.println(map.keySet()); //gives answer of: [Bob, John]

        //All values in map
        System.out.println(map.values()); //[Bob, John]

        //Size
        System.out.println(map.size());

        //Check is Map contains key
        System.out.println(map.containsKey("Tony")); //false
        System.out.println(map.containsKey("Bob")); //true

        //Check if Map contains value
        System.out.println(map.containsValue(1000)); //false
        System.out.println(map.containsValue(920)); //true

        //Remove key/value pair from Map if exists
        System.out.println(map.remove("Bob"));
        System.out.println(map);

        //Example
        Map<String, String> capitalCity = new HashMap<>();
        capitalCity.put("Estonia", "Tallin");
        capitalCity.put("Latvia", "Riga");
        capitalCity.put("Lithuania", "Vilnius");
        capitalCity.put("Fake Estonia", "Tallin");

        System.out.println(capitalCity.get("Lithuania")); //way to get value(in this case capital city

        //Iteration of capitalCity with for each loop
        //to do it we use "entry" what means one element of two
        for (Map.Entry<String,String> entry: capitalCity.entrySet()){
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }

        //Print out all values where value is Tallin
        for (Map.Entry<String,String> entry: capitalCity.entrySet()){
            if (entry.getValue().equals("Tallin")){
                System.out.println(entry.getKey());
            }
        }



    }
}
