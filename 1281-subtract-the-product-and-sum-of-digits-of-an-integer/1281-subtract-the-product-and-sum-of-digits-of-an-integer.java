class Solution {
    public int subtractProductAndSum(int n) {
      int sum = 0;
        int prod = 1;
        int num = 0;
        while(n>0){
            num = n%10;
            prod = prod*num;
            sum = sum+num;
            n = n/10;
        }
        return prod-sum;
    }
}