package DSACourse;

public class BubbleSort {

    public static void main(String[] args) {

        int[] intArr = {20, 35, -15, 7, 55, 1, -22};
        System.out.println("the array before it's sorted: ");
        for (int i = 0; i < intArr.length; i++) {
            System.out.println(intArr[i]);
        }

        for (int lastUnSortedIndex = intArr.length - 1; lastUnSortedIndex > 0; lastUnSortedIndex--) {
            for (int i = 0; i < lastUnSortedIndex; i++) {
                if (intArr[i] > intArr[i + 1]) {
                    swap(intArr, i, i+1);
                }
            }
        }
        System.out.println("the array after it's sorted: ");
        for (int i = 0; i < intArr.length; i++) {
            System.out.println(intArr[i]);
        }
    }

    //sorting algorithms

    public static void swap(int[] arr, int i, int j) {
        // when the two contiguous elements are equivalent.
        if (i == j) {
            return;
        }
        //swapping algorithm here.
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
