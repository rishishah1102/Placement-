package StringProblems;

import java.util.HashSet;

public class UniqueSubsequence {
    public static void subsequence(String str, int index, String result, HashSet<String> set) {
        if (index == str.length()) {
            if (set.contains(result)) {
                return;
            } else {
                System.out.println(result);
                set.add(result);
                return;
            }
        }
        // character is included in subsequence
        subsequence(str, index + 1, result + str.charAt(index), set);
        // character is not included in subsequence
        subsequence(str, index + 1, result, set);
    }

    public static void main(String[] args) {
        // Print all the subsequences of a string.
        String str = "aaa";
        HashSet<String> set = new HashSet<>();
        subsequence(str, 0, "", set);
    }
}
