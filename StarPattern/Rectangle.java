package StarPattern;

public class Rectangle {
    public static void main(String[] args) {
        // Pattern for solid rectangle
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }

        System.out.println('\n');

        // Pattern for hollow rectangle
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 5; j++) {
                // To target boundary values we have below code.
                if (i == 1 || i == 4 || j == 1 || j == 5) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }

        System.out.println('\n');
    }
}
