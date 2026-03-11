class Solution {
    public int maxLen(int[] arr) {
        // Your code here
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        int ans = 0, pSum = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == 0) {
                pSum -= 1;
            } else {
                pSum += 1;
            }
            // System.out.print(pSum+" ");
            if(pSum == 0) {
                ans = i+1;
            }
            if(map.containsKey(pSum)) {
                ans = Math.max(ans, i - map.get(pSum));
            } else {
                map.put(pSum, i);
            }
        }
        return ans;
    }
}