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
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode sortedListToBST(ListNode head){
        int count=0;
        ListNode curr= head;
        while(curr!=null){
            count++;
            curr = curr.next;
        }
        curr = head;
        int[] arr = new int[count];
        for(int i=0;i<count;i++){
            arr[i] = curr.val;
            curr = curr.next;
        }
        return build(arr, 0, arr.length-1);
        }
    
    public TreeNode build(int[] arr,int low, int high){
        if(low>high){
            return null;
        }  
        int mid = (low+high)/2;
        TreeNode root = new TreeNode(arr[mid]);
        root.left = build(arr,low,mid-1);
        root.right = build(arr,mid+1,high);
        return root;  
    }
}