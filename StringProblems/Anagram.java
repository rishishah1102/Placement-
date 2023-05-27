// Check whether the string is anagram or not? The anagram means 

package StringProblems;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String s = "LISTEN";

        String s2 = "SILENT";

        if (s.length() != s2.length()) {
            System.out.println("The string is not anagram");
            return;
        }

        char arr[] = new char[s.length()];
        char arr2[] = new char[s2.length()];

        for (int i = 0; i < s.length(); i++) {
            arr[i] = s.charAt(i);
            arr2[i] = s2.charAt(i);
        }

        Arrays.sort(arr, 0, arr.length);
        Arrays.sort(arr2, 0, arr2.length);
        boolean isanagram = Arrays.equals(arr, arr2);
        if (!isanagram) {
            System.out.println("The String is not anagram");
            return;
        }
        System.out.println("The String is anagram");
    }
}
