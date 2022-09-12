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
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;
        int carry=0;
        while(l1!=null || l2!=null){
            int m = (l1!=null)?l1.val:0;
            int n = (l2!=null)?l2.val:0;
            int sum = carry+m+n;
            carry = sum/10;
            tail.next = new ListNode(sum%10);
            tail = tail.next;
            if(l1!=null){
                l1 = l1.next;
            }
            if(l2!=null){
                l2 = l2.next;
            }
        }
        if(carry>0){
            tail.next = new ListNode(carry);
        }
        return dummy.next;
    }
}