class Solution {
    public int commonFactors(int a, int b) {
  int cnt = 0;
  int min = Math.min(a,b);
    for(int i=1;i<=min;i++){
        if(a%i==0 && b%i==0){
            cnt  = cnt+1;
        }
    }
        return cnt;
}
}