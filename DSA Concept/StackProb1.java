// How to insert data at the bottom of Stack

import java.util.Stack;

public class StackProb1 {
    public static void addBottom(Stack<Integer> s) {
        if(s.isEmpty()) {
            s.push(4);
            return;
        }

        int top = s.pop();
        addBottom(s);
        s.push(top);
    }

    public static void main(String args[]) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        
        addBottom(stack);

        while(!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}