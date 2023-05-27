// Write a program to reverse a linked list.

package DSAProblems;
import java.util.LinkedList;
import java.util.Stack;

public class Problem1 {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        Stack<Integer> stack = new Stack<>();

        ll.add(5);
        ll.add(57);
        ll.add(96);
        ll.add(24);
        ll.add(38);

        while (!ll.isEmpty()) {
            stack.push(ll.remove());
        }

        while (!stack.isEmpty()) {
            ll.add(stack.pop());
        }

        System.out.println(ll);
    }
}
