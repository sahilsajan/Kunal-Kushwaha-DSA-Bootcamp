//leetcode question 1572
class Solution {
    public int diagonalSum(int[][] mat) {
        int sum = 0;
        for(int i = 0; i < mat.length; i++){
            sum += mat[i][i];
        }
        int j = mat.length - 1;
        for(int i = 0; i < mat.length; i++){
            sum += mat[i][j];
            j--;
        }
        int center = (int)Math.floor(mat.length / 2);
        if(mat.length % 2 != 0){
           sum -= mat[center][center]; 
        }
        return sum;
    }
}
