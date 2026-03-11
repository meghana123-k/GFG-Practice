// User function Template for Java

class Solution {
    // Function to convert the given string to Camel Case
    public String convertToCamelCase(String s) {
        // code here
        StringBuilder res = new StringBuilder();
        for(int i = 0; i < s.length(); i++) {
            if(i > 0 && Character.isLetter(s.charAt(i)) && s.charAt(i-1) == ' ') {
                res.append(Character.toUpperCase(s.charAt(i)));
            } else if(s.charAt(i) != ' '){
                res.append(s.charAt(i));
            }
        }
        return res.toString();
    }
}