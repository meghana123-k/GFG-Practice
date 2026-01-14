class Solution {
    int maxSubarraySum(int[] arr) {
        // Code here
        int ans = arr[0];
        int sum = 0;
        for(int i = 0; i < arr.length; i++) {
            sum += arr[i];
            ans = Math.max(ans, sum);
            if(sum < 0) sum = 0;
        }
        return ans;
    }
}
