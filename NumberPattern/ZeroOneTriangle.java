package NumberPattern;

public class ZeroOneTriangle {
    public static void main(String[] args) {
        // 0-1 Triangle
        for (int i = 1; i <= 6; i++) {
            // for (int j = 1; j <= i; j++) {
            // if ((i%2 != 0 && j%2 != 0) || (i%2 == 0 && j%2 == 0)) {
            // System.out.print("1");
            // } else {
            // System.out.print("0");
            // }
            // }

            // Another method
            // for (int j = 1; j <= i; j++) {
            // if ((i + j) % 2 == 0) {
            // System.out.print("1");
            // } else {
            // System.out.print("0");
            // }
            // }

            // Another method
            boolean one;
            if (i % 2 == 0) {
                one = false;
            } else {
                one = true;
            }
            for (int j = 1; j <= i; j++) {
                if (one) {
                    System.out.print("1 ");
                    one = !one;
                } else {
                    System.out.print("0 ");
                    one = !one;
                }
            }
            System.out.println();
        }

        System.out.println();
    }
}