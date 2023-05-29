package Recursions;

// Place tiles of size 1xm in a floor of size nxm
public class Tiles {

    public static int tiles(int n, int m, int count) {
        if (n == m) {
            return count + 2;
        }
        if (n < m) {
            return count + 1;
        }

        // Vertical + horizontal placements
        return tiles(n - m, m, count) + tiles(n - 1, m, count);
    }

    public static void main(String[] args) {

        int n = 4;
        int m = 3;

        System.out.println(tiles(n, m, 0));
    }
}
