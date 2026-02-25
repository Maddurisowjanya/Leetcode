class Solution {
    public int nthUglyNumber(int n) {
        PriorityQueue<Long> minheap = new PriorityQueue<>();
        HashSet<Long> set = new HashSet<>();
        minheap.add(1L);
        set.add(1L);
        long currugly = 1;
        for(int i = 0; i < n; i ++){
            currugly = minheap.poll();
            long next2 = currugly*2;
            long next3 = currugly*3;
            long next5 = currugly*5;
            if(!set.contains(next2)){
                minheap.add(next2);
                set.add(next2);
            }if(!set.contains(next3)){
                minheap.add(next3);
                set.add(next3);
            }if(!set.contains(next5)){
                minheap.add(next5);
                set.add(next5);
            }
        }
        return (int) currugly;
    }
}