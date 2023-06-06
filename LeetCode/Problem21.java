package LeetCode;

public class Problem21 {
    public static class ListNode {
        int val;
        ListNode next;
    
        ListNode(int val) {
            this.val = val;
        }
    }
    
    public static ListNode mergeLists(ListNode l1, ListNode l2) {
        // Create a dummy node as the head of the merged list
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;

        // Merge the two lists
        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                current.next = l1;
                l1 = l1.next;
            } else {
                current.next = l2;
                l2 = l2.next;
            }
            current = current.next;
        }

        // Add remaining nodes from list1 or list2, if any
        if (l1 != null) {
            current.next = l1;
        } else {
            current.next = l2;
        }

        return dummy.next; // Return the head of the merged list (after the dummy node)
    }

    public static void main(String[] args) {
        // Create two sorted linked lists
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(6);

        ListNode l2 = new ListNode(2);
        l2.next = new ListNode(3);
        l2.next.next = new ListNode(5);

        // Merge the two lists
        ListNode mergedList = mergeLists(l1, l2);

        // Print the merged list
        while (mergedList != null) {
            System.out.print(mergedList.val + " ");
            mergedList = mergedList.next;
        }
    }
}
