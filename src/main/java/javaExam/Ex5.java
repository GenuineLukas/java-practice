package javaExam;
import java.util.Scanner;
/*
for문을 이용해서 주어진 배열의 항목에서 최대값을 구해보세요.
 */
public class Ex5 {
    public static void main(String[] args) {
        int max = 0;
        int[] arr = {1, 5, 3, 8, 2};

        for(int i = 1; i<arr.length; i++) {
            if (arr[i - 1] < arr[i]){
                max = arr[i];
            }
        }
        System.out.println("max: " + max);

/*
중첩 for문을 이용해서 주어진 배열의 전체 항목의 합과 평균값을 구해보세요.
 */
        int[][] array = {
                {95, 86},
                {83, 92, 96},
                {78, 83, 93, 87, 88}
        };

        int sum = 0;
        int num = 0;
        double avg = 0.0;

        for(int i = 0; i < array.length; i++) {
            for (int k = 0; k < array[i].length; k++) {
                sum += array[i][k];
                if (k == array[i].length - 1) {
                    num += k + 1;
                }
            }
            avg = (double)sum / num;
        }
        System.out.println("sum: " + sum);
        System.out.println("average: " + avg);

/*
키보드로부터 학생 수와 각 학생들의 점수를 입력받아서, 최고 점수 및 평균 점수를 구하는 프로그램을 만들어 보세요.
 */
        boolean run = true;
        int studentNum = 0;
        int[] scores = null;
        Scanner scanner = new Scanner(System.in);

        while(run) {
            System.out.println("------------------------------------------------------");
            System.out.println("1. 학생 수 | 2. 점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
            System.out.println("------------------------------------------------------");
            System.out.println("선택> ");

            int selectNo = Integer.parseInt(scanner.nextLine());

            if(selectNo == 1) {
                System.out.println("Please insert the number of students: ");
                studentNum = Integer.parseInt(scanner.nextLine());
                System.out.println("학생 수> " + studentNum);
                scores = new int[studentNum];
            } else if(selectNo == 2) {
                System.out.println("Please insert the score of students one by one: ");
               for(int i = 0; i < scores.length; i++) {
                   System.out.println("score of student No." + (i + 1) + ": ");
                   scores[i] = Integer.parseInt(scanner.nextLine());
               }
            } else if(selectNo == 3) {
                for (int i = 0; i < scores.length; i++) {
                    System.out.println("scores[" + i + "]>" + scores[i]);
                }
            } else if(selectNo == 4) {
                int maxScore = 0;
                int sumScore = 0;
                for(int i = 0; i < scores.length; i++) {
                    maxScore = (maxScore < scores[i]) ? scores[i] : maxScore;
                    sumScore += scores[i];
                }
                System.out.println("최고 점수: " + maxScore);
                System.out.println("평균 점수: " + (double)sumScore/studentNum);

            } else if(selectNo == 5) {
                run = false;
            }
        }
        System.out.println("프로그램 종료");
    }
}

