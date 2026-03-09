class Solution {
    public int longestUniqueSubstr(String s) {
        // code here
        Set<Character> set = new HashSet<>();
        int ans = 0, left = 0;
        for(int right = 0; right < s.length(); right++) {
            char ch = s.charAt(right);
            while(set.contains(ch)) {
                set.remove(s.charAt(left));
                left++;
            }
            set.add(ch);
            //System.out.println(right - left + 1);
            ans = Math.max(ans, right - left + 1);
        }
        return ans;
    }
}