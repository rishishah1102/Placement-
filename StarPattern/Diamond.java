package StarPattern;

public class Diamond {
    public static void main(String[] args) {
        System.out.println();
        int n = 4;
        for (int i = 0; i < n; i++) {
            for (int j = n - 1; j > 0; j--) {
                if (j > i) {
                    System.out.print(" ");
                }
                else {
                    System.out.print("*");
                }
            }
            System.out.print("*");
            for (int j = 0; j < n; j++) {
                if (j < i) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1; j++) {
                if (j > i) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.print("*");
            for (int j = n - 2; j > i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }
}
