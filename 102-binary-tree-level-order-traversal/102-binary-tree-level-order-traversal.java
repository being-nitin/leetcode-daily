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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if(root==null){
            return result;
        }
        Queue<TreeNode> q = new LinkedList();
        q.add(root);
        
        while(!q.isEmpty()){
            int size = q.size();
            List<Integer> currLevel = new ArrayList<>();
        while(size-->0){
            TreeNode currVal = q.remove();
            currLevel.add(currVal.val);
            if(currVal.left!=null){
                q.add(currVal.left);
            }
            if(currVal.right!=null){
                q.add(currVal.right);
            }
        }
            result.add(currLevel);
        }
        return result;
        }
}