// Reverse a stack without using another stack

import java.util.Stack;
public class StackProb2 {

    public static void addBottom(Stack<Integer> s, int data) {
        if(s.isEmpty()) {
            s.push(data);
            return;
        }

        int top = s.pop();
        addBottom(s, data);
        s.push(top);
    }

    public static void reverseStack(Stack<Integer> s) {
        if(s.isEmpty()) {
            return;
        }

        int top = s.pop();
        reverseStack(s);
        addBottom(s, top);
    }

    public static void main(String args[]) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        reverseStack(stack);

        while(!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}
