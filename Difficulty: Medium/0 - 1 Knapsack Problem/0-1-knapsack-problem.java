class Solution {
    int[][] dp;
    public int helper(int w, int n, int val[], int wt[]) {
        if(n < 0 || w < 0) return 0;
        if(dp[n][w] != -1) return dp[n][w];
        int take = 0;
        int notTake = 0;
        if(wt[n] <= w) {
            take = val[n] + helper(w - wt[n], n-1, val, wt);
        }
        notTake = helper(w, n-1, val, wt);
        return dp[n][w] = Math.max(take, notTake);
    }
    public int helperTable(int w, int n, int val[], int wt[]) {
        int[] fn = new int[w+1];
        for(int j = 0; j < n; j++) {
            for(int i = w; i >= wt[j]; i--) {
                int take = 0;
                if(wt[j] <= i) {
                    take = val[j] + fn[i - wt[j]];
                }
                int notTake = fn[i];
                fn[i] = Math.max(take, notTake);
                // System.out.print(fn[i]+" ");
            }
            // System.out.println();
        }
        return fn[w];
    }
    public int knapsack(int w, int val[], int wt[]) {
        // code here
        int n = val.length;
        // dp = new int[n+1][w+1];
        // for(int[] row : dp) {
        //     Arrays.fill(row, -1);
        // }
        // return helper(w, n-1, val, wt);
        return helperTable(w, n, val, wt);
    }
}
