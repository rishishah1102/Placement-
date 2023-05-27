package LeetCode;

public class Problem9 {
    public static boolean isPalindrome(int x) {
        if (x > Integer.MAX_VALUE || x < 0) {
            return false;
        }

        int revnum = 0;
        int num = x;

        while (x != 0) {
            int remainder = x % 10;
            int temp = revnum * 10 + remainder;
            if ((temp - remainder) / 10 != revnum) {
                return false;
            }
            revnum = temp;
            x = x / 10;
        }

        if (revnum !=  num) {
            return false;
        }
        
        return true;
    }
    
    public static void main(String[] args) {
        int x = -123321;

        System.out.println(isPalindrome(x));
    }
}
