class Solution {
    public int[] resultsArray(int[][] queries, int k) {

        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);

        int[] ans = new int[queries.length];

        for (int i = 0; i < queries.length; i++) {

            int dist = Math.abs(queries[i][0]) + Math.abs(queries[i][1]);

            pq.offer(dist);

            if (pq.size() > k) {
                pq.poll();
            }

            if (pq.size() == k) {
                ans[i] = pq.peek();
            } else {
                ans[i] = -1;
            }
        }

        return ans;
    }
}