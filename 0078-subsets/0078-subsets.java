class Solution {

    List<List<Integer>> ans = new ArrayList<>();

    public void solve(int i, int[] nums, List<Integer> curr) {

        if (i == nums.length) {
            ans.add(new ArrayList<>(curr));
            return;
        }
        
        // Include
        curr.add(nums[i]);
        solve(i + 1, nums, curr);

        // Backtrack
        curr.remove(curr.size() - 1);

        // skip and explore 
        solve(i + 1, nums, curr);
    }

    public List<List<Integer>> subsets(int[] nums) {
        solve(0, nums, new ArrayList<>());
        return ans;
    }
}