class Phone {
    String model;
    String color;
    int price;

    //constructor
    // if you want to autogenerate the constructor,
    // cmmd + N ----> select constructor, then select the field you want to include in the constructor.
    public Phone(String model, String color, int price) {
        this.model = model;
        this.color = color;
        this.price = price;
    }
}

class Calculation {
    int add( int x, int y) {
        int result = x + y;
        return result;
    }

    int subtract( int x, int y) {
        int result = x - y;
        return result;
    }
}
    // 붕어빵 틀 = class
    // 붕어빵 = instance
    //how to make a method.
    /*
     returnType methodName (type parameterName,type parameterName, ...){
     codeToBeExecuted
     }

   * although the names of the local variables are the same,
   * it's okay as long as they are used in different methods.
   */

    //** how to make a  constructor ( Nothing to return, the name hs to be the same with the class name)
/*  className (type parameterName, type parameterName, ...){
    codeToBeExecuted
    Initializing code of the parameters
    }
 */

public class Main {
    public static void main(String[] args) {
        //making an instance for the class Phone
        Phone galaxy = new Phone("Galaxy10", "Black", 1000);

        Phone iphone = new Phone("iPhoneX", "Black", 2000);

        System.out.println("Chulsu bought " + galaxy.model + " " + galaxy.color +" color " + "for $" + galaxy.price + ".");
        System.out.println("Yeonghui bought " + iphone.model + " " + iphone.color +" color " + "for $" + iphone.price + ".");

        //making an instance for the class Calculation
        Calculation calculation = new Calculation();
        int addCalc = calculation.add(100, 50); //150
        int subtractCalc = calculation.subtract(100, 50); //50
        System.out.println("the addition of the two numbers is " + addCalc + ".");
        System.out.println("the substraction of the two number is " + subtractCalc + ".");
    }
}




