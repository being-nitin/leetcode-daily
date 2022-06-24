class Solution {
    public boolean isPossible(int[] target) {
                long sum =0;
                int max=0;
           for(int i=0;i<target.length;i++){
            sum += target[i];
            if(target[max]<target[i]){
                max = i;
            }
        }
        long difference = sum - target[max];
        
        if(target[max] == 1 || difference == 1){
            return true;
        }

        if(difference>target[max] || difference == 0 || target[max]%difference==0){                return false;
        }
        
        target[max] %= difference;
        
        return isPossible(target);
    }
}