package LeetCode;

import java.util.LinkedList;

public class Problem28 {
    public static int strStr(String haystack, String needle) {

        int idx = -1;
        LinkedList<Integer> list = new LinkedList<>();

        for (int i = 0; i < haystack.length(); i++) {
            if (haystack.charAt(i) == needle.charAt(0)) {
                list.add(i);
            }
        }

        if (list.isEmpty()) {
            return -1;
        }

        for (int i = 0; i < list.size(); i++) {
            int j = list.get(i);
            if (j + needle.length() > haystack.length()) {
                return -1;
            }
            if (haystack.substring(j, j + needle.length()).equals(needle)) {
                idx = j;
                break;
            }

        }

        return idx;
    }

    public static void main(String[] args) {
        String haystack = "a";
        String needle = "a";

        System.out.println(strStr(haystack, needle));
    }
}
