// User function Template for Java
class Solution {
    public int helper(String s, int idx) {
        if(idx >= s.length()) { return 1; }
        if(s.charAt(idx) == '0') return 0;
        int notTake = helper(s, idx + 1);
        int take = 0;
        if(idx + 1 < s.length()) {
            int sub = Integer.parseInt(s.substring(idx, idx + 2));
            if(sub >= 10 && sub <= 26) {
                take = helper(s, idx + 2);
            }
        }
        return take + notTake;
    }
    public int countWays(String d) {
        // code here
        int n = d.length();
        if(n == 0) return 0;
        if(n == 1) {
            if(d.charAt(0) == '0') return 0;
            else return 1;
        }
        int dp[] = new int[n];
        if(d.charAt(0) == '0') {
            return 0;
        }
        dp[0] = 1;
        int f = Integer.parseInt(d.substring(0, 2));
        if(d.charAt(1) == '0') {
            dp[1] = 0;
        } else {
            dp[1] = 1;
        }
        if(f >= 10 && f <= 26) {
            dp[1] += 1;
        }
        for(int i = 2; i < n; i++) {
            int notTake = 0;
            if(d.charAt(i) != '0') { 
                notTake = dp[i - 1];
            }
            int take = 0;
            int sub = Integer.parseInt(d.substring(i - 1, i + 1));
            if(sub >= 10 && sub <= 26) {
                take = dp[i - 2];
            }
            dp[i] = take + notTake;
        }
        return dp[n-1];
        // return helper(d, 0);
    }
}