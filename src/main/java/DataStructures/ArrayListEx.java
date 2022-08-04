package DataStructures;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListEx {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(4);
        arrayList.add(2);
        arrayList.add(1);
        arrayList.add(5);
        arrayList.add(3);
        System.out.println(arrayList);
        //sorting the list using Collections.sort() in ascending order.
        Collections.sort(arrayList);
        System.out.println(arrayList);
        //removing an element in the list.
        //What is inside remove method is an "index" of an element.
        arrayList.remove(4);
        System.out.println(arrayList);
        //iterating through the list. uses size().
        //to get an element, use get().
        for(int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }
        //for-each loop does the same thing as above.
        for(int current: arrayList) {
            System.out.println(current);
        }
    }
}
