class Solution {
    public int longestKSubstr(String s, int k) {
        // code here
        HashMap<Character, Integer> map = new HashMap<>();
        int ans = -1;
        int left = 0;
        for(int right = 0; right < s.length(); right++) {
            map.put(s.charAt(right), map.getOrDefault(s.charAt(right), 0) +1);
            while(left < s.length() && map.size() > k) {
                map.put(s.charAt(left), map.get(s.charAt(left))-1);
                if(map.get(s.charAt(left)) == 0) {
                    map.remove(s.charAt(left));
                }
                left++;
            }
            if(map.size() == k) {
                ans = Math.max(ans, right-left+1);
            }
        }
        return ans;
    }
}