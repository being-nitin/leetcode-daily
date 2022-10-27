class Solution {
    public int largestOverlap(int[][] img1, int[][] img2) {
      int res = 0;
      int N = img1.length;
      var count = new int[N * 2][N * 2]; 
      for(int i = 0; i < N; i ++) {
          for(int j = 0; j < N; j ++) {
              if(img1[i][j] == 0) continue;

              for(int m = 0; m < N; m ++) {
                  for(int n = 0; n < N; n ++) {
                      if(img2[m][n] == 0) continue;
                      res = Math.max(res, ++ count[N + i - m][N + j - n]);
                  }
              }
          }
      }
      return res; 
    }
}
 