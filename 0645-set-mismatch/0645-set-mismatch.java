class Solution {
    public int[] findErrorNums(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int n = nums.length;
        int duplicate = -1;
        int total = (n * (n + 1)) / 2;
        int sum = 0;

        for (int num : nums) {
            if (!set.add(num)) {
                duplicate = num;
                sum -= num;
            }
            sum += num;
        }

        return new int[] { duplicate, total - sum };
    }
}