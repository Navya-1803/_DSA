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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        ListNode pointerA = l1;
        ListNode pointerB = l2;

        ListNode dummy = new ListNode(0);
        ListNode current = dummy;

        int carry = 0, digit1, digit2;

        while(pointerA != null || pointerB != null || carry != 0){
            if(pointerA == null){
                digit1 = 0;
            } else {
                digit1 = pointerA.val;
                pointerA = pointerA.next;
            }

            if(pointerB == null){
                digit2 = 0;
            } else {
                digit2 = pointerB.val;
                pointerB = pointerB.next;
            }


            int total = digit1 + digit2 + carry;
            int result = total%10;
            carry = total/10;
            ListNode newNode = new ListNode(result);
            current.next = newNode;
            //current.next = new ListNode(result);
            current = current.next;
        }
        return dummy.next;
    }
}