package NumberPattern;

public class FlyodTriangle {
    public static void main(String[] args) {
        // Flyod Triangle
        byte n = 1;
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(n++ + " ");
            }
            System.out.println();
        }

        System.out.println();
    }
}
