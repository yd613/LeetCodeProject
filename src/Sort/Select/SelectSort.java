package Sort.Select;

import Sort.SortUtil;

import static Sort.SortUtil.printArr;

/**
 * Created by duoyang on 16/9/27.
 */
public class SelectSort {

    public static void main(String[] args) {
        int[] arr = new int[]{69, 345, 567, 897, 345, 2, 2, 4, 6767, 456, 2, 865, 2, 1, 45, 6, 757, 8};
        printArr(arr, 0, arr.length);
        doSort(arr);
        printArr(arr, 0, arr.length);
    }

    public static void doSort(int[] arr) {
        int length;
        if (arr == null || (length = arr.length) < 2) return;

        for (int i = 0; i < length; i++) {
            int min = i;
            for (int j = i; j < length; j++) {
                if (arr[min] > arr[j]) min = j;
            }

            if (min != i) SortUtil.swap(arr, min, i);
        }
    }

}
