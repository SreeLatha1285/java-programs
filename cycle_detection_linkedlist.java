
import java.util.*;
class ListNode {
    int val;
    ListNode next;
    ListNode (int val) {
        this.val = val;
        this.next = null;
    }
     public static void main (String[] args) {
        ListNode head = new ListNode(3);
        head.next = new ListNode(2);
        head.next.next = new ListNode(0);
        head.next.next.next = new ListNode(-4);

        head.next.next.next.next = head.next;

        System.out.println("Cycle detected: " + hasCycle(head));
    }
    public static boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) return false;

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;           
            fast = fast.next.next;      
            if (slow == fast) {
                return true;            
            }
        }

        return false; // no cycle
    }
}
