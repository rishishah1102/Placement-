package Recursions;

import java.util.Scanner;

public class Power {
    public static int power(int n, int x) {
        if (x == 0) {
            return 0;
        }
        if (n == 0) {
            return 1;
        }
        return x * power(n - 1, x);
    }

    public static int power2(int n, int x) {
        if (x == 0) {
            return 0;
        }
        if (n == 0) {
            return 1;
        }
        if (n % 2 == 0) {
            return power2(n / 2, x) * power2(n / 2, x);
        } else {
            return power(n / 2, x) * power(n / 2, x) * x;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        // x^n with stack height of n
        int power = power(n, 2);
        System.out.println(power);

        // x^n with stack height of logn
        int power2 = power2(n, 2);
        System.out.println(power2);

    }
}
