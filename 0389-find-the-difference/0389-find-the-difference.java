class Solution {
    public char findTheDifference(String s, String t) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(char ch : s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for(char ch : t.toCharArray()){
            map.put(ch, map.getOrDefault(ch,0)-1);
        }
        for(Map.Entry<Character,Integer> ent :map.entrySet()){
            if(ent.getValue()==-1){
                return ent.getKey();
            }
        }
        return '\0';
    }
}