package SingletonPractice;

public class SingletonExample {
    public static void main(String[] args) {
        /*
        // this (below) cannot be done because the whole purpose of Singleton
        // is to force people to create the new object through only one way,
        // meaning people are not allowed to create the objects with the "new" keyword
        // as they would normally do.

        Singleton obj1 = new Singleton();
         */

        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();

        // below is to show that objects created by Singleton.getInstance() are
        // the same objects in the heap.

        if (obj1 == obj2) {
            System.out.println("The object 1 and the object 2 are the same objects");
        }
        else {
            System.out.println("The object 1 and the object 2 are NOT the same objects");
        }
    }
}
