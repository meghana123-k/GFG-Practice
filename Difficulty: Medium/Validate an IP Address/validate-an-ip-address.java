class Solution {
    public boolean isValid(String s) {
        // code here
        String[] str = s.split("\\.");
        if(str.length != 4) return false;
        for(String st : str) {
            if(st.length() == 0) return false;
            if(st.length() > 1) {
                if(st.charAt(0) == '0') return false;
            }
            int num = Integer.parseInt(st);
            if(num < 0 || num > 255) return false;
        }
        return true;
    }
}