class Solution {
    public int maxProfit(int[] prices) {
        int max = 0;
        int day = prices[0];
        for(int i = 0; i < prices.length; i++){
            if(day < prices[i]){
                max += prices[i] - day;
            }
            day = prices[i];
        }
        return max;
    }
}