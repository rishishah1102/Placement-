package Recursions;

public class Subset {
    public static void subset(String s, String result) {
        if (s.length() == 0) {
            System.out.println(result);
            return;
        }
        System.out.println(result);
        for (int i = 0; i < s.length(); i++) {
            String newStr = s.substring(i+1);
            subset(newStr, result + s.charAt(i));
        }
    }

    public static void main(String[] args) {
        int n = 4;
        String s = "";
        for (int i = 1; i <= n; i++) {
            s = s + i;
        }

        subset(s, "");
    }
}
