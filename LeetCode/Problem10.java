package LeetCode;

public class Problem10 {
    public static boolean isMatch(String s, String p) {
        if (s.length() > 20 || p.length() > 20 || s.length() < 1 || p.length() < 1 || p.length() < s.length()) {
            return false;
        }

        char temp = '\0';
        int i = 0, j = 0;

        while (j < s.length()) {
            if (i == p.length()) {
                return false;
            }
            if (p.charAt(i) == s.charAt(j) || p.charAt(i) == '*') {
                i++;
                j++;
            }
            if (p.charAt(i) == '.') {
                if (temp == '\0') {
                    temp = s.charAt(j);
                    i++;
                    j++;
                } else if (temp == s.charAt(j)) {
                    i++;
                    j++;
                } else {
                    return false;
                }
            }
            i++;
            j++;
        }

        return true;
    }

    public static void main(String[] args) {
        String s = "aab";
        String p = "c*a*b";

        System.out.println(isMatch(s, p));
    }
}
