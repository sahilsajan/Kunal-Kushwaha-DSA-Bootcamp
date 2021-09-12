//leetcode question 1572
class Solution {
    public int[][] transpose(int[][] matrix) {
        int[][] ans = new int[matrix[0].length][matrix.length];
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                int number = matrix[i][j];
                ans[j][i] = number;
            }
        }
        return ans;
    }
}
