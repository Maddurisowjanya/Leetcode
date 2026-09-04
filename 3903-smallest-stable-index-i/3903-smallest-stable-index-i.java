class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n = nums.length;
        int[] a = new int[n];
        a[n - 1] = nums[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            a[i] = Math.min(nums[i], a[i + 1]);
        }
        int x = nums[0];
        for (int i = 0; i < n; i++) {
            x = Math.max(x, nums[i]);
            if (x - a[i] <= k) {
                return i;
            }
        }
        return -1;
    }
}