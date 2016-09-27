package Sort.Merge;

import static Sort.SortUtil.printArr;

/**
 * Created by duoyang on 16/9/23.
 * 归并排序
 */
public class MergeSort {

    public static void main(String[] args) {
        int[] arr = new int[]{69, 345, 567, 897, 345, 2, 2, 4, 6767, 456, 2, 865, 2, 1, 45, 6, 757, 8};
        printArr(arr, 0, arr.length);
        int[] result = doSort(arr);
        printArr(result, 0, result.length);
    }

    public static int[] doSort(int[] arr) {
        if (arr == null || arr.length < 2) return null;
        int[] result = new int[arr.length];
        sort(arr, result, 0, arr.length - 1);
        return result;
    }

    static void merge_sort_recursive(int[] arr, int[] result, int start, int end) {
        if (start >= end)
            return;
        int len = end - start, mid = (len >> 1) + start;
        int start1 = start, end1 = mid;
        int start2 = mid + 1, end2 = end;
        merge_sort_recursive(arr, result, start1, end1);
        merge_sort_recursive(arr, result, start2, end2);
        int k = start;
        while (start1 <= end1 && start2 <= end2)
            result[k++] = arr[start1] < arr[start2] ? arr[start1++] : arr[start2++];
        while (start1 <= end1)
            result[k++] = arr[start1++];
        while (start2 <= end2)
            result[k++] = arr[start2++];
        for (k = start; k <= end; k++)
            arr[k] = result[k];
    }

    private static void sort(int[] arr, int[] result, int start, int end) {
        if (end <= start) return;

        int start1, end1, start2, end2, mid;
        mid = ((end - start) >> 1) + start;
        start1 = start;
        end1 = mid;
        start2 = mid + 1;
        end2 = end;

        sort(arr, result, start1, end1);
        sort(arr, result, start2, end2);

        int k = start;
        while (start1 <= end1 && start2 <= end2) {
            result[k++] = arr[start1] < arr[start2] ? arr[start1++] : arr[start2++];
        }

        while (start1 <= end1) {
            result[k++] = arr[start1++];
        }

        while (start2 <= end2) {
            result[k++] = arr[start2++];
        }

        for (k = start; k <= end; k++)
            arr[k] = result[k];

    }

}
