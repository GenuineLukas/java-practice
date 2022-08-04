package DataStructures;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class HashSetEx {
    public static void main(String[] args) {
        Set<Integer> integerSet = new HashSet<>();
        integerSet.add(1);
        integerSet.add(3);
        integerSet.add(2);
        integerSet.add(9);
        System.out.println(integerSet); // we can see Set does not keep the order.

        Set<String> stringSet = new HashSet<>();
        stringSet.add("LA");
        stringSet.add("San Francisco");
        stringSet.add("LasVegas");
        stringSet.add("New York");
        stringSet.add("Seoul");
        System.out.println(stringSet); // also does not keep the order here.

        // to remove an element in a set, you have to specify the element
        // because the Set doesn't have the order in element, making it impossible for us to direct an element by index.
        stringSet.remove("Seoul");
        System.out.println(stringSet);

        ArrayList<String> target = new ArrayList<String>();
        target.add("New York");
        target.add("LasVegas"); // inserting elements I want to remove in an ArrayList.
        stringSet.removeAll(target);// in removeAll, all the collections can come in.
        System.out.println(stringSet);

        //we can also see if a collection contains certain elements in it.
        System.out.println("Is there LA in it? " + stringSet.contains("LA"));
        System.out.println("Is there Seoul in it?" + stringSet.contains("Seoul"));

        //getting the HashSet's size.
        System.out.println("The size of the HashSet is " + stringSet.size());

        //getting rid of all the elements in the set.
        stringSet.clear();
        System.out.println(stringSet); // returns an empty set.
    }
}
