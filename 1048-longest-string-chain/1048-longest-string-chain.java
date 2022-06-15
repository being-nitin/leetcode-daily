class Solution {
    public int longestStrChain(String[] words) {
         int length = words.length;
        Map<String,Integer> hash = new HashMap<>();
        int ans=1;
        Arrays.sort(words,(a,b) -> a.length()-b.length());
            
        for(int i=0;i<length;i++){
            String cur = words[i];
            hash.put(cur,1);
            
            for(int j=0;j<cur.length();j++){
                StringBuilder temp = new StringBuilder(cur);
                String newString = temp.deleteCharAt(j).toString();
                
                if(hash.containsKey(newString) && hash.get(newString)+1 > hash.get(cur)){
                    hash.put(cur,hash.get(newString)+1);
                }
            }
            ans = Math.max(ans,hash.get(cur));
        }
        return ans;
    }
}