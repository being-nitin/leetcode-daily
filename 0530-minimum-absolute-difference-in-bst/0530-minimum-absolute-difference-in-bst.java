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
    int prev = -2;
    int min = Integer.MAX_VALUE;
    public int getMinimumDifference(TreeNode root) {
        inOrder(root);
        return min;
        
    }
    public void inOrder(TreeNode root){
        if(root==null){
            return;
        }
        
        if(root.left!=null){
            inOrder(root.left);
        }
        if(prev!=-2){
            min = Math.min(min, Math.abs(root.val-prev));
        }
        prev = root.val;
        if(root.right!=null){
        inOrder(root.right);
        }
           
    }
}