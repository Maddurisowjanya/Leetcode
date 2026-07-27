class Solution {
    public int maxProduct(int[] nums) {
        PriorityQueue<Integer> maxheap = new PriorityQueue<>(Collections.reverseOrder());
        for(int num : nums){
            maxheap.add(num);
        }
        int max1 = maxheap.poll();
        int max2 = maxheap.poll();
        return (max1 - 1) * (max2 - 1);
    }
}