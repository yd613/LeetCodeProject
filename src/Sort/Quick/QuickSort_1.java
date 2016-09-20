package Sort.Quick;

import static Sort.SortUtil.printArr;
import static Sort.SortUtil.swap;

/**
 * 快速排序
 * Created by duoyang on 16/9/16.
 */
public class QuickSort_1 {

    public static void main(String args[]) {
        int[] arr = new int[]{69, 345, 567, 897, 345, 2, 2, 4, 6767, 456, 2, 865, 2, 1, 45, 6, 757, 8};
        printArr(arr, 0, arr.length);
        doSort(arr, 0, arr.length);
        printArr(arr, 0, arr.length);
    }

    private static void doSort(int[] arr, int start, int end) {
        if (arr == null || arr.length < 1) return;
        if (start >= end) return;

        int i = start;
        int j = end - 1;
        int k = arr[i];

        while (i < j) {
            for (; j > i; j--) {
                if (k > arr[j]) {
                    swap(arr, i, j);
                    break;
                }
            }

            for (; i < j; i++) {
                if (arr[i] > k) {
                    swap(arr, i, j);
                    break;
                }
            }
        }

        printArr(arr, start, end);
        if (i > start) doSort(arr, start, i);
        if (j < end) doSort(arr, j + 1, end);
    }

}
