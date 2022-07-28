package Exception;

class ArrayCalculation {

    int[] arr = { 0, 1, 2, 3, 4 };

    // throws possible Exception in the method.
    public int divide(int denominatorIndex, int numeratorIndex) throws ArithmeticException, IndexOutOfBoundsException {
        return arr[denominatorIndex] / arr[numeratorIndex];
    }
}

public class ArrayCalculator {
    public static void main(String[] args) {
        ArrayCalculation arrayCalculation = new ArrayCalculation();

        System.out.println("2 / 1 = " + arrayCalculation.divide(2, 1));
        // using try-catch phrases, I handled the Exceptions that might occur.
        try {
            System.out.println("1 / 0 = " + arrayCalculation.divide(1, 0)); // java.lang.ArithmeticException: "/ by zero"
        } catch (ArithmeticException e) {
            System.out.print("Exception occurred: " + e.getMessage());
            System.out.println(" ... this calculation is not valid");
        }
        try {
            System.out.println("Try to divide using out of index element = "
                    + arrayCalculation.divide(5, 0)); // java.lang.ArrayIndexOutOfBoundsException: 5
        } catch (IndexOutOfBoundsException e) {
            System.out.print("Exception occurred: " + e.getMessage());
            System.out.println("...the highest index possible is " + (arrayCalculation.arr.length - 1) + ".");
        }
    }
}
