package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class Problem22 {

    public static List<String> list = new ArrayList<>();

    public static void backTrackGp(String result, int openbr, int closebr, int n) {

        if (result.length() == n * 2) {
            list.add(result);
            return;
        }

        if (openbr < n) {
            backTrackGp(result + "(", openbr + 1, closebr, n);
        }

        if (closebr < openbr) {
            backTrackGp(result + ")", openbr, closebr + 1, n);
        }
    }

    public static List<String> generateParenthesis(int n) {
        list.clear();
        backTrackGp("", 0, 0, n);
        return list;
    }

    public static void main(String[] args) {
        int n = 2;

        System.out.println(generateParenthesis(n));
    }
}
