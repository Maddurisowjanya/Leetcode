class Solution {
    private int solve(String s) {
        int h = Integer.parseInt(s.substring(0, 2));
        int m = Integer.parseInt(s.substring(3, 5));
        int sec = Integer.parseInt(s.substring(6, 8));

        return h * 3600 + m * 60 + sec;
    }

    public int secondsBetweenTimes(String startTime, String endTime) {
        return solve(endTime) - solve(startTime);
    }
}