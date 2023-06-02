package LeetCode;

import java.util.Arrays;

public class Problem16 {
    public static int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);

        int closeSum = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length - 2; i++) {
            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if (Math.abs(target - sum) < Math.abs(target - closeSum)) {
                    closeSum = sum;
                }
                if (sum < target) {
                    left++;
                } else {
                    right--;
                }
            }
        }

        return closeSum;
    }

    public static void main(String[] args) {
        int num[] = { -1, 2, 1, -4 };
        int target = 1;

        System.out.println(threeSumClosest(num, target));
    }
}
