package Solution4;

/**
 * Created by duoyang on 16/9/11.
 */
public class Solution4_2 {

    public static void main(String args[]) {
        Solution4_2 s = new Solution4_2();
        double d = s.findMedianSortedArrays(new int[]{}, new int[]{2, 3});
        System.out.println("d:" + d);
    }

    private double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if (nums1 == null && nums2 == null) return 0;

        int length1 = 0;
        int length2 = 0;
        if (nums1 != null) length1 = nums1.length;
        if (nums2 != null) length2 = nums2.length;

        return 0;
    }

}
