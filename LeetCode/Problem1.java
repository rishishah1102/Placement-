package LeetCode;

import java.util.HashMap;
import java.util.Map;

public class Problem1 {

    public static void main(String[] args) {
        int[] nums = { 3, 3 };
        int target = 6;

        HashMap<Integer, Integer> map1 = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int temp = target - nums[i];

            // Finding if there exist a value of target - nums[i]
            if (map1.containsValue(temp)) {
                for (Map.Entry<Integer, Integer> e : map1.entrySet()) {
                    if (e.getValue() == temp) {
                        System.out.println("[" + e.getKey() + ", " + i + "]");
                    }
                }
                break;
            }
            map1.put(i, nums[i]);
        }
    }
}

/* for (int key: map.keySet()) {} */