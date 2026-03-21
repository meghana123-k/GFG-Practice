class Solution {
    public int minRemoval(int intervals[][]) {
        // code here
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[1], b[1]));
        int cnt = 0;
        int fin = intervals[0][1];
        for(int i = 1; i < intervals.length; i++) {
            if(intervals[i][0] < fin) {
                cnt++;
            } else {
                fin = intervals[i][1];
            }
        }
        return cnt;
    }
}
