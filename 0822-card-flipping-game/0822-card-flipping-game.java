class Solution {
    public int flipgame(int[] fronts, int[] backs) {
        Set<Integer> set = new HashSet<>();
        int n = fronts.length;
        for(int i = 0; i < n; i++){
            if(fronts[i] == backs[i]){
                set.add(fronts[i]);
            }
        }
        int good = Integer.MAX_VALUE;
        for(int i = 0; i < n; i++){
            if(!set.contains(fronts[i])){
                good = Math.min(good,fronts[i]);
            }
            if(!set.contains(backs[i])){
                good = Math.min(good,backs[i]);
            }
        }
        return good == Integer.MAX_VALUE ? 0:good;
    }
}