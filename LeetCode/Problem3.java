package LeetCode;

import java.util.HashMap;

public class Problem3 {
    public static int lengthOfLongestSubstring(String s) {
        if (s.length() == 0) {
            return 0;
        }

        int max = 0;

        HashMap<Character, Integer> map = new HashMap<>();

        int start = 0;

        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                if (map.get(s.charAt(i)) >= start) {
                    start = map.get(s.charAt(i)) + 1;
                }
                map.put(s.charAt(i), i);
            } else {
                map.put(s.charAt(i), i);
            }
            max = Math.max(i - start + 1, max);
        }

        return max;
    }

    public static void main(String[] args) {
        String str = "abcabcbb";

        System.out.println(lengthOfLongestSubstring(str));
    }
}
