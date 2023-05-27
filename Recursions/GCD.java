package Recursions;

public class GCD {
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
        // (12, 34) => (34,12)
        // (34,12) => (12, 10)
        // (12, 10) => (10, 2)
        // (10, 2) => (2, 0)
        // a = 2
    }
    public static void main(String[] args) {
        // write a code for finding the gcd of two numbrs
        int a = 12;
        int b = 34;
        int gcd = gcd(a, b);
        System.out.println(gcd);
    }
}
