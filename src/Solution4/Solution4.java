package Solution4;

import java.util.*;

/**
 * Created by duoyang on 16/9/10.
 * <p>
 * There are two sorted arrays nums1 and nums2 of size m and n respectively.
 * <p>
 * Find the median of the two sorted arrays. The overall run time complexity should be O(log (m+n)).
 * <p>
 * Example 1:
 * nums1 = [1, 3]
 * nums2 = [2]
 * <p>
 * The median is 2.0
 * Example 2:
 * nums1 = [1, 2]
 * nums2 = [3, 4]
 * <p>
 * The median is (2 + 3)/2 = 2.5
 */
public class Solution4 {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int length1 = 0;
        int length2 = 0;

        if ((nums1 == null || nums1.length < 1)
                && (nums2 == null || nums2.length < 1))
            return 0;

        length1 = nums1 == null ? 0 : nums1.length;
        length2 = nums2 == null ? 0 : nums2.length;
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < length1; i++) {
            list.add(nums1[i]);
        }

        for (int i = 0; i < length2; i++) {
            list.add(nums2[i]);
        }

        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });

        if (list.size() % 2 == 1) {
            return list.get(list.size() / 2);
        } else {
            int index = (int) Math.floor(list.size() / 2);
            int a = list.get(index - 1);
            int b = list.get(index);
            return (double) ((a + b)) / 2;
        }
    }

    public static void main(String args[]) {
        Solution4 s = new Solution4();
        double d = s.findMedianSortedArrays(new int[]{}, new int[]{2, 3});
        System.out.println("d:" + d);
    }

}
