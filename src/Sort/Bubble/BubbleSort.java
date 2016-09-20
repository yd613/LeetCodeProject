package Sort.Bubble;

import Sort.SortUtil;

import static Sort.SortUtil.printArr;

/**
 * 冒泡排序
 * Created by duoyang on 16/9/18.
 */
public class BubbleSort {

    public static void main(String args[]) {
        int[] arr = new int[]{69, 345, 567, 897, 345, 2, 2, 4, 6767, 456, 2, 865, 2, 1, 45, 6, 757, 8};
        printArr(arr, 0, arr.length);
        doSort(arr);
        printArr(arr, 0, arr.length);
    }

    private static void doSort(int[] arr) {
        if (arr == null || arr.length < 1) return;
        int length = arr.length;

        for (int i = length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) SortUtil.swap(arr, j, j + 1);
            }
        }
    }

}
