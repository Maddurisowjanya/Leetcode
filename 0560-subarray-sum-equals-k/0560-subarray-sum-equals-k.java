class Solution {
    public int subarraySum(int[] nums, int k) {
        int count = 0;
        for( int i = 1 ; i < nums.length ; i++){
            nums[i] = nums[i] + nums[i-1];
        }
        Map<Integer,Integer> map = new HashMap<>();
        for( int i = 0 ; i < nums.length; i++){
            if(nums[i] == k){
                count++;
            }
            if(map.containsKey(nums[i]-k)){
                count += map.get(nums[i]-k);
            }
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }

        return count;
    }
}