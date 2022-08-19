class Solution {
    public boolean isPossible(int[] nums) {
    HashMap<Integer, Integer> frequencyMap = new HashMap<>();
        HashMap<Integer, Integer> hypotheticalMap = new HashMap<>();
        
        for(int i : nums){
            frequencyMap.put(i, frequencyMap.getOrDefault(i, 0) + 1);
        }
        
        for(int i : nums){
            
            int fromFm = frequencyMap.getOrDefault(i, 0);
            int fromHm = hypotheticalMap.getOrDefault(i, 0);
            
            if(fromFm == 0) continue;
            
            if(fromHm > 0) {
                hypotheticalMap.put(i, fromHm - 1);
                hypotheticalMap.put(i+1, hypotheticalMap.getOrDefault(i + 1, 0) + 1);
                frequencyMap.put(i, fromFm - 1);
            }
            else if(frequencyMap.getOrDefault(i, 0) > 0 && frequencyMap.getOrDefault(i + 1, 0) > 0 && frequencyMap.getOrDefault(i + 2, 0) > 0) {
                frequencyMap.put(i, frequencyMap.get(i) - 1);
                frequencyMap.put(i + 1, frequencyMap.get(i + 1) - 1);
                frequencyMap.put(i + 2, frequencyMap.get(i + 2) - 1);
                hypotheticalMap.put(i+3, hypotheticalMap.getOrDefault(i + 3, 0) + 1);
                
            }
            else {
                return false;
            }
        }
        return true;
    }
}