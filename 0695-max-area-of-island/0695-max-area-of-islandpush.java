class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        int max = 0;
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                
                if (grid[i][j] == 1) {
                    int area = dfs(grid, i, j);
                    max = Math.max(max, area);
                }
            }
        }
    
        return max;
    }
    
    public int dfs(int[][] grid, int i, int j) {
        // Base condition
        if (i < 0 || j < 0 || 
            i >= grid.length || 
            j >= grid[0].length || 
            grid[i][j] == 0) {
            return 0;
        }
        
        //visited
        grid[i][j] = 0;
        
        // Return area
        return 1 
            + dfs(grid, i + 1, j)
            + dfs(grid, i - 1, j)
            + dfs(grid, i, j + 1)
            + dfs(grid, i, j - 1);
    }
}