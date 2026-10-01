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
    public ListNode swapPairs(ListNode head) {
        
        if(head == null){
            return null;
        }
        if(head.next == null){
            return head;
        }
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode previous = dummy;

        ListNode first = dummy.next;

        while(first != null && first.next != null){
            ListNode second = first.next;

            previous.next = second;
            first.next = second.next;
            second.next = first;

            previous = first;
            first = previous.next;
        }
        return dummy.next;
    }
}