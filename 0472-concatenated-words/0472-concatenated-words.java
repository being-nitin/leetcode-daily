class Solution {
    public List<String> findAllConcatenatedWordsInADict(String[] words) {
         List<String>al=new ArrayList<>();
        Set<String>hs=new HashSet<>();
        for(String i:words) hs.add(i);
        Map<String,Integer>hm=new HashMap<>();
        for(String i:words) if(check(i,hs,hm)) al.add(i);
        return al;
    }
    public static boolean check(String i,Set<String>hs,Map<String,Integer>hm){
        if(hm.containsKey(i)) return hm.get(i)==1;
        for(int z=0;z<i.length();z++){
            if(hs.contains(i.substring(0,z))){
                String s1=i.substring(z);
                if(hs.contains(s1)||check(s1,hs,hm)){
                    hm.put(i,1);
                    return true;
                }
            }
        }
        hm.put(i,0);
        return false;
    }
}