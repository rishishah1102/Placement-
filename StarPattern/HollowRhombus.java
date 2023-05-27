package StarPattern;

public class HollowRhombus {
    public static void main(String[] args) {
        int n = 4;
        // Hollow Rhombus Right
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= n; j++) {
                if (j == 1 || j == n || i == 1 || i == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }

        System.out.println();

        // Hollow Rhombus Left
        for (int i = 1; i <= n; i++) {
            byte j = 1;
            if (i > j) {
                for (; j < i; j++) {
                    System.out.print(" ");
                }
            }
            for (j = 1; j <= n; j++) {
                if (j == 1 || j == n || i == 1 || i == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
