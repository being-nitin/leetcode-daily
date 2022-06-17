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
    int result = 0;
    public int minCameraCover(TreeNode root) 
    {
        return (dfs(root) < 1 ? 1 : 0) + result;
    }

    public int dfs(TreeNode root) 
    {
        if (root == null) 
        {
            return 2;
        }
        int left = dfs(root.left), right = dfs(root.right);
        if (left == 0 || right == 0) 
        {
            result++;
            return 1;
        }
        return left == 1 || right == 1 ? 2 : 0;
    }
}