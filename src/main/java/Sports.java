// Overriding: changing the method initially inherited from the parent class.
// To be considered as overriding...
// 1. The name of the method should be the same with the parent's.
// 2. names of the parameters should be the same.
// 3. The return type of the method should be the same as the parent's.

// code below is an example of the override.
// the method in the parent class is not working anymore.
class Sports {
    int initialSpeed;
    int finalSpeed;


    public void getAverageSpeed() {
        int averageSpeed = (initialSpeed + finalSpeed) / 4;
        System.out.println(averageSpeed);
    }
}

class Baseball extends Sports {

    public void getAverageSpeed() {
        int averageSpeed = (initialSpeed + finalSpeed) / 2;
        System.out.println(averageSpeed);
    }

    public static void main(String[] args) {

    Sports baseball = new Sports();
    baseball.initialSpeed = 130;
    baseball.finalSpeed = 110;
    baseball.getAverageSpeed();
    }
}







