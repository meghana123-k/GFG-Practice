class Solution {
    public int helper(int W, int val[], int wt[], int idx) {
        if(idx >= val.length) return 0;
        int notTake = helper(W, val, wt, idx + 1);
        int take = 0;
        if(W >= wt[idx]) {
            take = val[idx] + helper(W - wt[idx], val, wt, idx + 1);
        }
        return Math.max(notTake, take);
    }
    public int knapsack(int W, int val[], int wt[]) {
        int n = val.length;
        int[][] dp = new int[n+1][W+1];
    
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= W; j++) {
                int notTake = dp[i-1][j];
                int take = 0;
                if(wt[i-1] <= j) {
                    take = val[i-1] + dp[i-1][j - wt[i-1]];
                }
                dp[i][j] = Math.max(notTake, take);
            }
        }
        return dp[n][W];
        // return helper(W, val, wt, 0);
        
    }
}
