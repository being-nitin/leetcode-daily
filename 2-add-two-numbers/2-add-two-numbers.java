/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;h
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        // create empty node to return as head at the end of the program
        ListNode head = new ListNode(0);
		// create the node that will be generated
        ListNode l3 = head;
		// create a copy for the final step
        ListNode last = head;
        while(l1 != null || l2 != null) {
            int sum = 0;
			// if one pointer is shorter than another, then ignore the shorter one
            if (l1 == null) {
                sum += 0;
            }
            else {
                sum += l1.val;
                l1 = l1.next;
            }
            if (l2 == null) {
                sum += 0;
            }
            else {
                sum += l2.val;
                l2 = l2.next;
            }
			// create the next node and shift to it
            l3.next = new ListNode(sum);
            l3 = l3.next;
        }
		// if any value in the list is greater than ten, then...
        while (last != null) {
            if (last.val >= 10) {
                int carry = 0;
                if (last.next != null) {
				// add the remainder to the next node, then shift, and so on...
                    carry = last.val / 10;
                    last.val = last.val % 10;
                    last = last.next;
                    last.val += carry;
                }
				// end of list case
                else {
                    carry = last.val / 10;
                    last.next = new ListNode(carry); 
                    last.val = last.val % 10;
                    last = last.next;
                }
            }
            else {
                last = last.next;
            }
        }
        return head.next;
    }
}