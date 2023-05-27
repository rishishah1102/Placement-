package LeetCode;

import java.util.Arrays;

public class Problem4 {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double median;

        int arr[] = new int[nums1.length + nums2.length];

        for (int i = 0; i < nums1.length; i++) {
            arr[i] = nums1[i];
        }

        int j = 0;

        for (int i = nums1.length; i < nums1.length + nums2.length; i++) {
            arr[i] = nums2[j];
            j++;
        }

        Arrays.sort(arr);

        if (arr.length % 2 == 0) {
            median = (arr[(arr.length / 2) - 1] + arr[arr.length / 2]) / 2.0;

            return median;
        }

        median = (double) (arr[((arr.length + 1)/2) - 1]);

        return median;
    }

    public static void main(String[] args) {
        int nums1[] = { 1, 2 };
        int nums2[] = { 3, 4 };

        System.out.println(findMedianSortedArrays(nums1, nums2));
    }
}
