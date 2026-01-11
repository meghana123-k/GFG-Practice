// User function Template for Java

class Solution {
    public int longestSubarray(int[] nums, int k) {
        // code here
        int n = nums.length;
        int ans = 0;
        int sum = 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        for(int i = 0; i < n; i++) {
            sum += nums[i];
            if(map.containsKey(sum - k)) {
                ans = Math.max(ans, i - map.get(sum - k));
            }
            map.putIfAbsent(sum, i);
        }
        return ans;
    }
}
