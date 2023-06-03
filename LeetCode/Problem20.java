package LeetCode;

import java.util.Stack;

public class Problem20 {
    public static boolean isValid(String s) {
        if (s.length() == 1) {
            return false;
        }

        Stack<Character> stack = new Stack<>();
        stack.clear();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ')') {
                if (stack.isEmpty()) {
                    stack.push(s.charAt(i));
                } else if (stack.peek() == '(') {
                    stack.pop();
                } else {
                    stack.push(s.charAt(i));
                }
            } else if (s.charAt(i) == '}') {
                if (stack.isEmpty()) {
                    stack.push(s.charAt(i));
                } else if (stack.peek() == '{') {
                    stack.pop();
                } else {
                    stack.push(s.charAt(i));
                }
            } else if (s.charAt(i) == ']') {
                if (stack.isEmpty()) {
                    stack.push(s.charAt(i));
                } else if (stack.peek() == '[') {
                    stack.pop();
                } else {
                    stack.push(s.charAt(i));
                }
            } else if (s.charAt(i) == '>') {
                if (stack.isEmpty()) {
                    stack.push(s.charAt(i));
                } else if (stack.peek() == '<') {
                    stack.pop();
                } else {
                    stack.push(s.charAt(i));
                }
            } else {
                stack.push(s.charAt(i));
            }
        }

        if (stack.isEmpty()) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        String str = "]{";

        System.out.println(isValid(str));
    }
}
