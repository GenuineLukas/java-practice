package SingletonPractice;

public class Singleton {
    private static Singleton singleton = new Singleton();
    //make a constructor private as well
    private Singleton() {}
    //create a method only through which objects can be made.
    static Singleton getInstance() {
        return singleton;
    }
}


