class A {
    int x, y;
    A(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
class Solution {
    
    public int activitySelection(int[] start, int[] finish) {
        // code here
        A act[] = new A[start.length];
        for(int i = 0; i < start.length; i++) {
            act[i] = new A(start[i], finish[i]);
        }
        Arrays.sort(act, (p1, p2) ->Integer.compare(p1.y, p2.y));
        int fin = act[0].y;
        int cnt = 1;
        for(int i = 1; i < start.length; i++) {
            if(act[i].x > fin) {
                cnt++;
                fin = act[i].y;
            }
        }
        return cnt;
    }
}
