class Solution {

    int[] next;
    int[] prev;
    int n;

    public void nextSmaller(int[] nums) {

        Stack<Integer> st = new Stack<>();

        for (int i = n - 1; i >= 0; i--) {

            while (!st.isEmpty() && nums[st.peek()] >= nums[i]) {
                st.pop();
            }

            if (!st.isEmpty()) {
                next[i] = st.peek();
            }

            st.push(i);
        }
    }

    public void prevSmaller(int[] nums) {

        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < n; i++) {

            while (!st.isEmpty() && nums[st.peek()] >= nums[i]) {
                st.pop();
            }

            if (!st.isEmpty()) {
                prev[i] = st.peek();
            }

            st.push(i);
        }
    }

    public int largestRectangleArea(int[] heights) {

        n = heights.length;

        next = new int[n];
        prev = new int[n];

        Arrays.fill(next, n);
        Arrays.fill(prev, -1);

        nextSmaller(heights);
        prevSmaller(heights);

        int ans = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {

            int height = heights[i];
            int width = next[i] - prev[i] - 1;

            ans = Math.max(ans, height * width);
        }

        return ans;
    }
}