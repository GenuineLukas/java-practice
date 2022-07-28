package Exception;

public class ExceptionApp {
    public static void main(String[] args) {
        int[] intArr = {1, 2, 3, 4, 5};
        try {
            System.out.println(intArr[5]);
        } catch(ArrayIndexOutOfBoundsException e) {
            //getMessage() shows you the reason for exception.
            System.out.println("The array is too short for your value " + "... reason: " + e.getMessage());
            //printStackTrace() shows you the original error message you would have gotten without the try-catch.
            //this is important because it makes it easier for you to realize there was an error by popping up with red color.
            e.printStackTrace();
        }
        System.out.println(1);
        try {
            System.out.println(2/0);
        } catch (ArithmeticException e) {
            System.out.println("Any number is indivisible by 0 " + "...reason: "  + e.getMessage());
            e.printStackTrace();
        }
        // When you use try-catch, the next code will be executed.
        System.out.println(3);
    }
}
