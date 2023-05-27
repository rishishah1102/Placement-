package LeetCode;

public class Problem7 {
    public static int reverse(int x) {
        if (x > Math.pow(2, 31) - 1 || x < (-Math.pow(2, 31))) {
            return 0;
        }

        int revnum = 0;

        while (x != 0) {
            int remainder = x % 10;
            int temp = revnum * 10 + remainder;
            if ((temp - remainder) / 10 != revnum) {
                return 0;
            }
            revnum = temp;
            x = x / 10;
        }

        return revnum;
    }

    public static void main(String[] args) {
        int num = 1534236469;

        System.out.println(reverse(num));
    }
}
