class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] finalArr = new int[nums1.length+nums2.length];
        System.arraycopy(nums1,0,finalArr,0,nums1.length);
        System.arraycopy(nums2,0,finalArr,nums1.length,nums2.length);
        Arrays.sort(finalArr);
        int start = 0;
        int end = finalArr.length-1;
        int mid = (start+end)/2;
        if(finalArr.length%2==0){
            return (double)(finalArr[mid]+finalArr[mid+1])/2;
        }
        else{
            return finalArr[mid];
        }
    }
}