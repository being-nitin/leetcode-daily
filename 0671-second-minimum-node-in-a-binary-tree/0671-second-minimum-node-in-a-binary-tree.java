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
    
    public int findSecondMinimumValue(TreeNode root) {
        TreeSet<Integer> ans = new TreeSet<>();
        inorder(root,ans);
        if(ans.size()>1){
            ans.pollFirst();
            return ans.first();
        }
        return -1;
    }
    private static void inorder(TreeNode root,TreeSet<Integer> set){
        if(root==null){
            return;
        }
        inorder(root.left,set);
        set.add(root.val);
        inorder(root.right,set);
    }
}