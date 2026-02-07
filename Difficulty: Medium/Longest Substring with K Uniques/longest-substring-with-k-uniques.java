class Solution {
    public int longestKSubstr(String s, int k) {
        int left = 0, right = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        int max = -1;
        
        while(right < s.length()) {
            map.put(s.charAt(right), map.getOrDefault(s.charAt(right), 0) + 1);
            if(map.size() > k) {
                while(map.size() > k) {
                    map.put(s.charAt(left), map.get(s.charAt(left)) - 1);
                    if(map.get(s.charAt(left)) == 0) {
                        map.remove(s.charAt(left));
                    }
                   left++;
                }
            }
            if(map.size() == k) {
                max = Math.max(max, right - left + 1);
            }
            right++;
        }
        return max;
    }
}