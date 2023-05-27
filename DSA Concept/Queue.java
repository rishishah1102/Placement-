public class Queue {
    static class Q {
        int arr[];
        int size;
        int rear;

        Q(int n) {
            this.size = n;
            arr = new int[n];
            rear = -1;
        }

        public boolean isEmpty() {
            return rear == -1;
        }

        public boolean isFull() {
            return rear == size - 1;
        }

        public void add(int data) {
            if (isFull()) {
                System.out.println("Overflow");
                return;
            }

            arr[++rear] = data;
        }

        // O(n)
        public int remove() {
            if (isEmpty()) {
                System.out.println("empty queue");
                return -1;
            }
            int front = arr[0];
            for (int i = 0; i < rear; i++) {
                arr[i] = arr[i + 1];
            }
            rear--;
            return front;
        }

        public int peek() {
            if (isEmpty()) {
                System.out.println("empty queue");
                return -1;
            }

            return arr[0];
        }
    }

    public static void main(String args[]) {
        Q q = new Q(5);
        q.add(1);
        q.add(2);
        q.add(3);
        System.out.println("pop - " + q.remove());
        System.out.println("peek - " + q.peek());

        while(!q.isEmpty()) {
            System.out.println(q.remove());
        }
 
    }

}
