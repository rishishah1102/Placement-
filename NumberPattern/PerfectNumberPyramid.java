package NumberPattern;

public class PerfectNumberPyramid {
    public static void main(String[] args) {
        // Perfect Pyramid
        int n = 4;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * (i) - 1; j++) {
                System.out.print(i);
            }
            System.out.println();
        }

        System.out.println();
    }
}
