class Solution {
    public ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> adj) {
        // code here
        Queue<Integer> que = new LinkedList<>();
        ArrayList<Integer> res = new ArrayList<>();
        boolean[] vis = new boolean[adj.size()+1];
        que.offer(0);
        vis[0] = true;
        while(!que.isEmpty()) {
            int node = que.poll();
            res.add(node);
            for(int nei: adj.get(node)) {
                if(!vis[nei]) {
                    que.offer(nei);
                    vis[nei] = true;
                }
            }
        }
        return res;
    }
}