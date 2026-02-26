class Solution {
    public int numIslands(char[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        int count = 0;

        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                if (grid[r][c] == '1') {
                    count++;              // found new island
                    dfs(grid, r, c);      // mark entire island
                }
            }
        }

        return count;
    }

    private void dfs(char[][] grid, int r, int c) {
        // boundary + water check
        if (r < 0 || c < 0 || 
            r >= grid.length || 
            c >= grid[0].length || 
            grid[r][c] == '0') {
            return;
        }

        // mark as visited
        grid[r][c] = '0';

        // explore 4 directions
        dfs(grid, r + 1, c); // down
        dfs(grid, r - 1, c); // up
        dfs(grid, r, c + 1); // right
        dfs(grid, r, c - 1); // left
    }
}