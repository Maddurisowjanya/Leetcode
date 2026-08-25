class Solution {
    public int missingMultiple(int[] nums, int k) {
        int min = Integer.MAX_VALUE;
        Set<Integer> set = new HashSet<>();
        for(int num : nums){
            set.add(num);
        }
        int ans = k;
        while(set.contains(ans)){
            ans += k;
        }
        return ans;
    }
}