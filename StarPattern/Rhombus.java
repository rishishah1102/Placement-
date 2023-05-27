package StarPattern;

public class Rhombus {
    public static void main(String[] args) {
        // Print Rhombus right
        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= 6 - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 6; j++) {
                System.out.print("*");

            }
            System.out.println();
        }

        System.out.println();

        // Print Rhombus left
        for (int i = 1; i <= 6; i++) {
            byte j = 1;
            if (i > j) {
                for (; j < i; j++) {
                    System.out.print(" ");
                }
            }
            j = 1;
            for (; j <= 6; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
