/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null){
            return head;
        }
        int size = 0;
        ListNode val = head;
        while(val != null){
            size++;
            val = val.next;
        }
        k = k % size;
        ListNode prev = head;
        while(prev.next != null){
            prev = prev.next;
        }
        prev.next = head;
        int n = size - k;
        ListNode curr = head;
        for(int i=0; i<n-1; i++){
            curr = curr.next;
        }
        ListNode ans = curr.next;
        curr.next = null;
        return ans;
    }
}