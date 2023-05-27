package NumberPattern;

public class PalindromicNumber {
    public static void main(String[] args) {
        // Palindromic Number Pyramid
        for (int i = 1; i <= 4; i++) {
            for (int j = 4; j >= 1; j--) {
                if (j <= i) {
                    System.out.print(j);
                } else {
                    System.out.print(" ");
                }
            }
            byte j = 1;
            if (i > j) {
                for (j = 2; j <= i; j++) {
                    System.out.print(j);
                }
            }
            System.out.println();
        }

        System.out.println();
    }
}
