// Overloading: defining two or more methods having the same name in one class.
// To be considered as overloading...
// 1. the name of the methods should be the same.
// 2. the number of parameters or the types should be different.
class Overloading {

         /*
        * the code below is not an example of overloading.
        int add( int x, int y, int z) {
            return x + y + z;
             }

        long add( int a, int b, int c) {
            return a + b + c
            }
         */

    // code below can be considered as overloading.
    int add( int x, int y, int z) {
        return x + y + z;
    }

    int add( int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        Overloading overloading1 = new Overloading();
        System.out.println(overloading1.add(1, 2, 3)); //6
        System.out.println(overloading1.add( 4, 5)); //9
    }
}





