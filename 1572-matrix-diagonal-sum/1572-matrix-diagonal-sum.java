class Solution {
    public int diagonalSum(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int ans = 0;
        for(int i=0; i<m; i++){
            ans += mat[i][i];
            if(i != n-i-1){
                ans += mat[i][n-i-1];
            }
        }
        return ans;
    }
}