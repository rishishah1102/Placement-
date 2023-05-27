// Program to reverse a string.

package StringProblems;

public class ReverseString {
    public static void main(String[] args) {
        String s1 = "abcdefghijklmnopqrstuvwxyz";

        StringBuilder revstr = new StringBuilder(s1);

        int lastIndex = s1.length() - 1;
        for (int i = 0; i < s1.length() / 2; i++) {
            char temp = s1.charAt(i);

            revstr.setCharAt(i, revstr.charAt(lastIndex));
            revstr.setCharAt(lastIndex, temp);

            lastIndex--;
        }

        System.out.println("The reversed string is: " + revstr);
    }
}
