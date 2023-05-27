package StarPattern;

public class HalfRightPyramid {
    public static void main(String[] args) {

        // Pattern for half pyramid (right)
        for (int i = 1; i <= 4; i++) {
            // for (int j = 1; j <= 4; j++) {
            // if (j > i) {
            // System.out.print(" ");
            // } else {
            // System.out.print("*");
            // }
            // }

            // Another Way
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println('\n');

        // Pattern for inverted half pyramid (right)
        for (int i = 4; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println('\n');
    }
}
