class Solution {
    public int mySqrt(int x) {
    int start=1;
     int end =x;
  
      int result= 0;
     while(start<=end)  {
       int mid = start+(end-start)/2;
     if(mid*mid==x){
         result = mid;
         return result;
     }
     else if((long) mid * mid > x)
                end = mid-1;
         
            else
            {
                result = mid;
                start = mid + 1;
     }
     }
       return result;
    }
}