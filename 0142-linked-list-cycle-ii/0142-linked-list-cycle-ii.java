/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        ListNode meetpoint = null;

        // Phase 1: Detect if a cycle exists
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                meetpoint = slow;
                break;
            }
        }

        // If no cycle is found, return null
        if (meetpoint == null) return null;

        // Phase 2: Find the entry node of the cycle
        ListNode startNode = head;
        while (startNode != meetpoint) {
            startNode = startNode.next;
            meetpoint = meetpoint.next;
        }

        // Return the actual node where the cycle begins
        return startNode;
    }
}
