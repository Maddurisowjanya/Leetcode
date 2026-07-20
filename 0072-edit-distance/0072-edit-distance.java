class Solution {
    int[][] dp;
    int n, m;

    private int solve(int i, int j, String word1, String word2) {
        if (i == n) return m - j;
        if (j == m) return n - i;

        if (dp[i][j] != -1) return dp[i][j];

        if (word1.charAt(i) == word2.charAt(j)) {
            return dp[i][j] = solve(i + 1, j + 1, word1, word2);
        }

        int insert = 1 + solve(i, j + 1, word1, word2);
        int delete = 1 + solve(i + 1, j, word1, word2);
        int replace = 1 + solve(i + 1, j + 1, word1, word2);

        return dp[i][j] = Math.min(insert, Math.min(delete, replace));
    }

    public int minDistance(String word1, String word2) {
        n = word1.length();
        m = word2.length();

        dp = new int[n][m];

        for (int i = 0; i < n; i++) {
            Arrays.fill(dp[i], -1);
        }

        return solve(0, 0, word1, word2);
    }


}