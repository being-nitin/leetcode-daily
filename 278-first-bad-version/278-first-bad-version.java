/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int low=0,high = n-1;
        while(low<=high){
            int mid = low + (high-low)/2;
            if(isBadVersion(mid)){
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return low;
        }
}