package StringProblems;

public class RemoveDuplicatesFromString {

    public static String newStr = "";

    public static void removeDuplicates(String str, int index4, boolean arr[]) {
        if (index4 == str.length()) {
            System.out.println(newStr);
            return;
        }
        int curr = str.charAt(index4) - 'a';
        if (!arr[curr]) {
            newStr = newStr + str.charAt(index4);
            arr[curr] = true;
        }
        removeDuplicates(str, index4 + 1, arr);
    }

    public static void main(String[] args) {

        // Remove duplicates from string
        String str3 = "djhvjznjkvnasjkl";
        boolean arr[] = new boolean[26];
        for (int i = 0; i < 26; i++) {
            arr[i] = false;
        }
        removeDuplicates(str3, 0, arr);
    }
}