class Solution {
    static int[][] dp;
    static boolean helper(int[] a, int k, int idx) {
        if(k == 0) return true;
        if(idx < 0) return false;
        if(dp[idx][k] != -1) { return (dp[idx][k] == 0) ?  false :  true; }
        boolean take = false;
        if(a[idx] <= k) {
            take = helper(a, k - a[idx], idx-1);
        }
        boolean notTake = helper(a, k, idx-1);
        boolean ans = take || notTake;
        if(ans) {
            dp[idx][k] = 1;
        } else {
            dp[idx][k] = 0;
        }
        return ans;
    }
    static boolean equalPartition(int arr[]) {
        // code here
        int sum = 0;
        int n = arr.length;
        for(int num : arr) {
            sum += num;
        }
        if(sum % 2 != 0) return false;
        dp = new int[n+1][(sum/2)+1];
        for(int[] row : dp) {
            
            Arrays.fill(row, -1);
        }
        if(helper(arr, sum/2, n-1)) return true;
        return false;
    }
}