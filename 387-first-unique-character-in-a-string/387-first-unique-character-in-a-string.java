class Solution {
    public int firstUniqChar(String s) {
        if(s.length()==0){
            return -1;
        }
        HashMap<Character, Integer> map = new HashMap<>();
        for(char c: s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        for(char c: s.toCharArray()){
            if(map.get(c)==1){
                return s.indexOf(c);
            }
        }
        return -1;
        }
}