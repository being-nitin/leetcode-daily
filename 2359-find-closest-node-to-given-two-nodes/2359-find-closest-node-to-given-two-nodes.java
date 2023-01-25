class Solution {
    public int closestMeetingNode(int[] edges, int node1, int node2) {
      int n = edges.length;
        int[] n1Distances = calculateDistanceFromNode(node1, edges);
        int[] n2Distances = calculateDistanceFromNode(node2, edges);

        int node = -1;
        int dis = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            if(n1Distances[i] == -1 || n2Distances[i] == -1) continue;
            int maxDistance = Math.max(n1Distances[i], n2Distances[i]);
            if (maxDistance < dis) {
                node = i;
                dis = maxDistance;
            }
        }

        return node;
    }

    private int[] calculateDistanceFromNode(int node, int[] edges) {
        int n = edges.length;
        boolean[] vis = new boolean[n];
        int[] distances = new int[n];
        Arrays.fill(distances, -1);

        Queue<Integer> bfs = new LinkedList<>();
        bfs.add(node);
        vis[node] = true;
        int dis = 0;

        while (!bfs.isEmpty()) {
            for (int k = 0; k < bfs.size(); k++) {
                int curNode = bfs.poll();
                distances[curNode] = dis;
                if (edges[curNode] != -1 && !vis[edges[curNode]]) {
                    vis[edges[curNode]] = true;
                    bfs.offer(edges[curNode]);
                }
            }

            dis++;
        }
        return distances;

    }
}