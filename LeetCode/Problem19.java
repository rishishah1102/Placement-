package LeetCode;

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }
}

public class Problem19 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        // Create a dummy node as the head of the linked list
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        // Initialize the fast and slow pointers
        ListNode fast = dummy;
        ListNode slow = dummy;

        // Move the fast pointer N nodes ahead
        for (int i = 0; i < n; i++) {
            fast = fast.next;
        }

        // Move both pointers until the fast pointer reaches the last node
        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }

        // Remove the Nth node by skipping it
        slow.next = slow.next.next;

        // Return the head of the linked list
        return dummy.next;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        int n = 2; // Nth node from the end to remove

        // Create an instance of the Solution class
        Problem19 solution = new Problem19();

        // Call the removeNthFromEnd method
        ListNode updatedHead = solution.removeNthFromEnd(head, n);

        // Print the updated linked list
        ListNode current = updatedHead;
        while (current != null) {
            System.out.print(current.val + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}