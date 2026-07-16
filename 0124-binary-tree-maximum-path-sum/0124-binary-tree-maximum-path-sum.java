/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    private int maxSum;
    private int dfs(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int left = dfs(root.left);
        int right = dfs(root.right);

        // Path that converges at the current node
        int convergingPath = left + right + root.val;

        // Path that can continue to the parent
        int continuePath = Math.max(left, right) + root.val;

        // Start a new path from the current node
        int onlyRoot = root.val;
        maxSum = Math.max(maxSum,Math.max(convergingPath, Math.max(continuePath, onlyRoot)));
        return Math.max(continuePath, onlyRoot);
    }
    public int maxPathSum(TreeNode root) {
        maxSum = Integer.MIN_VALUE;
        dfs(root);
        return maxSum;
    }
}