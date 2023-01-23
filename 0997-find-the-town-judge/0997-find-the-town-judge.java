class Solution {
    public int findJudge(int n, int[][] trust) {
   Map<Integer, Integer> adj = new HashMap<>();
        for (int[] e : trust) {
            adj.put(e[1], 1 + adj.getOrDefault(e[1], 0)); 
            adj.put(e[0], adj.getOrDefault(e[0], 0) - 1);
        }
        for (int i = 1; i <= n; i++) {
            if (adj.getOrDefault(i, 0) == n - 1) {
                return i;
            }
        }
        return -1;
    }
}