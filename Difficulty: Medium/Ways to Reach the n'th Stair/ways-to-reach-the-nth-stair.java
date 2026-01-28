class Solution {
    int[] dp;
    int helper(int n) {
        if(n == 1 || n == 2) return n;
        if(dp[n] != -1) return dp[n];
        return dp[n] = helper(n-1) + helper(n-2);
    }
    int countWays(int n) {
        // your code here
        dp = new int[n+1];
        Arrays.fill(dp, -1);
        return helper(n);
    }
}
