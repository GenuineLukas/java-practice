package javaExam;
import java.lang.Math;
/*
WHile문과 Math.random() 메소드를 이용해서 2개의 주사위를 던졌을 때 나오는 눈을
(눈1, 눈2) 형태로 출력하고, 눈의 합이 5가 아니며 계속 주사위를 던지고, 눈의 합이 5이면
실행을 멈추는 코드를 작성해보세요. 눈의 합이 되는 조합은 (1,4), (2, 3), (3, 2), & (4, 1) 입니다.
 */

public class Ex3 {
    public static void main(String args[]) {
        System.out.println("NUMBER 1");
        while(true) {
            int x= (int)(Math.random()*6) + 1;
            int y= (int)(Math.random()*6) + 1;
            System.out.println("("+ x + ", " + y + ")");
            if( x + y == 5) {
                break;
            }
        }

/*
중첩 for문을 이룡하여 방정식 4x + 5y = 60 의 모든 해를 구해서 (x, y) 형태로
출력해보세요. 단, x와 y는 10 이하의 자연수 입니다.
 */
        System.out.println("NUMBER 2");
        int temp = 1;
        for (int x = 1; x <= 10; x++) {
            for (int y = 1;y <= 10; y ++) {
                if (4*x + 5*y == 60) {
                    System.out.println("4x + 5y 의 " + temp + "번째 해:" + "(" + x +", " + y + ")");
                    temp++;
                }
            }
        }

/*
for문을 이용해서 다음과 같이 출력하는 코드를 작성해보세요
*
**
***
****
 */
        System.out.println("NUMBER 3");

        for(int i = 1; i <= 4;i++) {
            for(int j = 1 ; j<= i; j++) {
                System.out.print("*");
                if(i == j) {
                    System.out.println();
                }
            }
        }
/*
for문을 이용해서 다음과 같이 출력하는 코드를 작성해보세요
   *
  **
 ***
****
 */
        System.out.println("NUMBER 4");
        for (int i = 1; i < 5; i++) {
            for(int j = 4; j > 0; j--) {
                if(i < j) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}



