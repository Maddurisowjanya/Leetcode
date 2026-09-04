class Solution {
    public boolean uniformArray(int[] nums1) {
        int n = nums1[0];
        for (int num : nums1) {
            if (num < n) {
                n = num;
            }
        }
        if (n % 2 != 0) {
            return true;
        } else {
            for (int num : nums1) {
                if (num % 2 != 0) {
                    return false;
                }
            }
        }
        return true;
    }
}