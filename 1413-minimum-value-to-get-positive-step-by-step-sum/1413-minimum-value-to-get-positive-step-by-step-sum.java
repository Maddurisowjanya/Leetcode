class Solution {
    public int minStartValue(int[] nums) {
        int sum = 0;
        int min = 0;
        for(int num : nums){
            sum += num;
            min = Math.min(min,sum);
        }
        return (min < 1) ? 1 - min : 1;
    }
}