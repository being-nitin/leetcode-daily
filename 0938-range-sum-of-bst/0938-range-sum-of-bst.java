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
    int ans;
    public int rangeSumBST(TreeNode root, int low, int high) {
        ans=0;
        dfs(root,low,high);
        return ans;
    }
    public void dfs(TreeNode root,int l,int h){
        if(root!=null){
            if(l<=root.val && h>=root.val){
                ans = ans+root.val;
            }
            if(l<root.val);
                dfs(root.left,l,h);
                if(h>root.val);
                    dfs(root.right,l,h);
        }
    }
}