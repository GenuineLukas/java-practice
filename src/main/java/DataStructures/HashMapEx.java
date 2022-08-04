package DataStructures;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx {
    public static void main(String[] args) {
        // to initialize the map, you have to initialize the type of both key and value.
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "apple"); //you don't add something to map, you "put" it to the map.
        map.put(2, "berry");
        map.put(3, "cherry");

        System.out.println(map); //prints {1=apple, 2=berry, 3=cherry}

        System.out.println("1st in map: " + map.get(1));

        map.remove(2); // you remove an element in map using "key".
        System.out.println(map);
        // you can see if an element is in the map by using either key or value.
        System.out.println("Is there key 2 in the Hashmap? " + map.containsKey(2));
        System.out.println("Is there cherry in the Hashmap? " + map.containsValue("cherry"));

        map.clear();
        System.out.println(map); //prints {}
    }
}
