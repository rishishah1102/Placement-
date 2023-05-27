// Implement Queue from two stacks
// To implement stack in two ways we have two different approaches and that either we insert by o(n) time or we pop/peek by o(n) time.

// Deletion by o(n) time
import java.util.*;

public class QueueProb {
    public static void add(Stack<Integer> s1, Stack<Integer> s2, int data) {
        if (s1.empty()) {
            s1.push(data);
            return;
        }

        while (!s1.empty()) {
            s2.push(s1.pop());
        }

        s1.push(data);
        while (!s2.empty()) {
            s1.push(s2.pop());
        }
        return;
    }

    public static int delete(Stack<Integer> s1, Stack<Integer> s2) {
        if (s1.empty()) {
            System.out.println("The queue is empty!");
            return -1;
        }

        return s1.pop();
    }

    public static int peek(Stack<Integer> s1, Stack<Integer> s2) {
        if (s1.empty()) {
            System.out.println("The queue is empty!");
            return -1;
        }

        return s1.peek();
    }

    public static void main(String[] args) {
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();

        add(s1, s2, 0);
        add(s1, s2, 1);
        add(s1, s2, 2);
        add(s1, s2, 3);
        add(s1, s2, 4);
        add(s1, s2, 5);
        System.out.println("pop: " + delete(s1, s2));
        System.out.println("pop: " + delete(s1, s2));
        System.out.println("peek: " + peek(s1, s2));

        while (!s1.empty()) {
            System.out.println(s1.pop());
        }
    }
}
