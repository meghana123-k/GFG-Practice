class Solution {
    int[][] dp;
    public int helper(int[] arr, int sum, int idx) {
        if(idx == arr.length) {
            if(sum == 0) return 1;
            else return 0;
        }
        if(dp[idx][sum] != -1) return dp[idx][sum];
        int notTake = helper(arr, sum, idx + 1);
        int take = 0;
        if(sum >= arr[idx]) {
            take = helper(arr, sum - arr[idx], idx + 1);
        }
        return dp[idx][sum] = take + notTake;
    }
    public int countPartitions(int[] arr, int diff) {
        // code here
        int n = arr.length;
        int sum = 0;
        for(int num : arr) {
            sum += num;
        }
        int subsetSum = (sum + diff) / 2;
        if(Math.abs(diff) > sum || (sum + diff) % 2 != 0) return 0;
        dp = new int[n+1][subsetSum+1];
        for(int row[] : dp) { Arrays.fill(row, -1); }
        
        return helper(arr , subsetSum, 0);
    }
}
