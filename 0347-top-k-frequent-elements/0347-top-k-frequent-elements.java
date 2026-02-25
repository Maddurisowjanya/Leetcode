class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> freqmap=new HashMap<>();
        for(int num:nums){
            freqmap.put(num,freqmap.getOrDefault(num,0)+1);
        }
        PriorityQueue<Integer>minheap=new PriorityQueue<>(
        (a,b)->freqmap.get(a)-freqmap.get(b));
        for(int num:freqmap.keySet()){
            minheap.add(num);
            if(minheap.size()>k){
                minheap.poll();
            }
        }
        int[] result=new int[k];
        int i=0;
        for(int num:minheap){
            result[i++]=num;
        }
        return result;
    }
}