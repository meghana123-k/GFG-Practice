class Solution {
    public char getMaxOccuringChar(String s) {
        // code here
        HashMap<Character, Integer> map = new HashMap<>();
        int freq = 0;
        for(char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0)+1);
        }
        char ans = ' ';
        for(char ch: s.toCharArray()) {
            if(freq < map.get(ch)) {
                freq = map.get(ch);
                ans = ch;
            } else if(freq == map.get(ch)) {
                if(ans - 'a' > ch - 'a') {
                    ans = ch;
                }
            }
        }
        return ans;
    }
}