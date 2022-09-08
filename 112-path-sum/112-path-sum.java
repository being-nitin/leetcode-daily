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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        return hasSum(root,0,targetSum);
        }
    private static boolean hasSum(TreeNode root,int sum,int targetSum){
        if(root==null){
            return false;
        }
        if((sum+root.val)==targetSum && root.left==null && root.right==null){
            return true;
        }
        return hasSum(root.left,sum+root.val,targetSum) || hasSum(root.right,sum+root.val,targetSum);
    }
}