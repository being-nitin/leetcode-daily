class Solution {
    public double average(int[] salary) {
        int minSal = Integer.MAX_VALUE;
        int maxSal = Integer.MIN_VALUE;
        for(int i=0;i<salary.length;i++){
            minSal = Math.min(minSal,salary[i]);
            maxSal = Math.max(maxSal,salary[i]);
        }
        double sum =0;
        for(int i=0;i<salary.length;i++){
            if(minSal!=salary[i] && maxSal!=salary[i]){
                sum = sum+salary[i];
            }
        }
        return sum/(salary.length-2);
        }
}