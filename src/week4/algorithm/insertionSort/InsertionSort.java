package week4.algorithm.insertionSort;

import java.util.Arrays;

public class InsertionSort {
    public int[] sort(int[] arr) {
        int i = 1;
        if (arr[i] < arr[i - 1]) {
            int temp = arr[i];
            arr[i] = arr[i - 1];
            arr[i - 1] = temp;
        }
        return arr;
    }


    public static void main(String[] args) {
        int[] arr = {8, 5, 6, 2, 4};
        InsertionSort is = new InsertionSort();
        int[] result = is.sort(arr);
        System.out.println(Arrays.toString(result));

    }
}
