package LeetCode;

public class Problem14 {
    public static String result = "";

    public static void lcp(String[] s, int index) {
        if (s.length == 1) {
            result = s[0];
            return;
        }
        
        char temp2 = '0';
        boolean issame = true;

        for (int i = 0; i < s[0].length(); i++) {
            for (int j = 0; j < s.length; j++) {
                String temp = s[j];

                if (j == 0) {
                    temp2 = temp.charAt(index);
                } else if (i == temp.length()) {
                    issame = false;
                    break;
                } else {
                    char temp3 = temp.charAt(index);

                    if (temp2 != temp3) {
                        issame = false;
                        break;
                    } else {
                        if (j == s.length - 1) {
                            result += temp2;
                            index++;
                        }
                    }
                }
            }
            if (!issame) {
                break;
            }
        }
    }

    public static String longestCommonPrefix(String[] strs) {
        result = "";
        lcp(strs, 0);
        return result;
    }

    public static void main(String[] args) {
        String str[] = { "dog" };

        System.out.println(longestCommonPrefix(str));
    }
}
