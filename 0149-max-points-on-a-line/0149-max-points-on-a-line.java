class Solution {
    public int maxPoints(int[][] points) {
      int max = 1;
        for (int i = 0; i < points.length; i++) {
            HashMap<Double, Integer> map = new HashMap<>();
            for (int j = 0; j < points.length; j++) {
                if (i == j) continue;
                double slope = (points[j][0] - points[i][0]) != 0 ? (points[j][1] - points[i][1]) * 1.0 / (points[j][0] - points[i][0]) : Integer.MAX_VALUE;
                map.put(slope, map.getOrDefault(slope, 1) + 1);
                max = Math.max(max, map.get(slope));
            }
        }
        return max;
    }
}
