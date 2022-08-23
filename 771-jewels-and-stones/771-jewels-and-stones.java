class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int res=0;
        for(char j: jewels.toCharArray()){
            for(char k: stones.toCharArray()){
                if(j==k){
                    res++;
                }
            }
        }
        return res;
    }
}