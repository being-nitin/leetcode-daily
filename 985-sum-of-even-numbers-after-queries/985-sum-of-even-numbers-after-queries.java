class Solution {
    public int[] sumEvenAfterQueries(int[] nums, int[][] queries) {
        int  n = nums.length;
        int[] ans = new int[n];
        int m = queries.length;
        int sumE = 0 ;
        for(int i: nums){
            if(i%2==0) {
                sumE+=i;
            }
        }
        int j = 0;
        for(int i=0; i<n; i++){
            j = queries[i][1];
            if(nums[j]%2==0) {
                sumE-=nums[j];
            }
            nums[j]+=queries[i][0];
            if(nums[j]%2==0) {
                sumE+=nums[j];
            }
            ans[i] = sumE;
        }
        return ans;
    }
}
        
    

/*
        int[] ans = new int[nums.length];
        for(int i=0;i<queries.length;i++){
            nums[i] = nums[i]+queries[i][0];
            int sum=0;
            for(int j=0;j<nums.length;j++){
                if(nums[j]%2==0){
                    sum = sum+nums[j];
                    }
            }
            ans[i] = sum;
        }
        return ans;
    }
}
*/