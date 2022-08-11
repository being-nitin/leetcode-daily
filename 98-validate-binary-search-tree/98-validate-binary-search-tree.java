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
    public boolean isValidBST(TreeNode root) {
        return isValidBST(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }
    
    private boolean isValidBST(TreeNode root, long min, long max){
        if (root == null) { 
            return true;
        }
        
        // Root value must be greater than or equal to min and lesser than or equal to max
        if (root.val <= min || root.val >= max) {
            return false;
        }
        
        // Check both the sides
        boolean checkLeft = isValidBST(root.left, min, root.val);
        boolean checkRight = isValidBST(root.right, root.val, max);

        return  checkLeft && checkRight;
    }
}