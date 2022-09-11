class Solution {
    public int maxPerformance(int n, int[] speed, int[] efficiency, int k) {
        int[][] arr = new int[n][2];
        for (int i = 0; i < n; i++)
            arr[i] = new int[] {speed[i], efficiency[i]};
        Arrays.sort(arr, (a, b) -> Integer.compare(b[1], a[1]));
        PriorityQueue<Integer> q = new PriorityQueue<>();
        long totalSpeed = 0, performance = 0;
        for (int[] pair : arr) {
            int temp = pair[0];
            q.add(temp);
            if (q.size() <= k) totalSpeed += temp;
            else totalSpeed += temp - q.poll();
           performance = Math.max(performance, totalSpeed * pair[1]);
        }
        return (int)(performance % 1000000007);
    }
}