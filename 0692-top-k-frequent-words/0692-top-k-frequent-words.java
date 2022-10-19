class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        TreeMap<String, Integer> map = new TreeMap<>();
    for(String a : words){
        map.put(a,map.getOrDefault(a,0)+1);
    }

    ArrayList<String> list = new ArrayList<>(map.keySet());
	list.sort((x,y) -> map.get(y)-map.get(x));
    List sub = list.subList(0,k);

    return sub;
}
}