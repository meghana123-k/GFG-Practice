// User function Template for Java

class Solution {
    int[] dp;
    int helper(int[] a, int idx) {
        if(idx >= a.length) return 0;
        if(dp[idx] != -1) return dp[idx];
        int take = 0;
        if(idx < a.length) {
            take = a[idx] + helper(a, idx + 2);
        }
        int notTake = helper(a, idx + 1);
        return dp[idx] = Math.max(take, notTake);
    }
    int findMaxSum(int arr[]) {
        // code here
        int n = arr.length;
        dp = new int[n + 1];
        Arrays.fill(dp, -1);
        return helper(arr, 0);
    }
}