class Solution {
    class Pair {
        int x;
        int y;
        Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
    public int activitySelection(int[] start, int[] end) {
         Pair arr[] = new Pair[start.length];
        for(int i = 0; i < start.length; i++) {
            arr[i] = new Pair(start[i], end[i]);
        }
        Arrays.sort(arr, (p1, p2) -> Integer.compare(p1.y, p2.y));
        int cnt = 1;
        int fin = arr[0].y;
        for(int i = 1; i < start.length; i++) {
            if(arr[i].x > fin) {
                cnt++;
                fin = arr[i].y;
            }
        }
        return cnt;
    }
}
