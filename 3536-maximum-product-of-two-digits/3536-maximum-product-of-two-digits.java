class Solution {
    public int maxProduct(int n) {
        int largest = Integer.MIN_VALUE;
        int secondlargest = Integer.MIN_VALUE;
        while(n > 0){
            int digit = n % 10;
            if(digit > largest){
                secondlargest = largest;
                largest = digit;
            }else if(digit >= secondlargest){
                secondlargest = digit;
            }
            n = n / 10;
        }
        return largest * secondlargest;
    }
}