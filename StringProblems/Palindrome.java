// Check whether the string is palindrome or not?

package StringProblems;

public class Palindrome {
    public static void main(String[] args) {
        String s1 = "abcdba";

        int lastIndex = s1.length() - 1;
        int isPalindrome = 0;

        for (int i = 0; i < s1.length()/2; i++) {
            if (s1.charAt(i) != s1.charAt(lastIndex)) {
                System.out.println("Not Palindrome");
                isPalindrome = -1;
                break;
            }
            lastIndex--;
        }
        if (isPalindrome != -1) {
            System.out.println("Palindrome");
        }
    }
}
