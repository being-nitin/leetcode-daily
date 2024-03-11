class Solution {
    public int longestDecomposition(String text) {
    int start = 0;
    int end = text.length()-1;
    int count = 0;
        while(start<=end){
            if(start==end){
                count++;
                break;
            }
            int length = 1;
            while(start+length<=end && !text.substring(start,start+length).equals(text.substring(end-length+1,end+1))){
                length++;
            }
            if(start+length>end){
                count++;
                break;
            }
            count = count+2;
            start = start+length;
            end = end-length;
        }
        return count;
    }
}