package Recursions;

import java.util.Scanner;

public class Fibonnaci {
    public static int fibonnaci(int n) {
        if (n == 0 || n == 1) {
            return 0;
        } else if (n == 2) {
            return 1;
        }
        return fibonnaci(n - 1) + fibonnaci(n - 2);
    }
    public static void main(String[] args) {
        System.out.print("Enter a number you want fibonnaci series upto : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        // Fibonnaci
        int fibnum = fibonnaci(n);
        System.out.println(fibnum);
    }
}
