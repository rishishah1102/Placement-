// import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class QueueTut {
    public static void main(String[] args) {
        
        // Queue<Integer> q = new Queue<>(); -- There is no such thing in java because
        // queue is an interface not a class so we cannot instantiate it. It can be
        // instantiated using two way one is linkedlist and another one is ArrayDeque.
        Queue<Integer> q = new LinkedList<>();
        // Queue<Integer> q2 = new ArrayDeque<>();

        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }

    }
}
