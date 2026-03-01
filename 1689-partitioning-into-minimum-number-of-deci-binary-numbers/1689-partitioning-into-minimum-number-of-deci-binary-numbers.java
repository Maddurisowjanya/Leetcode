class Solution {
    public int minPartitions(String n) {
        for (char i = '9'; i >= '1'; i--) {
            if (n.indexOf(i) != -1) {
                return i - '0';
            }
        }
        return 0;
    }
}