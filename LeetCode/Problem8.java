package LeetCode;

public class Problem8 {
    public static int myAtoi(String str) {
        int len = str.length();

        if (len == 0) {
            return 0;
        }

        int index = 0;

        // skipping white spaces
        while (index < len && str.charAt(index) == ' ') {
            ++index;
        }

        boolean isNegative = false;

        // to handle sign cases
        if (index < len) {
            if (str.charAt(index) == '-') {
                isNegative = true;
                ++index;
            } else if (str.charAt(index) == '+') {
                ++index;
            }

        }

        int result = 0;

        while (index < len && Character.isDigit(str.charAt(index))) {

            int digit = str.charAt(index) - '0';

            // to avoid integer overflow
            double temp = (double)(result * 10.0) + digit;
            
            if (temp > Integer.MAX_VALUE) {
                return isNegative ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            }

            // adding digits at their desired place-value
            result = (int) temp;

            ++index;
        }

        return isNegative ? -result : result;
    }

    public static void main(String[] args) {
        String s = "-91283472332";

        System.out.println(myAtoi(s));
    }
}
