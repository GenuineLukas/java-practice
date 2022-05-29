import java.sql.SQLOutput;

public class Start {
    public static void main(String[] args) {
        // the abbreviation for System.out.println() is
        //sout
        System.out.println("Hello World");

        int number = 5;
        System.out.println(number);

        String sparta = "Hello from Sparta";
        System.out.println(sparta);

        float floatingNumber = 7.9f;
        System.out.println(floatingNumber);

        Double doubleNumber = 1.00;
        System.out.println(doubleNumber);

        //assigning a final number
        //if you want to make a number as a constant throughout the system,
        //put "final" in front.
        final int finalNumber = 1;
        System.out.println(finalNumber);
        //you cannot change anything final
        //however, you can change other variables
        sparta = "Goodbye from Sparta";
        System.out.println(sparta);
    }
}
