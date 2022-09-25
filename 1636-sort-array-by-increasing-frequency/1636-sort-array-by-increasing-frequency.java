class Solution {
    public int[] frequencySort(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int x:nums){
            map.put(x,map.getOrDefault(x,0)+1);
        }
        List<Integer> list =new ArrayList<>(map.keySet());
        Collections.sort(list,(a,b)->{
            if(map.get(a)==map.get(b))
                return b-a;
            else{
                return map.get(a)-map.get(b);
            }
        });
        int[] result = new int[nums.length];
        int index=0;
        for(int numb:list){
            for(int i=0;i<map.get(numb);i++){
                result[index++] = numb;
            }
        }
        return result;
    }
}