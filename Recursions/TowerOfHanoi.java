package Recursions;

import java.util.Scanner;

public class TowerOfHanoi {
    public static void TOH(int n, String src, String helper, String dest) {
        if (n == 1) {
            System.out.println(n + " disk transferred from " + src + " to " + dest);
            return;
        }
        // This will transfer top disks from A to B
        TOH(n - 1, src, dest, helper);
        // This will transfer bottom disk from A to C
        System.out.println(n + " disk transferred from " + src + " to " + dest);
        // This will transfer the disks from B to C
        TOH(n - 1, helper, src, dest);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        // Tower of Hanoi
        TOH(n, "A", "B", "C");
    }
}
