class Solution {
    void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public void sortColors(int[] nums) {
        int left = 0, mid = 0, right = nums.length -1;
        while(mid <= right){
            switch(nums[mid]){
                case 0:
                    swap(nums,left,mid);
                    left++;
                    mid++;
                    break;
                case 1:
                    mid++;
                    break;
                case 2:
                    swap(nums,mid,right);
                    right--;
                    break;
            }
        }
    }
}