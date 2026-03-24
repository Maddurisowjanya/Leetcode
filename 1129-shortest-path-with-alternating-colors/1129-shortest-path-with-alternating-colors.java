import java.util.*;

class Solution {
    public int[] shortestAlternatingPaths(int n, int[][] redEdges, int[][] blueEdges) {
        List<Integer>[] red = new ArrayList[n];
        List<Integer>[] blue = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            red[i] = new ArrayList<>();
            blue[i] = new ArrayList<>();
        }
        for (int[] e : redEdges) red[e[0]].add(e[1]);
        for (int[] e : blueEdges) blue[e[0]].add(e[1]);
        int[] ans = new int[n];
        Arrays.fill(ans, -1);
        Queue<int[]> q = new LinkedList<>();
        boolean[][] vis = new boolean[n][2];
        q.offer(new int[]{0, 0}); 
        q.offer(new int[]{0, 1}); 
        vis[0][0] = vis[0][1] = true;
        int dist = 0;
        while (!q.isEmpty()) {
            int size = q.size();
            for (int i = 0; i < size; i++) {
                int[] cur = q.poll();
                int node = cur[0], color = cur[1];
                if (ans[node] == -1) ans[node] = dist;
                if (color == 0) { 
                    for (int nei : blue[node]) {
                        if (!vis[nei][1]) {
                            vis[nei][1] = true;
                            q.offer(new int[]{nei, 1});
                        }
                    }
                } else { 
                    for (int nei : red[node]) {
                        if (!vis[nei][0]) {
                            vis[nei][0] = true;
                            q.offer(new int[]{nei, 0});
                        }
                    }
                }
            }
            dist++;
        }
        return ans;
    }
}