/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> ans = new ArrayList<>();
        if(root==null){
            return ans; 
        }
        Queue<Node> qu = new LinkedList<>();
        qu.add(root);
        while(!qu.isEmpty()){
            List<Integer> currLevel = new ArrayList<>();
            int size = qu.size();
            while(size-->0){
                Node head = qu.poll();
                currLevel.add(head.val);
                for(Node child: head.children){
                    qu.add(child);
                }
            }
            ans.add(currLevel);
        }
        return ans;
        }
}