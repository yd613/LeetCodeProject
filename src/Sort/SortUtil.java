package Sort;

/**
 * Created by duoyang on 16/9/18.
 */
public class SortUtil {

    public static void printArr(int[] arr, int from, int end) {
        for (int i = from; i < end; i++) {
            System.out.print(arr[i] + ",");
        }
        System.out.println("");
    }


    public static void swap(int[] arr, int p1, int p2) {
        int temp = arr[p1];
        arr[p1] = arr[p2];
        arr[p2] = temp;
    }

}
