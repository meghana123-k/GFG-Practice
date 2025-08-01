class Solution {
    public Queue<Integer> reverseFirstK(Queue<Integer> q, int k) {
        // code here
        if(k > q.size()) return q;
        Stack<Integer> stk = new Stack<>();
        int n = q.size()- k;
        int i = 1;
        while(i <= k) {
            stk.push(q.poll());
            i++;
        }
        while(!stk.isEmpty()) {
            q.add(stk.pop());
        }
     
        while(n-- > 0) {
            q.add(q.poll());
        }
        return q;
    }
}