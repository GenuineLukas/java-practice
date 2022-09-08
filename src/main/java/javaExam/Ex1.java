package javaExam;

import java.util.Scanner;

public class Ex1 {
    /*
    키보드로 두 실수를 다음과 같이 입력받습니다(Scnner 이용). 입력된 첫 번쨰 수에 두 번째 수를 나눈 결과를
    "결과:값"으로 출력하되, 두 번째 수에 0 또는 0.0이 입력되었을 경우 "결과:무한대"가 출력되도록 코드를
    작성해 보세요 (Scanner의 next()) 사용.

    첫 번쨰 수: 7.3
    두 번째 수: 2.5
   ---------------
   결과:2.92 (or 결과:무한대)
     */
    static double result; // made the variable result static so I can use it throughout the entire code.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the numerator: ");
        int firstNum = scanner.nextInt();
        System.out.println("Enter the denominator: ");
        int secondNum = scanner.nextInt();

        System.out.println("결과: " + exceptionDealer(divide(firstNum, secondNum)));
    }

    public static double divide(double a, double b) {
        result = (b == 0) ? 0.0 : a / b;
        return result;
    }

    public static String exceptionDealer(double d) {
        if (d == 0.0) {
            return "무한대";
        }
        return String.valueOf(result);
    }
}
