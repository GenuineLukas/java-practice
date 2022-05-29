public class Loops {
    public static void main(String[] args) {
        // generic for-loop
        // getting the sum of numbers from 1 to 10.
        int sum = 0;
        int sum1 = 0;
        int sum2 = 0;

        int i = 0;
        for (i = 0; i < 10; i++) {
            sum += (i + 1);
        }
        System.out.println(sum);

        // exactly the same loop but that this one skip adding 5.
        // continue; ignore the outer loop.
        for (i = 0; i < 10; i++) {
            if (i == 4) {
                continue;
            }
            sum1 += (i + 1);
        }
        System.out.println(sum1);

        // for-each loop
        // getting an individual element of an array by using for-
        String[] days = new String[]{"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        for (String day : days) {
            System.out.println(day);
        }

        // while loop
        // doing the same thing with the for loop above but
        // breaking the outer loop when j == 5
        int j = 0;
        while (j < 10) {
            if (j == 5) {
                break;
            }
            sum2 += (j + 1);
            j++;
        }
        System.out.println(sum2);

        // Loop quiz 1: get the sum of the numbers from 1 to 100.
        int k = 0;
        int sum_1to100 = 0;
        for (k = 0; k < 100; k++) {
            sum_1to100 += (k + 1);
        }
        System.out.println(sum_1to100);

        // Loop quiz 2: make a countdown starting from 5
        int r = 5;
        int countdown = 5;
        for (r = 0; r < 5; r++) {
            if (r == 0) {
                System.out.println(5);
            }
            countdown -= 1;
            System.out.println(countdown);
        }
        System.out.println("BAM!!!!");

        // Loop quiz 3: get the sum of odd and even numbers from 0 to 30
        // and print the two results separately.
        int oddSum = 0;
        int evenSum = 0;
        int p;

        for (p = 0; p < 30; p++) {
            int value = p + 1;
            if (value % 2 == 0) {
                evenSum += value;
            } else {
                oddSum += value;
            }
        }
        System.out.println("the sum of odd numbers is" + " " + oddSum + ".");
        System.out.println("the sum of even numbers is" + " " + evenSum + ".");

    }
}
