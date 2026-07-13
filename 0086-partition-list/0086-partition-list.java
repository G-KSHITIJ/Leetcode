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
    public ListNode partition(ListNode head, int x) {
        ListNode dummy = new ListNode(0); 
        ListNode ans = dummy;
        ListNode curr = head;
        while(curr != null){
            if(curr.val < x){
                ans.next = new ListNode(curr.val);
                ans = ans.next;
            }
            curr = curr.next;
        }
        ListNode prev = head;
        while(prev != null){
            if(prev.val >= x){
                ans.next = new ListNode(prev.val);
                ans = ans.next;
            }
            prev = prev.next;
        }
        return dummy.next;
    }
}