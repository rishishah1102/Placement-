package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Problem15 {
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        if (nums.length > 3000 || nums.length < 3) {
            return list;
        }

        Arrays.sort(nums);
        HashSet<List<Integer>> set = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {
                if (nums[i] + nums[left] + nums[right] == 0) {
                    List<Integer> triplet = new ArrayList<>();

                    triplet.add(nums[i]);
                    triplet.add(nums[left]);
                    triplet.add(nums[right]);
                    if (set.contains(triplet)) {
                        triplet.clear();
                    } else {
                        set.add(triplet);
                    }
                    left++;
                }
                if (nums[i] + nums[left] + nums[right] > 0) {
                    right--;
                }
                if (nums[i] + nums[left] + nums[right] < 0) {
                    left++;
                }
            }
        }

        list.addAll(set);

        return list;
    }

    public static void main(String[] args) {
        int nums[] = { 41204, 6323, 5021, 27767, -18684, 89279, 16935, -10093, -9753, -5202, 83041, 9491, 35206, -3786,
                25148, -989, 1290, 68246, -13583, -3574, -8125, -2680, 80013, 47302, -8711, 45233, 5497, 13996, -8707,
                47314, -2186, -10619, 88611, 12427, -6094, 99030, 87592, 64055, 15913, 33051 };

        System.out.println(threeSum(nums));
    }
}
