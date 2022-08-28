class Solution {
    public int[][] diagonalSort(int[][] mat) {
        int m = mat.length, n = mat[0].length;
        Map<Integer, PriorityQueue<Integer>> map = new HashMap<>();
        
        for(int i = 0 ; i < m ; i++) {
            for(int j = 0; j < n ; j++) {
                int diagonalKey = i - j; 
                PriorityQueue<Integer> priorityQueue = map.getOrDefault(diagonalKey, new PriorityQueue<>());
                priorityQueue.offer(mat[i][j]);
                map.put(diagonalKey, priorityQueue);
            }
        }
        for(int i = 0 ; i < m ; i++) {
            for(int j = 0 ; j < n ; j++) {
               int diagonalKey = i - j;
               PriorityQueue<Integer> priorityQueue = map.get(diagonalKey);
                mat[i][j] = priorityQueue.poll();
            }
        }
        return mat;
    }
}