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
        // OPTIMIZED SOL
        ListNode lessHead = new ListNode(0);
        ListNode greaterHead = new ListNode(0);

        ListNode curr = head;
        ListNode less = lessHead;
        ListNode great = greaterHead;

        while(curr != null){
            if(curr.val < x){
                less.next = curr;
                less = less.next; 
            }
            else{
                great.next = curr;
                great = great.next;
            }
            curr = curr.next;
        }
        great.next = null;
        less.next = greaterHead.next;
        return lessHead.next;
    }
}


        // MY CODE

        // ListNode dummy = new ListNode(0); 
        // ListNode ans = dummy;
        // ListNode curr = head;
        // while(curr != null){
        //     if(curr.val < x){
        //         ans.next = new ListNode(curr.val);
        //         ans = ans.next;
        //     }
        //     curr = curr.next;
        // }
        // ListNode prev = head;
        // while(prev != null){
        //     if(prev.val >= x){
        //         ans.next = new ListNode(prev.val);
        //         ans = ans.next;
        //     }
        //     prev = prev.next;
        // }
        // return dummy.next;
