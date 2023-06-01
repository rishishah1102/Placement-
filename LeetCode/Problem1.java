package LeetCode;

import java.util.HashMap;

public class Problem1 {

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }

        for (int i = 0; i < nums.length; i++) {
            int temp = target - nums[i];

            // Finding if there exist a value of target - nums[i] and also i map.get and i should not be same otherwise the element would be same only.
            if (map.containsKey(temp) && map.get(temp) != i) {
                return new int[] { i, map.get(temp) };
            }
        }

        return null;
    }

    public static void main(String[] args) {
        int[] nums = { 3, 3 };
        int target = 6;

        System.out.println(twoSum(nums, target));

    }
}

/* for (int key: map.keySet()) {} */