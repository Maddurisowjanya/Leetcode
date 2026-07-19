class Solution {
    public boolean squareIsWhite(String coordinates) {
        int col = coordinates.charAt(0) - 'a' + 1;
        int row = coordinates.charAt(1) - '0';
        if(row % 2 != 0 && col % 2 != 0){
            return false;
        }if(row % 2 == 0 && col % 2 == 0){
            return false;
        }else{
            return true;
        }
    }
}