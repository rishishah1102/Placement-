package LeetCode;

public class Problem8 {
    public static int myAtoi(String s) {
        if (s.length() == 0 || s.length() > 200 || s.length() < 0) {
            return 0;
        }

        int i = 0;
        int digit = 0;
        boolean sign = true;

        while (i < s.length()) {
            if (Character.isDigit(s.charAt(i))) {
                digit = s.charAt(i) - '0' + 10 * digit;
                if (digit > Integer.MAX_VALUE / 10) {
                    return Integer.MAX_VALUE;
                }
            }
            if (s.charAt(i) == '+' || s.charAt(i) == '-') {
                sign = s.charAt(i) == '+' ? true : false;
            }
            if (s.charAt(i) == ' ') {
                continue;
            }
            if (!Character.isDigit(s.charAt(i))) {
                break;
            }
            i++;
        }

        if (!sign) {
            digit = (~(digit - 1));
            if (digit < Integer.MIN_VALUE / 10) {
                return Integer.MIN_VALUE;
            }
            return digit;
        }

        return digit;
    }

    public static void main(String[] args) {
        String s = "  42";

        System.out.println(myAtoi(s));
    }
}
