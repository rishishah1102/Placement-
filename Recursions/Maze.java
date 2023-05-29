package Recursions;

public class Maze {
    public static int count = 0;
    public static void mazePath(int n, int m, int i, int j) {
        if (i == n - 1 && j == m - 1) {
            count++;
            return;
        }
        if (j == m - 1) {
            mazePath(n, m, i + 1, j);
            return;
        }
        if (i == n - 1) {
            mazePath(n, m, i, j + 1);
            return;
        }
        mazePath(n, m, i, j + 1);
        mazePath(n, m, i + 1, j);
    }

    public static void main(String[] args) {
        // Count the total paths in maze to move from (0,0) to (n,m). You can only moveright or downward.
        int n = 4;
        int m = 5;
        mazePath(n, m, 0, 0);
        System.out.println("The total paths to move from (0,0) to (" + n + "," + m + ") is " + count);
    }
}
