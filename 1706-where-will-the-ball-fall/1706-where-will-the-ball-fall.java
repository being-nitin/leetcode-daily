class Solution {
         public int[] findBall(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        final int[] result = new int[n];
        for (int i = 0; i < n; ++i) {
            int cy = 0;
            int cx = i;
            while(cy < m && !isBlocked(grid, cy, cx)) {
                cx += grid[cy][cx];
                cy += 1;
            }

            result[i] = cy == m ? cx : -1;
        }

        return result;
    }
    private boolean isBlocked(
        int[][] grid,
        int cy,
        int cx
    ) {
        int n = grid[0].length;
        return (grid[cy][cx] == 1 && cx == n - 1) 
            || (grid[cy][cx] == -1 && cx == 0)   
            || (grid[cy][cx] == 1 && grid[cy][cx + 1] == -1) 
            || (grid[cy][cx] == -1 && grid[cy][cx - 1] == 1);
    }
}