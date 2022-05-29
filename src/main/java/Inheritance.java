public class Inheritance {
    //when ger inherited, only one class can be inherited.
}
class Animal {
    String name;

    public void cry() {
        System.out.println(name + " is crying.");
    }
}

class Dog extends Animal {

    Dog(String name) {
        this.name = name;
    }

    public void swim() {
        System.out.println(name + " is swimming!");
    }
    public void cry() {
        System.out.println( "the dog named " + name +" is crying.");
    }
}
class Activity {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Coco");
        dog1.cry();
        dog1.swim();

        Animal dog2 = new Dog("Mimi");
        dog2.cry();
    // the following code generates a compile error because when dog2
    // was initialized, the type was Animal, higher hierarchy in the inheritance.
//        dog2.swim(); // compile error
    }
}


