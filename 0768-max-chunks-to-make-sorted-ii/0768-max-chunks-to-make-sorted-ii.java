class Solution {
    public int maxChunksToSorted(int[] arr) {
        int n=arr.length;
        int min1[]=new int[arr.length+1];
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        min1[n] = min;
        int c=0;
        for(int i=n-1;i>=0;i--){
            min1[i]=Math.min(min1[i+1],arr[i]);
        }
         for(int i=0;i<n;i++){
             max= Math.max(max,arr[i]);
             if(max<=min1[i+1]){
                 c++;
             }   
         }    
        return c;

    }
}