class Solution {
        public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> list = new ArrayList<>();
        for (int[] interval : intervals) {
            if (interval[1] < newInterval[0]) {
                list.add(interval);


            } else if (interval[0] > newInterval[1]) {
                list.add(new int[] {newInterval[0], newInterval[1]}); // added (1,5)
                newInterval = interval;
                }
            else if (interval[1] >= newInterval[0]) {                                          newInterval[0] = Math.min(newInterval[0], interval[0]);
                newInterval[1] = Math.max(newInterval[1], interval[1]);
            }
        }
        list.add(newInterval); 
        int[][] res = new int[list.size()][2];
        for (int i = 0; i < list.size(); i++) {
            res[i] = list.get(i);
        }
        return res;
    }
}