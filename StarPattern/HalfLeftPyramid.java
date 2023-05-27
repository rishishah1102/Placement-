package StarPattern;

public class HalfLeftPyramid {
    public static void main(String[] args) {
        
        // Pattern for half pyramid (left)
        for (int i = 1; i <= 4; i++) {
            for (int j = 4; j >= 1; j--) {
                if (j <= i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        System.out.println('\n');

        // Pattern for inverted half pyramid (left)
        for (int i = 4; i >= 1; i--) {
            for (int j = 4; j >= 1; j--) {
                if (j <= i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
