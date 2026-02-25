class Solution {
    public int countLargestGroup(int n) {
        HashMap<Integer , Integer> map = new HashMap<>();
        int max = 0;
        for(int i = 1; i <= n; i++){
            int sum = digitSum(i);
            map.put(sum, map.getOrDefault(sum,0)+1);
            max = Math.max(max, map.get(sum));
        }
        int count = 0;
        for(int key:map.keySet()){
            if(map.get(key)==max){
                count++;
            }
        }
        return count;
    }
    private int digitSum(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}