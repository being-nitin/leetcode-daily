class Solution {
    public int alternateDigitSum(int n) {
       int count = 0;
        int a = n;
        while(a!=0){
            a = a/10;
            count++;
        }
        int temp = 1, sum=0;
        if(count%2!=0){
            while(n!=0){
                sum = sum+ temp*(n%10);
                temp = temp*-1;
                n = n/10;
            }
        }
        else{
            while(n!=0){
                sum = sum+(temp*(-1))*(n%10);
                temp = temp*-1;
                n =n/10;
            }
        }
        return sum;
        
    }
}