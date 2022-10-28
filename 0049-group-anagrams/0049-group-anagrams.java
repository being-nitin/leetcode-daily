class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        int n=strs.length;
        HashMap<String,ArrayList<String>> hm=new HashMap<>();
        List<List<String>> list=new ArrayList<>();
        
        for(int i=0;i<n;i++){
            char [] ch=strs[i].toCharArray();
            Arrays.sort(ch);
            String temp=new String(ch);
            if(hm.containsKey(temp)){
                hm.get(temp).add(strs[i]);
            }
            else{
                ArrayList<String> t=new ArrayList<>();
                t.add(strs[i]);
                hm.put(temp,t);
            }
        }
        
        for(String key:hm.keySet()){
            list.add(hm.get(key));
        }
        
        return list;
    }
}