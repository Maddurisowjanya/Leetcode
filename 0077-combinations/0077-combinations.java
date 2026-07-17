class Solution {

    List<List<Integer>> ans = new ArrayList<>();

    public void solve(int i, int n, int k, List<Integer> curr) {

        if (i > n) {
            if (curr.size() == k) {
                ans.add(new ArrayList<>(curr));
            }
            return;
        }

        // Take i
        curr.add(i);
        solve(i + 1, n, k, curr);

        // Backtrack
        curr.remove(curr.size() - 1);

        // Don't take i
        solve(i + 1, n, k, curr);
    }

    public List<List<Integer>> combine(int n, int k) {
        solve(1, n, k, new ArrayList<>());
        return ans;
    }
}