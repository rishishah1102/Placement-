package StringProblems;

import java.util.HashMap;
import java.util.Collections;

public class LongestSubsequence {
    public static void subsequence(String str, int index, String result, HashMap<Integer, String> map) {
        if (index == str.length()) {
            if (map.containsValue(result)) {
                System.out.println("c: " + result);
                return;
            }
            else {
                map.put(result.length(), result);
                System.out.println("ns: " + result);
                return;
            }
        }
        // character is included in subsequence
        subsequence(str, index + 1, result + str.charAt(index), map);
        // character is not included in subsequence
        subsequence(str, index + 1, result, map);
    }

    public static void main(String[] args) {
        // Print all the subsequences of a string.
        String str = "aaa";
        HashMap<Integer, String> map = new HashMap<>();

        subsequence(str, 0, "", map);
        
        int max = Collections.max(map.keySet());

        System.out.println(map.get(max));

        System.out.println();
    }
}