class Solution {
    List<List<Integer>> ans = new ArrayList<>();

    public void perm(int[] nums, boolean[] visited, List<Integer> curr) {
        if (curr.size() == nums.length) {
            ans.add(new ArrayList<>(curr));
            return;
        }

        for (int j = 0; j < nums.length; j++) {
            // choose
            if (!visited[j]) {
                visited[j] = true;
                curr.add(nums[j]);

                // explore
                perm(nums, visited, curr);

                // undo / backtrack
                curr.remove(curr.size() - 1);
                visited[j] = false;
            }
        }
    }

    public List<List<Integer>> permute(int[] nums) {
        boolean[] visited = new boolean[nums.length];
        List<Integer> curr = new ArrayList<>();

        perm(nums, visited, curr);

        return ans;
    }
}