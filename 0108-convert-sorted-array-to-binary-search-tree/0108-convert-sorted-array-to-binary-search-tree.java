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
    public TreeNode sortedArrayToBST(int[] nums) {
        return helper(nums,0,nums.length-1);
        
    }
    private TreeNode helper(int[] nums,int low, int high){
        if(low>high){
            return null;
        }
        int mid = (low+high)/2;
        TreeNode currNode = new TreeNode(nums[mid]);
        currNode.left = helper(nums,low,mid-1);
        currNode.right = helper(nums,mid+1,high);
        return currNode;
    }
}