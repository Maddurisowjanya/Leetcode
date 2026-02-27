class Solution {
    public int majorityElement(int[] nums) {
        if(nums.length==1)return nums[0];
       HashMap<Integer,Integer>map=new HashMap<>();
        for(int val:nums){
            if(map.containsKey(val)){
                if(map.get(val)>=nums.length/2)return val;
                else map.put(val,map.get(val)+1);
            }else map.put(val,1);
        }
        return 0;
    }
}