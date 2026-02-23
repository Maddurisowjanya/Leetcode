class Solution {
    private int[] prefix;
    private int totalsum;
    private Random random;
    public Solution(int[] w) {
        prefix = new int[w.length];
        random = new Random();
        int runningsum = 0;
        for(int i = 0; i < w.length; i++){
            runningsum += w[i];
            prefix[i] = runningsum;
        }
        totalsum = runningsum;
    }
    
    public int pickIndex() {
        int r=  random.nextInt(totalsum)+1;
        int left = 0, right = prefix.length-1;
        while(left < right){
            int mid = left+(right - left)/2;
            if(prefix[mid] < r){
                left = mid+1;
            }else{
                right = mid;
            }
        }
        return left;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(w);
 * int param_1 = obj.pickIndex();
 */