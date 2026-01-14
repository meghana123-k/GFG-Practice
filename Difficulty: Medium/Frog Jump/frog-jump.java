class Solution {
    int[] dp;
    int helper(int[] a, int n) {
        if(n == 0) return 0;
        if(dp[n] != -1) return dp[n];
        int next = helper(a, n-1) + Math.abs(a[n] - a[n-1]);
        int nextNext = Integer.MAX_VALUE;
        if(n > 1) nextNext = helper(a, n-2) + Math.abs(a[n] - a[n-2]);
        return dp[n] = Math.min(next, nextNext);
    }
    int minCost(int[] height) {
        // code here
        int n = height.length;
        dp = new int[n+1];
        Arrays.fill(dp, -1);
        return helper(height, n-1);
    }
}