class Solution {
    public int[] arrayRankTransform(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int [] a = new int[arr.length];
        for(int i = 0; i < arr.length; i++){
            a[i] = arr[i];
        }
        Arrays.sort(a);
        int rank = 1;
        for(int num : a){
            if(!map.containsKey(num)){
                map.put(num,rank++);
            }
        }
        for(int i = 0; i < arr.length; i++){
            a[i] = map.get(arr[i]);
        }
        return a;
    }
}