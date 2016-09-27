package Sort.Insert;

import Sort.SortUtil;

import static Sort.SortUtil.printArr;

/**
 * Created by duoyang on 16/9/20.
 */
public class InsertSort {

    public static void main(String[] args) {
        int[] arr = new int[]{69, 345, 567, 897, 345, 2, 2, 4, 6767, 456, 2, 865, 2, 1, 45, 6, 757, 8};
        printArr(arr, 0, arr.length);
        doSort(arr);
        printArr(arr, 0, arr.length);
    }

    private static void doSort(int[] arr) {
        if (arr == null) return;
        int length = arr.length;

        for (int i = 1; i < length; i++) {
            for (int j = i; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    SortUtil.swap(arr, j - 1, j);
                }
            }
        }
    }

}
