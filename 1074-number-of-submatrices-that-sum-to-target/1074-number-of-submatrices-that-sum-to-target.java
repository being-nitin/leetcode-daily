class Solution {
    public int numSubmatrixSumTarget(int[][] matrix, int target) {
        if(matrix.length==0){
        return 0;
    }
    
    int row = matrix.length;
    int col = matrix[0].length;
    int count = 0;
    for(int i = 0; i<row; i++){
        for(int j = 1; j<col; j++){
            matrix[i][j] += matrix[i][j-1];
        }
    }
    
    HashMap<Integer,Integer> map = new HashMap<>();
    for(int startCol = 0; startCol<col; startCol++){
        for(int currCol = startCol; currCol<col; currCol++){
            map.clear();
            map.put(0,1);
            int sum = 0;
            for(int i = 0; i<row; i++){
                sum += matrix[i][currCol] - (startCol>0 ? matrix[i][startCol-1]:0);
                if(map.containsKey(sum-target)){
                    count+=map.get(sum-target);
                }
                map.put(sum,map.getOrDefault(sum,0)+1);
            }
        }
    }
    return count;
}
}