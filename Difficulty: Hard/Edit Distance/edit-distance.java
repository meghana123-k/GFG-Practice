class Solution {
    int[][] dp;
    public int helper(String s1, String s2, int i, int j) {
        if(i < 0) return j+1;
        if(j < 0) return i+1;
        if(dp[i][j] != -1) return dp[i][j];
        if(s1.charAt(i) == s2.charAt(j)) {
            return dp[i][j] = helper(s1, s2, i-1, j-1);
        } else {
            int insert = helper(s1, s2, i, j-1);
            int remove = helper(s1, s2, i-1, j);
            int replace = helper(s1, s2, i-1, j-1);
            return dp[i][j] = 1 + Math.min(insert, Math.min(remove, replace));
        }
    }
    public int editDistance(String s1, String s2) {
        // Code here
        int n = s1.length();
        int m = s2.length();
        dp = new int[n+1][m+1];
        for(int[] row : dp) {
            Arrays.fill(row, -1);
        }
        return helper(s1, s2, s1.length()-1, s2.length()-1);
    }
}