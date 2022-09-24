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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum){
                List<Integer> currentPath = new ArrayList();
        List<List<Integer>> allPaths = new ArrayList();
        findPathsRecursive(root,targetSum,currentPath,allPaths);
        return allPaths;
    }
    private static void findPathsRecursive(TreeNode currentNode, int sum, List<Integer> currentPath,List<List<Integer>> allPaths){
         if(currentNode==null)return;
         currentPath.add(currentNode.val);
         if(currentNode.val==sum && currentNode.left==null && currentNode.right==null)
             allPaths.add(new ArrayList<Integer>(currentPath));
         else{
             findPathsRecursive(currentNode.left,sum-currentNode.val,currentPath,allPaths);
             findPathsRecursive(currentNode.right,sum-currentNode.val,currentPath,allPaths);
         }
         currentPath.remove(currentPath.size()-1);
      }

}