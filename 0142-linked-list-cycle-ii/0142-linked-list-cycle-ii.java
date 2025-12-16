/**
 * Definition for singly-linked list.
 * class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) {
 * val = x;
 * next = null;
 * }
 * }
 */
public class Solution {
    
    // Helper function to calculate the length of the cycle
    public int detectCycleLength(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            
            if (slow == fast) {
                // Cycle detected, calculate length
                ListNode temp = slow;
                int length = 0;
                do {
                    temp = temp.next;
                    length++;
                } while (temp != slow);
                
                return length;
            }
        }
        return 0;
    }

    public ListNode detectCycle(ListNode head) {
        int cycleLength = detectCycleLength(head);
        
        if (cycleLength == 0) {
            return null;
        }

        ListNode pointer1 = head;
        ListNode pointer2 = head;

        // Move pointer2 ahead by cycle length
        for (int i = 0; i < cycleLength; i++) {
            pointer2 = pointer2.next;
        }

        // Move both pointers until they meet at the cycle start
        while (pointer1 != pointer2) {
            pointer1 = pointer1.next;
            pointer2 = pointer2.next;
        }
        
        return pointer1;
    }
}