class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length;
        int total = 0;
        for (int card : cardPoints) {
            total += card;
        }
        int windowsize = n - k;
        if (windowsize == 0) {
            return total;
        }
        int windowsum = 0;
        for (int i = 0; i < windowsize; i++) {
            windowsum += cardPoints[i];
        }
        int minsum = windowsum;
        int left = 0;
        for (int right = windowsize; right < n; right++) {
            windowsum += cardPoints[right];
            windowsum -= cardPoints[left];
            left++;
            minsum = Math.min(minsum, windowsum);
        }
        return total - minsum;
    }
}