class Solution {
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        List<List<int[]>> adj = new ArrayList<>();
        for (int i = 0; i < n; i++) adj.add(new ArrayList<>());
        for (int[] f : flights) adj.get(f[0]).add(new int[]{f[1], f[2]});
        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a[0]));
        pq.offer(new int[]{0, src, 0});
        int[][] dist = new int[n][k + 2];
        for (int[] row : dist) Arrays.fill(row, Integer.MAX_VALUE);
        dist[src][0] = 0;
        while (!pq.isEmpty()) {
            int[] top = pq.poll();
            int cost = top[0], node = top[1], stops = top[2];
            if (node == dst) return cost;
            if (stops > k) continue;
            for (int[] next : adj.get(node)) {
                int newCost = cost + next[1];
                if (newCost < dist[next[0]][stops + 1]) {
                    dist[next[0]][stops + 1] = newCost;
                    pq.offer(new int[]{newCost, next[0], stops + 1});
                }
            }
        }
        return -1;
    }
}
