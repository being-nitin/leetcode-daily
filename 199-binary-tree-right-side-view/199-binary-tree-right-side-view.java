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
    List<Integer> result = new ArrayList<>();
    public List<Integer> rightSideView(TreeNode root) {
    levelorder(root,0);
        return result;
    }
    void levelorder(TreeNode root,int level){
        if(root==null){
            return;
        }
        if(result.size()==level){
            result.add(root.val);
        }
        levelorder(root.right,level+1);
        levelorder(root.left,level+1);
    }
}