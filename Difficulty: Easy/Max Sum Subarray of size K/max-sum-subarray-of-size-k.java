class Solution {
    public int maxSubarraySum(int[] arr, int k) {
        // Code here
        int n = arr.length;
        int left = 0, right = 0;
        int max = 0;
        int sum = 0;
        while(right < n) {
            sum += arr[right];
            int len = right - left + 1;
            if(len == k) {
                max = Math.max(max, sum);
                sum -= arr[left];
                left++;
            }
            right++;
        }
        return max;
    }
}