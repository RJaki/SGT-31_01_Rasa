package collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class SetInterfaceExample {
    public static void main(String[] args) {

        //It is not array, so there is no indexes
        //HashSet
        HashSet<String> names = new HashSet<>();

        //Adding elements
        names.add("Bob");
        names.add("Anna");
        names.add("Anna");
        names.add("Liam");

        //Print all elements
        System.out.println(names);

        //Remove
        names.remove("Bob");
        System.out.println(names);

        //Size
        System.out.println(names.size());

        //Contains->it returns true or false if set contains passed value
        System.out.println(names.contains("Liam"));
        System.out.println(names.contains("Bob"));

        //Iterate
        for (String str: names){
            System.out.println(str);
        }

        Iterator<String> i = names.iterator();// .iterator is inbuilded method
        while(i.hasNext()){ //checks if we have next element, then printout
            System.out.println(i.next());
        }

        //HashSet example 2

        HashSet<Integer> intSet1 = new HashSet<Integer>();
        intSet1.add(1);
        intSet1.add(2);
        intSet1.add(3);
        intSet1.add(4);

        System.out.println("insSet1: " + intSet1);

        HashSet<Integer> intSet2 = new HashSet<Integer>();
        intSet2.add(3);
        intSet2.add(4);
        intSet2.add(5);
        intSet2.add(6);

        System.out.println("intSet2: " + intSet2);

        //Find union
        HashSet<Integer> union = new HashSet<>(intSet1);
        System.out.println("Union: " + union);
        union.addAll(intSet2);
        System.out.println("Union: " + union); //gives combined list eliminating the same elements

        //Find intersection (retains dublicate/the same values; common values for both sets)
        HashSet<Integer> intersection = new HashSet<>(intSet1);
        intersection.retainAll(intSet2);
        System.out.println("intersection:" + intersection);

        //Find difference
        HashSet<Integer> difference = new HashSet<>(intSet1);
        difference.removeAll(intSet2);//removes set1 common elements with set2
        System.out.println("difference:" + difference);

        //LinkedHashSet (order remains as entered)
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("Latvia");
        linkedHashSet.add("Lithuania");
        linkedHashSet.add("Sweden");

        System.out.println(linkedHashSet);

        linkedHashSet.remove("Latvia");
        System.out.println(linkedHashSet);







    }
}
