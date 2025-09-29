class Solution {
    public int minScoreTriangulation(int[] values) {
        int n = values.length;
        int[][] dp = new int[n][n];
        for (int i = n - 1; i >= 0; --i) {
            for (int j = i + 1; j < n; ++j) {
                for (int k = i + 1; k < j; ++k) {
                    dp[i][j] = Math.min(dp[i][j] == 0 ? Integer.MAX_VALUE : dp[i][j],dp[i][k] + values[i] * values[k] * values[j] + dp[k][j]);
                }
            }
        }
        return dp[0][n - 1];
      //  dp(0,1,2)=3*7*4=84;
      //dp(0,2,3)=3*4*5=60;
      // t=144;

    }
}