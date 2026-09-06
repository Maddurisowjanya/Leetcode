class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    public void solve(int i, int[] arr, int target, List<Integer> curr) {
        if (target == 0) {
            ans.add(new ArrayList<>(curr));
            return;
        }
        if (target < 0 || i == arr.length)
            return;
        // 1. Take and stay (reuse current element)
        curr.add(arr[i]);
        solve(i, arr, target - arr[i], curr);
        // Backtrack
        curr.remove(curr.size() - 1);
        // 3. Skip
        solve(i + 1, arr, target, curr);
    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        solve(0, candidates, target, new ArrayList<>());
        return ans;
    }
}