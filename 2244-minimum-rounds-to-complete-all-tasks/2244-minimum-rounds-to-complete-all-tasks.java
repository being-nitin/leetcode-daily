class Solution {
   public int minimumRounds(int[] tasks) {
        HashMap<Integer, Integer> getCount = new HashMap<>();
        for (int t : tasks) {
            getCount.put(t, getCount.getOrDefault(t, 0) + 1);
        }
        int result = 0;
        for (int count : getCount.values()) {
            if (count == 1) return -1;
            result += count / 3;
            if(count % 3 != 0) result++;
        }
        return result;
    }
}