class Solution {
    public int equalPairs(int[][] grid) {
        Map<List<Integer>, Integer> rows = new HashMap<>();
        for (int[] row : grid) {
            List<Integer> list = new ArrayList<>();
            for (int num : row)
                list.add(num);
            rows.put(list, rows.getOrDefault(list, 0) + 1);
        }
        int ans = 0;
        int n = grid.length;
        for (int col = 0; col < n; col++) {
            List<Integer> column = new ArrayList<>();
            for (int row = 0; row < n; row++)
                column.add(grid[row][col]);
            ans += rows.getOrDefault(column, 0);
        }
        return ans;
    }
}