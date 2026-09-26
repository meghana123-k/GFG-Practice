class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        int max = -1, secmax = -1;
        for(int num: arr) {
            if(num > max) {
                secmax = max;
                max = num;
            } else if(num < max && secmax < num) {
                secmax = num;
            }
        }
        return secmax;
    }
}