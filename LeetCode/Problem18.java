package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Problem18 {
    public static List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> list = new ArrayList<>();
        if (nums.length > 3000 || nums.length < 3) {
            return list;
        }

        Arrays.sort(nums);
        HashSet<List<Integer>> set = new HashSet<>();

        for (int i = 0; i < nums.length - 3; i++) {
            for (int j = i + 1; j < nums.length - 2; j++) {

                int left = j + 1;
                int right = nums.length - 1;

                while (left < right) {
                    if (nums[i] + nums[j] + nums[left] + nums[right] == target) {
                        List<Integer> fourplet = new ArrayList<>();

                        fourplet.add(nums[i]);
                        fourplet.add(nums[j]);
                        fourplet.add(nums[left]);
                        fourplet.add(nums[right]);
                        if (set.contains(fourplet)) {
                            fourplet.clear();
                        } else {
                            set.add(fourplet);
                        }
                        left++;
                    } else if (nums[i] + nums[j] + nums[left] + nums[right] < target) {
                        left++;
                    }
                    else {
                        right--;
                    }
                }
            }
        }

        list.addAll(set);

        return list;
    }

    public static void main(String[] args) {
        int nums[] = { 1000000000, 1000000000, 1000000000, 1000000000 };
        int target = 1;
        System.out.println(fourSum(nums, target));
    }
}
