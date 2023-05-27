package StringProblems;

public class SubsequenceOfString {
    public static void subsequence(String str, int index, String result) {
        if (index == str.length()) {
            System.out.println(result);
            return;
        }
        // character is included in subsequence
        subsequence(str, index + 1, result + str.charAt(index));
        // character is not included in subsequence
        subsequence(str, index + 1, result);
    }

    public static void main(String[] args) {
        // Print all the subsequences of a string.
        String str = "abc";
        subsequence(str, 0, "");

        System.out.println();
    }
}
