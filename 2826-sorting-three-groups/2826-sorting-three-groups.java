class Solution {
    public int minimumOperations(List<Integer> nums) {
        int n = nums.size();
        int[] lis = new int[n];
        Arrays.fill(lis,1);
        int maxtill = 1;
        for(int i=1;i<n;i++){
            for(int j=0;j<i;j++){
                if(nums.get(i)>=nums.get(j)){
                    lis[i] = Math.max(lis[i],lis[j]+1);
                    maxtill = Math.max(maxtill,lis[i]);
                }
            }
        }
        return n-maxtill;
    }
}