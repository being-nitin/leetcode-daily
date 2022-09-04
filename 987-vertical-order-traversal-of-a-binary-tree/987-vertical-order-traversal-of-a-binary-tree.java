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
     int left = 0,right = 0;
    HashMap<Integer,List<int[]>> map = new HashMap<Integer,List<int[]>>();
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        dfs(root, 0, 0);
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        List<int[]> lis; List<Integer> li;
        for(int i = left; i <= right; i++){
            lis = map.get(i);
            Collections.sort(lis,(a,b) -> (a[0]==b[0])?a[1]-b[1]:a[0]-b[0]); // sorting by the fact that if the rows are different, then sort by row number, or if the row is same, then sort according to the values in the node.
            li = new ArrayList<Integer>();
            for(int[] node: lis) li.add(node[1]);
            list.add(li);
        }
        return list;
    }
    void dfs(TreeNode node, int col, int row){ // Travelling in dfs and storing the data in nodes, in maps
        if(node == null) return;
        left = Math.min(left, col);
        right = Math.max(right, col);
        List<int[]> list = map.getOrDefault(col, new ArrayList<int[]>());
        list.add(new int[]{row, node.val});
        map.put(col, list);
        dfs(node.left ,col - 1, row + 1);
        dfs(node.right, col + 1, row + 1);
    }
}