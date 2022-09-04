package DSACourse;

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of which you want to get factorial: ");
        int inputData = Integer.parseInt(scanner.nextLine());
        System.out.println("The factorial attained using recursion method is " + recursiveFactorial(inputData));
        System.out.println("The factorial attained using recursion method is " + iterativeFactorial(inputData));
    }
    public static int recursiveFactorial(int num) {
        if(num == 0) {
            //a recursion needs a certain condition to break itself.
            return 1; //base case / breaking condition.
        }
        return num * recursiveFactorial(num - 1);
    }

    public static int  iterativeFactorial(int num) { // static because we are calling if from main method.
        if (num == 0) {
            return 1;
        }
        int factorial = 1;
        for(int i = 1; i <= num; i++) {
            factorial *= i;
        }
        return factorial;
    }
}
