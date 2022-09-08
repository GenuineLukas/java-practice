package javaExam;

public class Ex4 {
    public static void main(String[] args) {
        int[] scores = new int[]{83, 90, 87};
        System.out.println(add(scores));
    }

    public static int add(int[] intArr) {
        int sum = 0;
        for(int i=0; i < intArr.length; i++) {
            sum += intArr[i];
        }
        return sum;
    }
}
